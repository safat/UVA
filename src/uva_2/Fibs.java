/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.math.BigInteger;
import java.util.Scanner;
//uva 10183
public class Fibs {

    static int MAX = 501;
    static BigInteger fibonaci[] = new BigInteger[MAX];

    public static void run() {
        fibonaci[0] = BigInteger.ONE;
        fibonaci[1] = new BigInteger("2");
        for (int i = 2; i < MAX; i++) {
            fibonaci[i] = fibonaci[i - 1].add(fibonaci[i - 2]);
        }
    }

    public static void main(String[] args) {
        run();
        Scanner in = new Scanner(System.in);

        String a = in.next(), b = in.next();
        while (!b.equals("0")) {

            if (a.equals("0")) {
                a = "1";
            }
            int A = binarySearcha(fibonaci, new BigInteger(a));
            int B = binarySearchb(fibonaci, new BigInteger(b));

            System.out.println(B - A + 1);
            a = in.next();
            b = in.next();
        }
    }

    private static int binarySearchb(BigInteger[] a, BigInteger e) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo(e) == 0) {
                return i;
            }
            if (a[i].compareTo(e) == 1) {
                return i - 1;
            }
        }
        return -1;
    }

    private static int binarySearcha(BigInteger[] a, BigInteger e) {

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i].compareTo(e) == 0) {
                return i;
            }
            if (a[i].compareTo(e) == -1) {
                return i + 1;
            }

        }
        return -1;
    }
}