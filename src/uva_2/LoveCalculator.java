/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class LoveCalculator {
//uva 10424

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String firstName = input.nextLine();
            String secondName = input.nextLine();
            double a = getSingleDigit(firstName);
            //System.out.println("single " + a);
            double b = getSingleDigit(secondName);
          //  System.out.println("single2 " + b);

            double lovePercentage = 0;
            if (a >= b) {
                if (a == 0) {
                    lovePercentage = 0;
                } else {
                    lovePercentage = (b / a) * 100;
                }
            } else {
                if (b == 0) {
                    lovePercentage = 0;
                } else {
                    lovePercentage = (a / b) * 100;
                }

            }
            System.out.printf("%.2f",lovePercentage);
            System.out.println(" %");
            
        }
        // TODO code application logic here
    }

    private static double getSingleDigit(String name) {
        int sum = 0;
        int len = name.length();
        for (int i = 0; i < len; i++) {
            if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
                sum += (name.charAt(i) - 96);
            } else if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                sum += (name.charAt(i) - 64);
            }
        }
        int tmp = 0;
        while (true) {
            while (sum != 0) {
                tmp += sum % 10;
                sum /= 10;
            }
            if (tmp <= 9) {
                break;
            } else {
                sum = tmp;
                tmp = 0;
            }

        }
        return tmp;
    }
}
