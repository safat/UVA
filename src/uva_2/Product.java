/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 10106

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Product {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            BigInteger n1 = new BigInteger(input.nextLine());
            BigInteger n2 = new BigInteger(input.nextLine());
            System.out.println(n1.multiply(n2));
        }
    }
}
