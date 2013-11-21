/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class OptimalParking {

    private static String dummy;
//uva 11364

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCaseCount = input.nextInt();
        //   String dummy = input.nextLine();
        int distance;
        while (testCaseCount-- > 0) {
            int start = Integer.MAX_VALUE;
            int end = Integer.MIN_VALUE;
            int shopCount = input.nextInt();
            //  dummy = input.nextLine();
            for (int i = 0; i < shopCount; i++) {
                distance = input.nextInt();
                if (distance > end) {
                    end = distance;
                }
                if (distance < start) {
                    start = distance;
                }
            }
            System.out.println(2 * (end - start));

        }
        // TODO code application logic here
    }
}
