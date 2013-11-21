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
public class CombExpansion {

    //uva 369
    public static void main(String[] args) {
        int n, r;
        Scanner input = new Scanner(System.in);
        while (true) {
            String[] tmp = input.nextLine().trim().split("\\s+");

            n = Integer.parseInt(tmp[0]);
            r = Integer.parseInt(tmp[1]);
            if (n == 0 && r == 0) {
                break;
            } else {
                System.out.println(n + " things taken " + r + " at a time is " + (long) dFact(n, Math.min(r, n - r)) + " exactly.");
            }

        }

        // TODO code application logic here
    }

    static long dFact(long n, long r) {

        long tmpk;
        long result = 1;
        tmpk = r;

        /* if k is more than half of n, then use the complement */
        if (r > (n / 2)) {
            tmpk = n - r;
        }

        /*
         * C(n,k) = n!/(k!*(n-k)!) =
         * (n)*(n-1)*(..)*(n-k+1) / 2*3*(..)*k
         */
        for (int i = 0; i < tmpk; i++) {
            result = result * (n - i);   /* (n)*(n-1)*(..)*(n-k+1) */
            result = result / (1 + i);   /* 2*3*(..)*k */
        }

        return result;
    }
}
