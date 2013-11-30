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
public class PIzza {
//10079

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (true) {
            long n = input.nextLong();
            if (n < 0) {
                break;
            } else if (n == 0) {
                n = 1;
            } else {

                n = (n * (n + 1)) / 2 + 1;
            }
            System.out.println(n);
        }
    }
}
