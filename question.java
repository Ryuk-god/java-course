public class question {

    private int id;

    private java.lang.String question;
    private java.lang.String opt1;
    private java.lang.String opt2;
    private java.lang.String opt3;
    private java.lang.String opt4;
    private java.lang.String answer;

    public int getId() {
        return id;
    }

    public question(
            int id,
            java.lang.String question,
            java.lang.String opt1,
            java.lang.String opt2,
            java.lang.String opt3,
            java.lang.String opt4,
            java.lang.String answer) {

        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    public question(java.lang.String answer) {
        this.answer = answer;
    }

    public java.lang.String getAnswer() {
        return answer;
    }

    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getQuestion() {
        return question;
    }

    public void setQuestion(java.lang.String question) {
        this.question = question;
    }

    public java.lang.String getOpt1() {
        return opt1;
    }

    public void setOpt1(java.lang.String opt1) {
        this.opt1 = opt1;
    }

    public java.lang.String getOpt2() {
        return opt2;
    }

    public void setOpt2(java.lang.String opt2) {
        this.opt2 = opt2;
    }

    public java.lang.String getOpt3() {
        return opt3;
    }

    public void setOpt3(java.lang.String opt3) {
        this.opt3 = opt3;
    }

    public java.lang.String getOpt4() {
        return opt4;
    }

    public void setOpt4(java.lang.String opt4) {
        this.opt4 = opt4;
    }

    @Override
    public java.lang.String toString() {
        return "question [id=" + id
                + ", question=" + question
                + ", opt1=" + opt1
                + ", opt2=" + opt2
                + ", opt3=" + opt3
                + ", opt4=" + opt4
                + ", answer=" + answer + "]";
    }
}