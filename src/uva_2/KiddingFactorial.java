/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author user
 */
public class KiddingFactorial {
//uva 10323

    static int SIZE = 14;
    static String[] memorization = new String[SIZE];

    public static void main(String[] args) throws IOException {
        factorialMemorization(SIZE - 1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        String line = "";
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            if ((n < 8 && n > -1) || (n < 0 && n % 2 == 0)) {
                output.append("Underflow!\n");
            } else if (n > 13 || n < 0) {
                output.append("Overflow!\n");
            } else {
                output.append(memorization[n] + "\n");
            }
            //  System.out.println("it was "+memorization[n]);
            // System.out.print(output);
        }
        System.out.println(output);
    }

    private static void factorialMemorization(int n) {
        memorization[0] = "1";
        memorization[1] = "1";
        memorization[2] = "2";
        for (int i = 3; i <= n; i++) {
            memorization[i] = new BigInteger(memorization[i - 1]).multiply(BigInteger.valueOf(i)).toString();
        }
    }
}
