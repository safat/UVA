/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;

/**
 *
 * @author user
 */// uva 11984
public class ThermalUnit {

    /**
     * @param args the command line arguments
     */
    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        String dummy = input.nextLine();
        for (int i = 0; i <= cases; i++) {
            double celcius = input.nextDouble();
            double inFarenhite = input.nextDouble();
            double result = celcius+(5/9)*inFarenhite;
            System.out.println("Case 1: " + result);

        }

        // TODO code application logic here
    }
}
