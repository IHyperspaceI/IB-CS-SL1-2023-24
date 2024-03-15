package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13.calculator;

public class Evaluator {
    private ExpressionTokenizer tokenizer;

    public Evaluator(String expression) {
        tokenizer = new ExpressionTokenizer(expression);
    }

    public int getExpressionValue() {
        int value = getTermValue();
        boolean done = false;

        while (!done) {
            var next = tokenizer.peek();

            if ("+".equals(next) || "-".equals(next)) {
                tokenizer.nextToken(); // Removes operator
                int value2 = getTermValue();

                if ("+".equals(next)) {
                    value = value + value2;
                } else {
                    value = value - value2;
                }
            } else {
                done = true;
            }
        }

        return value;
    }

    private int getTermValue() {
        int value = getFactorValue();
        boolean done = false;

        while (!done) {
            var next = tokenizer.peek();

            if ("*".equals(next) || "/".equals(next)) {
                tokenizer.nextToken(); // Removes the operator
                int value2 = getFactorValue();

                if ("*".equals(next)) {
                    value = value * value2;
                } else {
                    value = value / value2;
                }
            } else {
                done = true;
            }
        }

        return value;
    }

    private int getFactorValue() {
        int value;
        var nextToken = tokenizer.peek();

        if ("(".equals(nextToken)) {
            tokenizer.nextToken(); // Removes the (
            value = getExpressionValue();
            tokenizer.nextToken(); // Removes )
        } else {
            value = Integer.parseInt(tokenizer.nextToken());
        }

        return value;
    }
}
