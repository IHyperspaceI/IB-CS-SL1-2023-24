package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter9;

import java.util.ArrayList;
import java.util.List;

public class ChoiceQuestion extends Question {
    private List<String> choices;

    public ChoiceQuestion( String answer, String question) {
        super(question, answer);
        choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct){
            setAnswer(choice);
        }
    }

    public void setQuestionNumber(int number) {

    }

    public String getQuestion() {
        var question = super.getQuestion();

        for (var choice : choices) {
            question += "\n" + choice;
        }

        return question;
    }

    @Override
    public String toString() {
        String formattedChoices = "";
        for (var choice : choices) {
            formattedChoices += choice + "\n";
        }
        return super.getQuestion() +
                "\n" + formattedChoices;
    }
}
