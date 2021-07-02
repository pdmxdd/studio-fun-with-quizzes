package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MultipleChoice questionOne = new MultipleChoice("What is 5 + 5?", "10", new ArrayList<String>(Arrays.asList(new String[] {"5", "15", "10", "0"})));
//        System.out.println(questionOne.getQuestion());
//        System.out.println(questionOne.getAnswerOptions());
//        System.out.println(questionOne.getCorrectAnswer());

        System.out.println(questionOne.getQuestionAndAnswerOptions());

        System.out.println(questionOne.checkAnswer("10"));
        System.out.println(questionOne.checkAnswer("15"));
    }
}
