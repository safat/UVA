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
public class BigNumberTeamSolve {
//uva 11734

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        String dummy = input.nextLine();
        for (int i = 1; i <= testCases; i++) {
            String output = input.nextLine();
            String correctOutput = input.nextLine();
            if (output.equals(correctOutput)) {
                System.out.println("Case " + i + ": Yes");
            } else {
                String outputWithNoSpace = filter(output);
                if (outputWithNoSpace.endsWith(correctOutput)) {
                    System.out.println("Case " + i + ": Output Format Error");
                } else {
                    System.out.println("Case " + i + ": Wrong Answer");
                }
            }
        }
        // TODO code application logic here
    }

    private static String filter(String output) {
        String tmp = "";
        int len = output.length();
        for (int i = 0; i < len; i++) {
            if (output.charAt(i) != ' ') {
                tmp += output.charAt(i);
            }
        }
        return tmp;
    }
}
