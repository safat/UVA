/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;

/**
 *
 * @author user
 *///uva  299
public class TrainSwapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        String dummy = input.nextLine();
        while (cases-- > 0) {
            int numCount = input.nextInt();
            dummy = input.nextLine();
            int numbers[] = new int[numCount];
            for (int i = 0; i < numCount; i++) {
                numbers[i] = input.nextInt();
            }
            int swapCount = 0;
            for (int j = 1; j < numCount; j++) {
                for (int k = 0; k < numCount - 1; k++) {
                    if (numbers[k] > numbers[k + 1]) {
                        swapCount++;
                        int tmp = numbers[k];
                        numbers[k] = numbers[k + 1];
                        numbers[k + 1] = tmp;
                    }
                }
            }
           System.out.println("Optimal train swapping takes "+swapCount+" swaps.");
        }
        // TODO code application logic here
    }
}
