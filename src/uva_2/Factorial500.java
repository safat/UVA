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
public class Factorial500 {
//uva 623

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
            output.append(n + "!\n" + memorization[n] + "\n");
            System.out.print(output);
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
