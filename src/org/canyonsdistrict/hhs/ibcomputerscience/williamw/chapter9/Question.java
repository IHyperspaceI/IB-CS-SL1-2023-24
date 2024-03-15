package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter9;

import java.util.Objects;

public class Question {
    private String answer;
    private String questionText;
    protected int questionNumber;

    /*
    public Question() {
        this.answer = "";
        this.questionText = "";
        this.questionNumber = 1;
    }*/

    public Question(String question, String answer) {
        this.answer = answer;
        this.questionText = question;
        this.questionNumber = 1;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestionText(String text) {
        this.questionText = text;
    }

    public void setQuestionNumber(int number) {
        this.questionNumber = number;
    }

    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(answer);
    }

    public String getQuestion() {
        return questionText;
    }

    public String toString() {
        return String.format("""
                Question: %s
                """, questionText);
    }

    public boolean equals(Object o) {
        if (o instanceof Question) {
            Question q = (Question) o;

            return q.questionText.equals(this.questionText) && q.answer.equals(this.answer);
        } else {
            return false;
        }
    }
}
