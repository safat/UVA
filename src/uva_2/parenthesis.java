/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author user
 */
public class parenthesis {
//uva 673

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        String dummy = input.nextLine();

        while (caseCount-- > 0) {
            String expression = input.nextLine();
            Stack<Character> parenthesisStack = new Stack();
            boolean balancedExpression = true;
            int len = expression.length();
            for (int i = 0; i < len; i++) {
                if (expression.charAt(i) == '[' || expression.charAt(i) == '(') {
                    parenthesisStack.push(expression.charAt(i));
                } else if (expression.charAt(i) == ']') {
                    if (!parenthesisStack.isEmpty() && parenthesisStack.peek() == '[') {
                        parenthesisStack.pop();
                    } else {
                        balancedExpression = false;
                        break;
                    }
                } else if (expression.charAt(i) == ')') {
                    if (!parenthesisStack.isEmpty() && parenthesisStack.peek() == '(') {
                        parenthesisStack.pop();
                    } else {
                        balancedExpression = false;
                        break;
                    }
                }
            }

            if (balancedExpression && parenthesisStack.size() == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
        // TODO code application logic here
    }
}
