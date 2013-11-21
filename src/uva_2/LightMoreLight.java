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
public class LightMoreLight {
//uva 10110
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            long n = input.nextLong();
            if (n == 0) {
                break;
            }
            long tmp = (int) Math.sqrt(n);
            if (tmp * tmp == n) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
        // TODO code application logic here
    }
}
