package com.company;

public abstract class Question {
    private String question;

    public abstract String getQuestionAndAnswerOptions();

    public abstract boolean checkAnswer(String userAnswerText);

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
}
