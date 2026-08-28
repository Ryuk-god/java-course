
import java.util.Scanner;

public class questionSerevice {
  question[] questions = new question[5];
  String[] selection = new String[5];

  public questionSerevice() {
    questions[0] = new question(
        1,
        "Which language is primarily used for Android development?",
        "Java",
        "HTML",
        "CSS",
        "SQL",
        "Java");

    questions[1] = new question(
        2,
        "Which keyword is used to inherit a class in Java?",
        "implements",
        "extends",
        "inherits",
        "super",
        "extends");

    questions[2] = new question(
        3,
        "Which data type is used to store true or false?",
        "int",
        "String",
        "boolean",
        "char",
        "boolean");

    questions[3] = new question(
        4,
        "Which method is the entry point of a Java program?",
        "start()",
        "run()",
        "main()",
        "execute()",
        "main()");

    questions[4] = new question(
        5,
        "Which symbol is used to end a statement in Java?",
        ".",
        ":",
        ";",
        ",",
        ";");
  }

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
    for (String s : selection) {
      System.out.println(s);
    } 
  }

  public void printScore(){
    int score=0;
    for(int i=0;i<questions.length;i++){
      question que=questions[i];
      String actualanswer = que.getAnswer();
      String useranswer = selection[i];
      if(useranswer.equals(actualanswer)){
        score++;
      }
    }
    System.out.println("how many answer you gave correct : "+score);
  }

}
