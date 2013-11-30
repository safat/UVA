/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ColorFulFlowers {
//uva 11152

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String line = "";
        while ((line = br.readLine())!= null) {
            String in[] = line.split(" ");
            double a = Double.parseDouble(in[0]);
            double b = Double.parseDouble(in[1]);
            double c = Double.parseDouble(in[2]);
            double s = (a + b + c) / 2;
            double areaTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            double innerRadious = areaTriangle / s;
            double areaInnerCircle = Math.PI * innerRadious * innerRadious;
            double outerCircleRadious = (a*b*c)/(4*areaTriangle);
            double areaOuterCircle = Math.PI*outerCircleRadious*outerCircleRadious ;
            double yellow = areaOuterCircle - areaTriangle;
            double violet = areaTriangle - areaInnerCircle;
            double red = areaInnerCircle;
            System.out.printf("%.4f %.4f %.4f", yellow, violet, red);
            System.out.println();

        }
    }
}
