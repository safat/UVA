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
public class F91 {
//uva 10696

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int result;
            int n = input.nextInt();
            if (n == 0) {
                break;
            } else if (n <= 100) {
                System.out.println("f91("+n+") = "+91);
            } else {
                System.out.println("f91("+n+") = "+(n-10));
           
            }
        }
        // TODO code application logic here
    }
}
