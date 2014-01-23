/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11470

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SquareSums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");
        int cases = 1;
        while (true) {
            int dimension = input.nextInt();
            if (dimension == 0) {
                break;
            }
            int inputs[][] = new int[dimension][dimension];
            String dummy = input.nextLine();
            int sums[] = new int[(int) Math.ceil((double) dimension / 2)];
            for (int i = 0; i < dimension; i++) {
                String line[] = input.nextLine().split(" ");
                for (int j = 0; j < line.length; j++) {
                    inputs[i][j] = Integer.parseInt(line[j]);
                }
            }
            for (int i = 0; i < sums.length; i++) {
                int rowEnd = dimension - i - 1;
                int rowStart = i;
                int columnStart = i;
                int columnEnd = dimension - i - 1;
                for (int j = columnStart; j <= columnEnd; j++) {
                    sums[i] += (inputs[rowStart][j] + inputs[rowEnd][j]);
                    if (j != columnStart && j != columnEnd) {
                        sums[i] += (inputs[j][rowStart] + inputs[j][rowEnd]);
                    }
                }
                if (dimension % 2 != 0) {
                    sums[sums.length - 1] /= 2;
                }
            }
            output.append("Case " + cases + ":");
            cases++;
            for (int i = 0; i < sums.length; i++) {
                output.append(" " + sums[i]);
            }
            output.append("\n");
        }
        System.out.print(output);
    }
}
