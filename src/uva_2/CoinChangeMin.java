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
public class CoinChangeMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int coins[] = {1, 3, 5, 10};
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println(count(coins, coins.length, input.nextInt()));

        }
    }

    static int count(int S[], int m, int n) {
        // If n is 0 then there is 1 solution (do not include any coin)
        if (n == 0) {
            return 1;
        }

        // If n is less than 0 then no solution exists
        if (n < 0) {
            return 0;
        }

        // If there are no coins and n is greater than 0, then no solution exist
        if (m <= 0 && n >= 1) {
            return 0;
        }

        // count is sum of solutions (i) including S[m-1] (ii) excluding S[m-1]
        return count(S, m - 1, n) + count(S, m, n - S[m - 1]);
    }
}
