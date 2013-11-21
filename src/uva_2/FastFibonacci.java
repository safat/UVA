/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.math.*;
import java.util.Scanner;
//uva 495
public class FastFibonacci {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        BigInteger[] answers = new BigInteger[5002];
        answers[0] = BigInteger.ZERO;
        answers[1] = BigInteger.ONE;
        for (int i = 2; i < 5001; i++) {
            answers[i] = answers[i - 2].add(answers[i - 1]);
        }
        while (input.hasNext()) {
            n = input.nextInt();
            System.out.println("The Fibonacci number for " + n + " is " + answers[n]);
        }
    } // end of main
} // end of class
