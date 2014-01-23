/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
//uvA 10892
public class LCMCardinality {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> factorList;
        StringBuilder output = new StringBuilder("");
        while (true) {
            factorList = new ArrayList();
            long n = Long.parseLong(br.readLine());
            if (n == 0) {
                break;
            }
            int factors = factorCount(n, factorList);
            output.append(n + " " + factors + "\n");
        }
        System.out.print(output);
    }

    private static int factorCount(long n, ArrayList<Long> factorList) {
        int count = 0;
        int sqrtN = (int) Math.sqrt(n);
        ArrayList<Long> left = new ArrayList();
        ArrayList<Long> right = new ArrayList();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += 2;
                left.add((long) i);
                right.add(n / i);
            }
        }
        if (sqrtN * sqrtN == n) {
            left.remove((long) sqrtN);
            count -= 1;
        } else {
            sqrtN += 1;
        }
        Collections.sort(right);
        left.addAll(right);
        //  System.out.println(left.toString());
        int size = left.size();
        for (int i = 1; i < size - 2; i++) {
            long iNumber = left.get(i);
            for (int j = i + 1; j < size - 1; j++) {
                long jNumber = left.get(j);
                //System.out.println("comparing " + iNumber + " with " + jNumber);
                    if (jNumber % iNumber != 0 && jNumber >= sqrtN) {
                        //    System.out.println("..");
                        if (isEligible(iNumber, jNumber, n)) {
                            //  System.out.println("eligible");
                            count++;
                        }
                    }
            }
        }
        return count;
    }

    private static boolean isEligible(long iNumber, long jNumber, long n) {
        if ((iNumber * jNumber) / gcd(iNumber, jNumber) == n) {
            return true;
        } else {
            return false;
        }
    }

    private static long gcd(long iNumber, long jNumber) {
        if (iNumber == 0) {
            return jNumber;
        } else {
            return gcd(jNumber % iNumber, iNumber);
        }
    }
}
