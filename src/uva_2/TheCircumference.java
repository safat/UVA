/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;
//uva 438
/**
 *
 * @author user
 */
public class TheCircumference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String[] cordinates = input.nextLine().split(" ");
            double x1 = Double.parseDouble(cordinates[0]);
            double y1 = Double.parseDouble(cordinates[1]);
            double x2 = Double.parseDouble(cordinates[2]);
            double y2 = Double.parseDouble(cordinates[3]);
            double x3 = Double.parseDouble(cordinates[4]);
            double y3 = Double.parseDouble(cordinates[5]);
            double a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            double b = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
            double c = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
            double s = (a + b + c) / 2;
            double l = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            double r = (a * b * c) / (4 * l);
            double result = 2 * Math.PI * r;
            System.out.printf("%.2f\n", result);
        }
    }
}
