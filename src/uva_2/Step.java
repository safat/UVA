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
public class Step {
//uva 846

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        String dummy = input.nextLine();
        while (testCases-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int count = 2;
            int diff = b - a;
            a += 1;
            b -= 1;
            if (diff <= 2) {
                System.out.println(diff);
            } else {
                diff = 2;
                while (true) {
                    if ((a + count) <= b) {
                        a += count;
                        diff++;
                    } else {
                        diff++;
                        break;
                    }
                    if (a == b) {
                        break;
                    }
                    if ((b - count) >= a) {
                        b -= count;
                        diff++;
                    } else {
                        diff++;
                        break;
                    }
                    if (a == b) {
                        break;
                    }
                    count++;
                }
                System.out.println(diff);
            }

        }
    }
}
