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
public class Hasmat {
//uva 10055

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long a = in.nextLong();
            long b = in.nextLong();
            if (a > b) {
                System.out.println(a - b);
            } else {
                System.out.println(b - a);
            }
        }
        // TODO code application logic here
    }
}
