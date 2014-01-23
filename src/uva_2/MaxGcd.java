/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//uva 11827
/**
 *
 * @author user
 */
public class MaxGcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        long maxGcd = Integer.MIN_VALUE;
        StringBuilder output = new StringBuilder("");
        while (cases-- > 0) {
            maxGcd = Integer.MIN_VALUE;
            String[] numbers = br.readLine().split("\\s+");
            for (int i = 0; i < numbers.length - 1; i++) {
                long iNumber = Long.parseLong(numbers[i]);
                for (int j = i + 1; j < numbers.length; j++) {
                    long jNumber = Long.parseLong(numbers[j]);
                    long gcd = getGcd(iNumber, jNumber);
                    if (gcd > maxGcd) {
                        maxGcd = gcd;
                    }
                }
            }
            output.append(maxGcd);
            output.append("\n");
        }
        System.out.print(output);
    }

    private static long getGcd(long x, long y) {
        if (y == 0) {
            return x;
        } else {
            return getGcd(y, x % y);
        }
    }
}
