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
public class KnightCount {
//uva 696

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            String line[] = input.nextLine().split(" ");
            int knightCount = 0;
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            if (a == 0 && b == 0) {
                break;
            }
            int row = Math.min(a, b);
            int column = Math.max(a, b);
            if (row == 1) {
                knightCount = column;
            } else if (row < 3 && column < 3) {
                knightCount = row * column;
            } else if (row == 2 && column >= 3) {
                if (column % 100 == 0) {
                    knightCount = column;

                } else if (column % 8 == 0) {
                    knightCount = column;
                } else if (column % 2 != 0) {
                    knightCount = row + column - 1;
                } else {
                    knightCount = row + column;

                }
            } else if (row == 3 && column >= 3) {
                if (column % 100 == 0) {
                    knightCount = row * column / 2;
                } else if (column % 2 == 0) {
                    knightCount = row + column - 1;
                } else {
                    knightCount = row + column;

                }
            } else {
                knightCount = (int) Math.ceil((double) (row * column) / 2);
            }
            System.out.println(knightCount + " knights may be placed on a " + a + " row " + b + " column board.");

        }
        // TODO code application logic here

    }
}
