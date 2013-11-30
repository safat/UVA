/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 374

import java.util.Scanner;

/**
 *
 * @author user
 */
public class BigMod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            long b = input.nextLong();
            long p = input.nextLong();
            long m = input.nextLong();
            /*  long x = 1;
             for (long i = 1; i <= p; i++) {
             x = (long) ((b * x) % m);
             }
             * */
            System.out.println(modular_pow(b, p, m));
            String dummy = input.nextLine();
        }
    }

    static long modular_pow(long base, long exponent, long modulus) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            exponent = exponent >> 1;
            base = (base * base) % modulus;
        }
        return result;
    }
}
