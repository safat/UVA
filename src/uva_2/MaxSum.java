/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 108
import java.util.Scanner;

/**
 *
 * @author safat
 */
public class MaxSum {

    public static int kadane(int inputArray[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int len = inputArray.length;
        int head = 0, tail = 0;
        for (int i = 0; i < len; i++) {
            sum += inputArray[i];
            if (sum > maxSum) {
                tail = i;
                maxSum = sum;
            }
            if (sum < 0) {
                head = i;
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numbers[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = input.nextInt();
            }
        }
        int maxSum = 0;
        int tmpSum = 0;
        int sumRow[] = new int[n];
        for (int i = 0; i < n; i++) {
            sumRow = new int[n];
            tmpSum = 0;
            for (int j = i; j >= 0; j--) {
                for (int k = 0; k < n; k++) {
                    sumRow[k] += numbers[j][k];
                }
                tmpSum = kadane(sumRow);
                maxSum = Math.max(tmpSum, maxSum);
            }

        }
        System.out.println(maxSum);
    }
}