/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;
//uva 11764
/**
 *
 * @author user
 */
public class JumpingMario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int testCount = input.nextInt();
        String dummy = input.nextLine();
        StringBuilder output = new StringBuilder("");
        for (int i = 1; i <= testCount; i++) {
            int highCount = 0;
            int lowCount = 0;
            int wallCount = input.nextInt();
            dummy = input.nextLine();
            String heights[] = input.nextLine().split(" ");
            for (int j = 0; j < heights.length - 1; j++) {
                int currentHeight = Integer.parseInt(heights[j]);
                int nextHeight = Integer.parseInt(heights[j + 1]);
                if (currentHeight < nextHeight) {
                    highCount++;
                } else if (currentHeight > nextHeight) {
                    lowCount++;
                }
            }
            output.append("Case " + i + ": " + highCount + " " + lowCount + "\n");
        }
        System.out.print(output);
    }
}
