/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
// uva 11332

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SummingDigit {

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
            int sumDigit = 100;
            while (true) {
                if (sumDigit < 10) {
                    break;
                }
                sumDigit = 0;
                while (n != 0) {
                    sumDigit += (n % 10);
                    n /= 10;
                }
                n = sumDigit;
              
            }

            System.out.println(sumDigit);
        }
        // TODO code application logic here
    }
}
