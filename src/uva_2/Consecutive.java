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
public class Consecutive {
//uva 11254

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            long s = input.nextLong();
            if (s == -1) {
                break;
            }
            String dummy = input.nextLine();
            long a = 0, n;
            for (n = (int) Math.sqrt(2 * s); n > 0; n--) {
                if ((2 * s + n - n * n) % (2 * n) == 0) {
                    a = (2 * s + n - n * n) / (2 * n);
                    break;
                }
            }
            System.out.println(s + " = " + a + " + ... + " + (a + n - 1));
        }

    }
    // TODO code application logic here
}
