/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 10684

import java.util.Scanner;

/**
 *
 * @author user
 */
public class jackpot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int betCount = input.nextInt();
            if (betCount == 0) {
                break;
            }
            String dummy = input.nextLine();
            int maxSum = 0;
            int currentBet;
            int maxSumSoFar = 0;
            while (betCount-- > 0) {
                currentBet = input.nextInt();
                maxSum += currentBet;
                if (maxSum < 0) {
                    maxSum = 0;
                } else {
                    if (maxSum > maxSumSoFar) {
                        maxSumSoFar = maxSum;
                    }
                }
            }
            if (maxSumSoFar > 0) {
                System.out.println("The maximum winning streak is " + maxSumSoFar + ".");
            } else {
                System.out.println("Losing streak.");
            }
        }
        // TODO code application logic here
    }
}
