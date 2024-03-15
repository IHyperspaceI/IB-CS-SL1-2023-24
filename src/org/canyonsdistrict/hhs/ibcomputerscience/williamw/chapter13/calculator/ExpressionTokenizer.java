package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13.calculator;

public class ExpressionTokenizer {
    private String expression;
    private int start;
    private int end;

    public ExpressionTokenizer(String expression) {
        this.expression = expression;
        start = 0;
        end = 0;
        nextToken();
    }

    public String peek() {
        if (start >= expression.length()) {
            return null;
        }
        return expression.substring(start, end);
    }

    public String nextToken() {
        var r = peek();
        start = end;

        if (start >= expression.length()) {
            return r;
        }

        if (Character.isDigit(expression.charAt(start))) {
            end = start + 1;

            while (end < expression.length() && Character.isDigit(expression.charAt(end))) {
                end++;
            }
        } else {
            end = start + 1;
        }

        return r;
    }
}
