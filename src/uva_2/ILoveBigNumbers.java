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
public class ILoveBigNumbers {
//uva 10220

    /**
     * @param args the command line arguments
     */
    static int SIZE = 1001;
    static String[] memorization = new String[SIZE];

    public static void main(String[] args) throws IOException {
        factorialMemorization(1000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        String line = "";
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            String factorialString = memorization[n];
            int len = factorialString.length();
            long result = 0;
            for (int i = 0; i < len; i++) {
                result += (factorialString.charAt(i) - 48);
            }
            output.append(result + "\n");
           // System.out.print(output);
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
