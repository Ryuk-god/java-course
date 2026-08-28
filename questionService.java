import java.util.Scanner;
public class questionService {

    question[] questions = new question[5];

    java.lang.String[] selection = new java.lang.String[5];

    // ...

    public void playQuiz() {

        Scanner sc = new Scanner(System.in);

        int i = 0;

        for (question q : questions) {

            System.out.println(q.getQuestion());

            System.out.println("option 1: " + q.getOpt1());
            System.out.println("option 2: " + q.getOpt2());
            System.out.println("option 3: " + q.getOpt3());
            System.out.println("option 4: " + q.getOpt4());

            selection[i++] = sc.nextLine();

            System.out.println();
        }

        for (java.lang.String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            question que = questions[i];

            java.lang.String actualanswer = que.getAnswer();
            java.lang.String useranswer = selection[i];

            if (useranswer.equals(actualanswer)) {
                score++;
            }
        }

        System.out.println("how many answer you gave correct : " + score);
    }
}