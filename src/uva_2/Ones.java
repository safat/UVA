/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ones {
//uva 10127

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            long n = input.nextLong();
            BigInteger ones = new BigInteger("111");
            BigInteger ns = BigInteger.valueOf(n);
            while (ones.remainder(ns) != BigInteger.ZERO) {
                ones = new BigInteger(ones.toString() + "1");
            }
            System.out.println(ones.toString().length());
        }
    }
}
