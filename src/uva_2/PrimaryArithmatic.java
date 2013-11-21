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
public class PrimaryArithmatic {
//uva 10035

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            if (a < b) {
                a = a + b;
                b = a - b;
                a = a - b;
            }
            int carryCount = 0;
            int carry = 0;
            while (a != 0) {
                int n1 = a % 10;
                int n2 = b % 10;
                if (n1 + n2 + carry >= 10) {
                    carryCount += 1;
                }
                carry = (n1 + n2 + carry) / 10;
                a /= 10;
                b /= 10;
            }
            if (carryCount == 0) {
                System.out.println("No carry operation.");
            } else if (carryCount == 1) {
                System.out.println(carryCount + " carry operation.");
            } else {
                System.out.println(carryCount + " carry operations.");

            }
        }
        // TODO code application logic here
    }
}
