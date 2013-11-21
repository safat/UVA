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
public class CostCutting {
//uva 11727

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for (int i = 1; i <= cases; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            System.out.println("Case "+i+": "+Math.max(Math.min(a,b), Math.min(Math.max(a,b),c)));
        }
        // TODO code application logic here
    }
}
