/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class GuessingGame {
//uva 10530

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(input.nextLine());
            if (n == 0) {
                break;
            }
            int start = 1;
            int end = 10;
            String guessVerdict = "";
            while (true) {
                guessVerdict = input.nextLine();
                if (guessVerdict.endsWith("right on")) {
                    if (n >= start && n <= end) {
                        System.out.println("Stan may be honest");
                        break;
                    } else {
                        System.out.println("Stan is dishonest");
                        break;
                    }
                } else {
                    if (guessVerdict.endsWith("too high")) {
                        if ((n - 1) < end) {
                            end = n - 1;
                        }
                    } else if (guessVerdict.endsWith("too low")) {
                        if ((n + 1) > start) {
                            start = n + 1;
                        }
                    }

                    n = Integer.parseInt(input.nextLine());
                    if (n == 0) {
                        break;
                    }
                }
            }

        }
        // TODO code application logic here
    }
}
