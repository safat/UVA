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
public class NestedBracket {
//uva 551

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String expression = input.nextLine();
            Stack<Character> bracketStack = new Stack();
            int len = expression.length();
            int index = -1;
            int eIndex = -1;
            int i = 0;
            char ch;
            boolean[] leftParenthesisPopped = new boolean[len];
            for (i = 0; i < len; i++) {
                //   System.out.println(expression.charAt(i));
                if (expression.charAt(i) == '*') {
                    if ((i + 1) < len && expression.charAt(i + 1) == ')') {
                        if (bracketStack.isEmpty()) {
                            index = i;
                            break;
                        }
                        char prev = bracketStack.peek();
                        //          System.out.println("first peek for *) " + prev);
                        while (!bracketStack.isEmpty() && (bracketStack.peek() != '(')) {
                            prev = bracketStack.pop();
                            if (prev == '<' || prev == '(' || prev == '{' || prev == '[') {
                                eIndex = len;
                                //    break;
                            }
                            //           System.out.println("in section *)  popped " + prev);
                        }
                        if (!bracketStack.isEmpty() && prev == '*') {
                            bracketStack.pop();
                            i += 1;
                        } else {
                            index = i;
                            break;
                        }
                    } else {
                        bracketStack.push(expression.charAt(i));
                    }
                } else if (expression.charAt(i) == ')') {
                    if (bracketStack.isEmpty()) {
                        index = i;
                        break;
                    }
                    char prev = bracketStack.peek();
                    //   System.out.println("prev for ) "+prev);
                    while (!bracketStack.isEmpty() && (bracketStack.peek() != '(')) {
                        //     System.out.println("now in ) section going to pop "+bracketStack.peek());
                        char tmp = bracketStack.pop();
                        if (tmp == '<' || tmp == '(' || tmp == '{' || tmp == '[') {
                            eIndex = len;;
                            // break;
                        }
                    }
                    if (bracketStack.isEmpty()) {
                        index = i;
                        break;
                    } else {
                        bracketStack.pop();
                    }
                } else if (expression.charAt(i) == '>') {
                    if (bracketStack.isEmpty()) {
                        index = i;
                        break;
                    }
                    char prev = bracketStack.peek();
                    while (!bracketStack.isEmpty() && (bracketStack.peek() != '<')) {
                        char tmp = bracketStack.pop();
                        if (tmp == '<' || tmp == '(' || tmp == '{' || tmp == '[') {
                            eIndex = len;
                            //  break;
                        }
                    }
                    if (bracketStack.isEmpty()) {
                        index = i;
                        break;
                    } else {
                        bracketStack.pop();
                    }
                } else if (expression.charAt(i) == ']') {
                    if (bracketStack.isEmpty()) {
                        index = i;
                        break;
                    }
                    char prev = bracketStack.peek();
                    while (!bracketStack.isEmpty() && (bracketStack.peek() != '[')) {
                        char tmp = bracketStack.pop();
                        if (tmp == '<' || tmp == '(' || tmp == '{' || tmp == '[') {
                            eIndex = len;
                            //  break;
                        }
                    }
                    if (bracketStack.isEmpty()) {
                        index = i;
                        break;
                    } else {
                        bracketStack.pop();
                    }
                } else if (expression.charAt(i) == '}') {
                    if (bracketStack.isEmpty()) {
                        index = i;
                        break;
                    }
                    char prev = bracketStack.peek();
                    while (!bracketStack.isEmpty() && (bracketStack.peek() != '{')) {
                        char tmp = bracketStack.pop();
                        if (tmp == '<' || tmp == '(' || tmp == '{' || tmp == '[') {
                            eIndex = len;
                            //    break;
                        }
                    }
                    if (bracketStack.isEmpty()) {
                        index = i;
                        break;
                    } else {
                        bracketStack.pop();
                    }
                } else {

                    bracketStack.push(expression.charAt(i));
                }
            }
            for (Character tmp : bracketStack) {
                if (tmp == '<' || tmp == '(' || tmp == '{' || tmp == '[') {
                    eIndex = len;
                    break;
                    //    break;
                }
            }
            // System.out.println(bracketStack.size());

            if (index < 0 && bracketStack.isEmpty()) {
                System.out.println("YES");
            } else {
                if (index < eIndex) {
                    index = eIndex;
                }
                for (int k = 0; k < index - 1; k++) {
                    if (((expression.charAt(k) == '(' || expression.charAt(k) == ')') && expression.charAt(k + 1) == '*') || (expression.charAt(k) == '*' && (expression.charAt(k + 1) == '(' || expression.charAt(k + 1) == ')'))) {
                        index -= 1;
                        k += 1;
                    }
                }
                System.out.println("NO " + (index));
            }
        }
        // TODO code application logic here
    }
}
