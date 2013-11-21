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
public class ErrorCorrection {
//uva 541

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (true) {
            int n = input.nextInt();
            if (n == 0) {
                break;
            }
            int bits[][] = new int[n][n];
            int i, j = 0;
            String dummy = input.nextLine();
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    bits[i][j] = input.nextInt();
                }
            }
            int errorRowCount = 0;
            int errorColumnCount = 0;
            int correctionRowIndex = 0;
            int correctionColumnIndex = 0;
            int paritySumRow = 0;
            int paritySumColumn = 0;
            for (i = 0; i < n; i++) {
                paritySumRow = 0;
                paritySumColumn = 0;
                for (j = 0; j < n; j++) {
                    paritySumRow += bits[i][j];
                    paritySumColumn += bits[j][i];
                }
                // System.out.println("Row : " + i + ": " + paritySumRow);
                //  System.out.println("Column : " + j + ": " + paritySumColumn);
                if (paritySumRow % 2 != 0) {
                    //  System.out.println("found error in row " + i);
                    correctionRowIndex = i;
                    errorRowCount++;
                }
                if (paritySumColumn % 2 != 0) {
                    // System.out.println("found error in column in " + j);
                    correctionColumnIndex = i;
                    errorColumnCount++;
                }
            }
            if (errorRowCount == 0 && errorColumnCount == 0) {
                System.out.println("OK");
            } else if (errorRowCount == 1 && errorColumnCount == 1) {
                System.out.println("Change bit (" + (correctionRowIndex + 1) + "," + (correctionColumnIndex + 1) + ")");
            } else {
                System.out.println("Corrupt");
            }
        }
    }
}
