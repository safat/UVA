package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//uva 674
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CoinChange {

    static int table[] = new int[7490];

    /**
     * @param args the command line arguments
     */
    //static int[][] memorization ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = {1, 5, 10, 25, 50};
        String m = "";
        StringBuilder output = new StringBuilder("");
        count(arr, arr.length, 7489);
        while ((m = br.readLine()) != null) {
            //  memorization = new int[6][8000];
            int money = Integer.parseInt(m);
          //  output.append(table[money] + "\n");
          System.out.println(table[money]);
            //  System.out.println(count(arr, arr.length, money));
        }
       // System.out.println(output);
        // TODO code application logic here
    }

    static int count(int S[], int m, int n) {
        // table[i] will be storing the number of solutions for
        // value i. We need n+1 rows as the table is consturcted
        // in bottom up manner using the base case (n = 0)


        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[] values
        // after the index greater than or equal to the value of the
        // picked coin
        for (int i = 0; i < m; i++) {
            for (int j = S[i]; j <= n; j++) {
                table[j] += table[j - S[i]];
            }
        }

        return table[n];
    }
}
