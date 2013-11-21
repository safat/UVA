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
public class SwapCount {
//uva 12004

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCaseCount = input.nextInt();
        String dummy = input.nextLine();
        for (int i = 1; i <= testCaseCount; i++) {
            long n = input.nextLong();
            String result = "";
            long up = n * n - n;
            long low = 4;
            if (up % 4 == 0) {
                result = "" + (up / 4);
            } else if (up % 2 == 0) {
                result = (up / 2) + "/" + "2";
            } else {
                result = up + "/" + "4";
            }
            System.out.println("Case " + i + ": " + result);
        }
        // TODO code application logic here
    }
}
