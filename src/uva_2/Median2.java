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
public class Median2 {
//uva 10347

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder result = new StringBuilder("");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
            String[] inputs = input.nextLine().split(" ");
            double a = Double.parseDouble(inputs[0]);
            double b = Double.parseDouble(inputs[1]);
            double c = Double.parseDouble(inputs[2]);
            double area = 2 * (Math.pow(a, 2) * Math.pow(b, 2) + Math.pow(b, 2) * Math.pow(c, 2) + Math.pow(c, 2) * Math.pow(a, 2)) - (Math.pow(a, 4) + Math.pow(b, 4) + Math.pow(c, 4));
            if (area <= 0) {
                area = -1;
                
            } else {
                area = Math.sqrt(area);
                area /= 3;
            }

            System.out.printf("%.3f\n", area);
        }
    }
}
