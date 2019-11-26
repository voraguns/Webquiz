package model;

public class Quiz {

    private int quizid;
    private String question;
    private String choicea;
    private String choiceb;
    private String choicec;
    private String choiced;
    private String answer;
    public int subjectid;

    public Quiz() {
    }

    public Quiz(int quizid, String question, String choicea, String choiceb, String choicec, String choiced, String answer, int subjectid) {
        this.quizid = quizid;
        this.question = question;
        this.choicea = choicea;
        this.choiceb = choiceb;
        this.choicec = choicec;
        this.choiced = choiced;
        this.answer = answer;
        this.subjectid = subjectid;
    }

    public Quiz(int quizid) {
        this.quizid = quizid;
    }

    public Quiz(String question, String choicea, String choiceb, String choicec, String choiced, String answer) {
        
        this.question = question;
        this.choicea = choicea;
        this.choiceb = choiceb;
        this.choicec = choicec;
        this.choiced = choiced;
        this.answer = answer;
    }

    public int getQuizid() {
        return quizid;
    }

    public void setQuizid(int quizid) {
        this.quizid = quizid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoicea() {
        return choicea;
    }

    public void setChoicea(String choicea) {
        this.choicea = choicea;
    }

    public String getChoiceb() {
        return choiceb;
    }

    public void setChoiceb(String choiceb) {
        this.choiceb = choiceb;
    }

    public String getChoicec() {
        return choicec;
    }

    public void setChoicec(String choicec) {
        this.choicec = choicec;
    }

    public String getChoiced() {
        return choiced;
    }

    public void setChoiced(String choiced) {
        this.choiced = choiced;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    @Override
    public String toString() {
        return "Quiz{" + "quizid=" + quizid + ", question=" + question + ", choicea=" + choicea + ", choiceb=" + choiceb + ", choicec=" + choicec + ", choiced=" + choiced + ", answer=" + answer + ", subjectid=" + subjectid + '}';
    }

    

}