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
public class SecretResearch {
//uva 621

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        String line;
        while (testCase-- > 0) // TODO code application logic here
        {
            line = input.nextLine();
            if (line.equals("1") || line.equals("4") || line.equals("78")) {
                System.out.println("+");
            } else if (line.endsWith("35")) {
                System.out.println("-");
            } else if (line.startsWith("9") && line.endsWith("4")) {
                System.out.println("*");
            } else {
                System.out.println("?");
            }

        }
    }
}
