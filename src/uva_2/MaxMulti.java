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
public class MaxMulti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //  int numbers[] = {1, 0, 10, 50, 0, -1, -2, -8, -12, 0, 1, 2, 3, -1, -20};
        Scanner input = new Scanner(System.in);

        int numbers[] = {-1, 0, -2};
        int minusCount = 0;
        int totalMinusCount = 0;
        int totalZeroSeperation = 0;
        int maxMul = 1;
        int soFarMaxmultiplication = Integer.MIN_VALUE;
        int startNeqValue = 1;
        int prevMul;
        boolean seqStart = true;
        for (int i = 0; i < numbers.length; i++) {
            prevMul = maxMul;
            maxMul = maxMul * numbers[i];
            if (numbers[i] < 0) {
                if (seqStart) {
                    startNeqValue = numbers[i];
                    seqStart = false;
                }
                minusCount++;
                totalMinusCount++;
            }
            if (minusCount % 2 == 0) {
                if (maxMul > soFarMaxmultiplication) {
                    soFarMaxmultiplication = maxMul;
                }
            }
            if (maxMul == 0) {
                if (minusCount % 2 != 0) {
                    int tmpMul = prevMul / startNeqValue;
                    if (tmpMul > soFarMaxmultiplication) {
                        soFarMaxmultiplication = tmpMul;
                    }
                }
                if (prevMul < 0) {
                    soFarMaxmultiplication = 0;
                }
                maxMul = 1;
                seqStart = true;
                minusCount = 0;
                totalZeroSeperation++;

            } else {
                seqStart = false;
            }
        }
        if (minusCount % 2 != 0) {
            if (numbers.length > 1) {
                maxMul = maxMul / startNeqValue;
            }
            if (maxMul > soFarMaxmultiplication) {
                soFarMaxmultiplication = maxMul;
            }
        }
        if (totalZeroSeperation == numbers.length - 1 && totalMinusCount == 1) {
            soFarMaxmultiplication = 0;
        }
        System.out.println(soFarMaxmultiplication);
    }
}
