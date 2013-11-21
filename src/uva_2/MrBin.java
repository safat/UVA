/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 12372

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MrBin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= testCase; i++) {
            int len = input.nextInt();
            int wid = input.nextInt();
            int height = input.nextInt();
            if (len > 20 || wid > 20 || height > 20) {
                System.out.println("Case " + i + ": bad");
            } else {
                System.out.println("Case " + i + ": good");
            }

        }
        // TODO code application logic here
    }
}
