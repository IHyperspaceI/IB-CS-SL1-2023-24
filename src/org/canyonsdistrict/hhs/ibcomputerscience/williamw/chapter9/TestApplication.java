package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter9;

import java.awt.*;
import java.util.Scanner;

public class TestApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Question question = new Question( "What does BKN mean in a METAR?", "broken clouds");
        question.setQuestionNumber(1);


        Question questionCopy = new Question( "What does BKN mean in a METAR?", "broken clouds");

        System.out.println(question.equals(questionCopy));


        ChoiceQuestion choiceQuestion = new ChoiceQuestion("400'","How high can a sUAS fly without authorization in class G airspace?");
        //choiceQuestion.setQuestionText("How high can a sUAS fly without authorization in class G airspace?");
        choiceQuestion.addChoice("400'", true);
        choiceQuestion.addChoice("500'", false);
        choiceQuestion.addChoice("200'", false);
        choiceQuestion.addChoice("All sUAS require clearance to fly", false);

        askQuestion(question, in);

        //System.out.println(question);
        //System.out.println("\n" + choiceQuestion);
        askQuestion(choiceQuestion, in);
    }

    private static void askQuestion(Question question, Scanner in) {
        boolean correct;
        System.out.println(question);

        System.out.print("Your answer: ");
        String choiceResponse = in.nextLine();
        correct = question.checkAnswer(choiceResponse);
        if (correct) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }
    }
}
