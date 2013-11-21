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
public class DigitCounting {

    /**
     * @param args the command line arguments
     */
    //uva 1225
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        String dummy = input.nextLine();
        while (caseCount-- > 0) {
            int limit = input.nextInt();
            int digitFrequency[] = new int[10];
            int n;
            for (int i = 0; i <= limit; i++) {
                n = i;
                while (n != 0) {
                    digitFrequency[n % 10]++;
                    n /= 10;
                }
            }
            for (int i = 0; i < 9; i++) {
                System.out.print(digitFrequency[i] + " ");
            }
            System.out.print(digitFrequency[9]);
            System.out.println();
        }
        // TODO code application logic here
    }
}
