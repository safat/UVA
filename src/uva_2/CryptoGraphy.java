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
//UVA 113
public class CryptoGraphy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Double n,p;
        while (input.hasNext()) {

             p = Double.parseDouble(input.nextLine());
             n = Double.parseDouble(input.nextLine());;
            System.out.println((int)Math.floor(Math.pow(10, Math.log10(n)/p)+0.5));


        }

        // TODO code application logic here
    }
}
