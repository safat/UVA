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
public class BoxOfBriks {

//uva 591
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bricksCount;
        String dummy;
        int count = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            bricksCount = input.nextInt();
            if (bricksCount == 0) {
                break;
            }
            dummy = input.nextLine();
            int sum = 0;
            int brickStacks[] = new int[bricksCount];
            for (int i = 0; i < bricksCount; i++) {
                brickStacks[i] = input.nextInt();
                sum += brickStacks[i];
            }
            int avg = sum / bricksCount;
            int result = 0;
            for (int i = 0; i < bricksCount; i++) {
                if (brickStacks[i] > avg) {
                    result += (brickStacks[i] - avg);
                }
            }
            System.out.println("Set #" + (++count) + "\n" + "The minimum number of moves is " + result + ".\n");

        }
        // TODO code application logic here
    }
}
