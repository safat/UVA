/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.IOException;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String m = "";
        int cases = s.nextInt();
        int[][] arr = new int[cases][cases];
        int maxNum = 0;
        for(int i=0;i<cases;i++){
           for(int j=0;j<cases;j++){
               arr[i][j]=s.nextInt();
           }
        }
       


        //Using kadane which gave a O(n3) solution
        int sumF=Integer.MIN_VALUE;       
        for(int i=0;i<cases;i++){
            int []sum=new int[cases];
            for(int j=i;j<cases;j++){
                int max=Integer.MIN_VALUE;
                int tempSum=0;
                for(int l=0;l<cases;l++){
                    sum[l]+=arr[j][l];
                    tempSum+=sum[l];
                    max=Math.max(max, tempSum);
                    if(tempSum<0)
                        tempSum=0;
                }
                sumF=Math.max(max, sumF);
            }
        }
        System.out.println(sumF);
    }
}