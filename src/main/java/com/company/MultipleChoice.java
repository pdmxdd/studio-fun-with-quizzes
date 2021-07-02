package com.company;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private String correctAnswer;
    private ArrayList<String> answerOptions;

    public boolean checkAnswer(String userAnswerText) {
        return userAnswerText.equals(this.correctAnswer);
    }

    public String getQuestionAndAnswerOptions() {
        String questionAndAnswerOptions = "";
        int i = 1;
        questionAndAnswerOptions += this.getQuestion() + "\n";
        for(String answerOption : answerOptions) {
            questionAndAnswerOptions += i + ". " + answerOption + "\n";
            i++;
        }
        return questionAndAnswerOptions;
    }

    public MultipleChoice(String question, String correctAnswer, ArrayList<String> answerOptions) {
        super(question);
        this.correctAnswer = correctAnswer;
        this.answerOptions = answerOptions;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions) {
        this.answerOptions = answerOptions;
    }
}
