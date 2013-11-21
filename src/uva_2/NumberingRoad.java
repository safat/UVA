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
public class NumberingRoad {
//uva 11723

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = 0;
        while (true) {

            double roadCount = input.nextDouble();
            double numberCount = input.nextDouble();
            if (roadCount == 0 && numberCount == 0) {
                break;
            }
            int result;
            if (numberCount >= roadCount) {
                result = 0;
            } else {
                result = (int) Math.ceil((roadCount - numberCount) / numberCount);
            }

            if (result > 26) {
                System.out.println("Case " + (++caseCount) + ": " + "impossible");
            } else {
                System.out.println("Case " + (++caseCount) + ": " +result);
            }

        }
        // TODO code application logic here
    }
}
