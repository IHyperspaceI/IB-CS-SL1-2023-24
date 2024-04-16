package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter15;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {

    public static void main(String[] args) {
        /*
        if I read a number
            push number on the stack
        else if I read an operator
            pop two values off the stack
            combine the values with the operator
            push answer back on the stack
        else if there is not more input
            pop result and display it
         */


        var in = new Scanner(System.in);
        var stack = new Stack<Integer>();
        System.out.println("enter one number or operator per line or q to quit");
        boolean done = false;
        while (!done){
            var input = in.nextLine();
            if (input.equalsIgnoreCase("q")){
                done = true;
            } else if (input.equals("+")) {
                var first = stack.pop();//removes top
                var second = stack.pop();
                var result = first + second;
                stack.push(result);
            } else if (input.equals("-")) {
                stack.push(stack.pop() - stack.pop());
            } else if (input.equals("*")|| input.equalsIgnoreCase("x")) {
                stack.push(stack.pop() * stack.pop());
            } else if (input.equals("/")) {
                stack.push(stack.pop() / stack.pop());
            }else{
                var value = Integer.parseInt(input);
                stack.push(value);
            }
        }
        System.out.println(stack.pop());
    }
}
