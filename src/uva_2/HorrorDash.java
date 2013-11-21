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
public class HorrorDash {
//uva 11799

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= caseCount; i++) {
            int n = input.nextInt();
            int max = Integer.MIN_VALUE;
            int speeds[] = new int[n];
            for (int j = 0; j < n; j++) {
                speeds[j] = input.nextInt();
                if (speeds[j] > max) {
                    max = speeds[j];
                }
            }
            System.out.println("Case " + i + ": " + max);

        }
        // TODO code application logic here
    }
}
