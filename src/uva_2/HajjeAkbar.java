/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 12577

import java.util.Scanner;

/**
 *
 * @author user
 */
public class HajjeAkbar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");
        int cases = 0;
        while (true) {
            cases++;
            String line = input.nextLine();
            if (line.equals("*")) {
                break;
            } else if (line.equals("Hajj")) {
                output.append("Case " + cases + ": ");
                output.append("Hajj-e-Akbar\n");
            } else {
                output.append("Case " + cases + ": ");
                output.append("Hajj-e-Asghar\n");
            }

        }
        System.out.print(output);
    }
}
