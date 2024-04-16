package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter15;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class AlgebraicCalculator {
    static Set<String> operators;
    // Static initialization block
    static {
        operators = new HashSet<>();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
    }

    /*
        if value is a number
            push it on the stack
        else if value is (
            push on operator stack
        else if we have an operator
            while the top of the operator stack
            has a higher precedence than the operator
                evaluate the top
            push the operator on the stack
        else if value is )
            while top of stack is not (
                evaluate the top
            pop ( off the stack
     */


    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var numberStack = new Stack<Integer>();
        var operatorStack = new Stack<String>();

        System.out.println("Enter an algebraic expression (space as separators): ");

        while (in.hasNext()) {
            var input = in.next();
            if (input.matches("[0-9]+")) {
                numberStack.push(Integer.parseInt(input));
            } else if ("(".equals(input)) {
                operatorStack.push(input);
            } else if (operators.contains(input)) {
                var topOStack = operatorStack.peek();
                while (
                        (topOStack.equals("/") || topOStack.equals("*")) &&
                                (input.equals("+") || input.equals("-"))) {
                    var firstNumber = numberStack.pop();
                    var nextNumber = Integer.parseInt(in.next());

                    int result = topOStack.equals("*")
                            ? firstNumber * nextNumber
                            : firstNumber / nextNumber;
                    numberStack.push(result);
                }
                operatorStack.push(input);
            } else if (")".equals(input)) {
                var operator = operatorStack.peek();

                while (!operator.equals("(")) {
                    var firstNumber = numberStack.pop();
                    var secondNumber = numberStack.pop();
                    operator = operatorStack.pop();

                    evaluator(operator, firstNumber, secondNumber, numberStack);
                    operator = operatorStack.peek();
                }
                operatorStack.pop(); // Discard (
            }
        }

        while (!operatorStack.isEmpty()) {
            var firstNumber = numberStack.pop();
            var secondNumber = numberStack.pop();
            var operator = operatorStack.pop();

            evaluator(operator, firstNumber, secondNumber, numberStack);
        }

        System.out.println(numberStack);
    }

    private static void evaluator(String operator, Integer firstNumber, Integer secondNumber, Stack<Integer> numberStack) {
        int result = switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> throw new IllegalArgumentException("Bad operator");
        };

        numberStack.push(result);
    }
}
