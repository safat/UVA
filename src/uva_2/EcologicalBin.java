/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;

/**
 *
 * @author user
 */ //uva 102
public class EcologicalBin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int minMovement = Integer.MAX_VALUE;
            String result = "";
            int colors[] = new int[9];
            int movement[] = new int[6];
            String combination[] = new String[6];
            for (int k = 0; k < 9; k++) {
                colors[k] = input.nextInt();
                if (k == 8) {
                    continue;
                }
            }
            combination[0] = "BCG";
            movement[0] = colors[1] + colors[2] + colors[3] + colors[4] + colors[6] + colors[8];
            combination[1] = "BGC";
            movement[1] = colors[1] + colors[2] + colors[3] + colors[5] + colors[6] + colors[7];
            combination[2] = "CBG";
            movement[2] = colors[0] + colors[1] + colors[4] + colors[5] + colors[6] + colors[8];
            combination[3] = "CGB";
            movement[3] = colors[0] + colors[1] + colors[3] + colors[5] + colors[7] + colors[8];
            combination[4] = "GBC";
            movement[4] = colors[0] + colors[2] + colors[4] + colors[5] + colors[6] + colors[7];
            combination[5] = "GCB";
            movement[5] = colors[0] + colors[2] + colors[3] + colors[4] + colors[7] + colors[8];
            for (int i = 0; i < 6; i++) {
                if (movement[i] < minMovement) {
                    minMovement = movement[i];
                    result = combination[i];
                }
            }
            System.out.println(result + " " + minMovement);
        }
        // TODO code application logic here
    }
}
