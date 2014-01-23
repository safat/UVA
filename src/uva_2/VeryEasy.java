/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 10523

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author user
 */
public class VeryEasy {

    /**
     * @param args the command line arguments
     */
    public static BigInteger[] memorization = new BigInteger[151];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < 151; i++) {
            memorization[i] = BigInteger.ONE;
        }
        while ((line = br.readLine()) != null) {
            BigInteger result = BigInteger.ZERO;
            String[] an = line.split(" ");
            int n = Integer.parseInt(an[0]);
            int a = Integer.parseInt(an[1]);
            memorization(a);
            for (int i = 1; i <= n; i++) {
                BigInteger cVal = BigInteger.valueOf(i).multiply(memorization[i]);
                //  System.out.println(cVal.toString());
                result = result.add(cVal);
            }
            output.append(result.toString() + "\n");
            System.out.println(result.toString());
        }
        System.out.print(output);

    }

    private static void memorization(int a) {
        memorization[0] = BigInteger.ONE;
        for (int i = 1; i <= 150; i++) {
            memorization[i] = memorization[i - 1].multiply(BigInteger.valueOf(a));
        }

    }
}
