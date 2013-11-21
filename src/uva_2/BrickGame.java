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
public class BrickGame {
//uva 11875

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        String dummy = input.nextLine();
        for (int i = 1; i <= caseCount; i++) {
            String line[] = input.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            System.out.println("Case " + i + ": " + Integer.parseInt(line[(n + 1) / 2]));
        }
        // TODO code application logic here
    }
}
