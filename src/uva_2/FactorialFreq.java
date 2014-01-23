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
public class FactorialFreq {
//uva 324 

    /**
     * @param args the command line arguments
     */
    public static String[] memorization = new String[367];

    public static void main(String[] args) throws IOException {
        factorialMemorization(366);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        while (true) {
            int freq[] = new int[10];
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            String factorialString = memorization[n];
            int len = factorialString.length();
            for (int i = 0; i < len; i++) {
                freq[factorialString.charAt(i) - 48]++;
            }
            output.append(n + "! --\n");
            for (int i = 0; i <= 9; i++) {
                if (i == 5) {
                    output.append("\n");
                }
                if (i == 0 || i == 5) {
                    output.append("   (");
                } else {
                    output.append("    (");
                }
                if (freq[i] < 10) {
                    output.append(i + ")    " + freq[i]);
                } else if (freq[i] < 100) {
                    output.append(i + ")   " + freq[i]);
                } else if (freq[i] >= 100) {
                    output.append(i + ")  " + freq[i]);
                }
            }
            output.append("\n");

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
