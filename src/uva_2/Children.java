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
public class Children {
//uva 10338

    /**
     * @param args the command line arguments
     */
    static int SIZE = 21;
    static String[] memorization = new String[SIZE];

    public static void main(String[] args) throws IOException {
        factorialMemorization(20);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder("");
        for (int i = 1; i <= cases; i++) {
            long result = 1;
            int[] charFreq = new int['Z' + 1];
            char[] chars = br.readLine().toCharArray();
            int n = chars.length;
            for (int j = 0; j < chars.length; j++) {
                charFreq[chars[j]]++;
            }
            BigInteger factorial = new BigInteger(memorization[n]);
            for (int j = 'A'; j <= 'Z'; j++) {
                if (charFreq[j] > 1) {
                    if (n > 1) {
                        factorial = factorial.divide(new BigInteger(memorization[charFreq[j]]));
                    }
                }
            }

            output.append("Data set " + i + ": ");
            output.append(factorial.toString() + "\n");
        }
        System.out.print(output);
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
