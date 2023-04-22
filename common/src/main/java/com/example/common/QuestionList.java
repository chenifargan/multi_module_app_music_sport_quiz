package com.example.common;

public class QuestionList {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    private String answer;
    private String userSelected;

    public QuestionList( ) {

    }

    public QuestionList(String question, String option1, String option2, String option3, String option4, String answer, String userSelected) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer=answer;
        this.userSelected=userSelected;
    }

    public String getAnswer() {
        return answer;
    }

    public QuestionList setAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    public String getUserSelected() {
        return userSelected;
    }

    public QuestionList setUserSelected(String userSelected) {
        this.userSelected = userSelected;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public QuestionList setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getOption1() {
        return option1;
    }

    public QuestionList setOption1(String option1) {
        this.option1 = option1;
        return this;
    }

    public String getOption2() {
        return option2;
    }

    public QuestionList setOption2(String option2) {
        this.option2 = option2;
        return this;
    }

    public String getOption3() {
        return option3;
    }

    public QuestionList setOption3(String option3) {
        this.option3 = option3;
        return this;
    }

    public String getOption4() {
        return option4;
    }

    public QuestionList setOption4(String option4) {
        this.option4 = option4;
        return this;
    }


}
