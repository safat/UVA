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
//uva 10469
public class CarryNotCarry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            System.out.println(input.nextInt() ^ input.nextInt());
        }
        // TODO code application logic here
    }
}
