/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MedianRunning {
//uva 10107
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10001];
        int start=0;
        int end = 1;
        while(input.hasNext()){
            n[end] = input.nextInt();
            int x[] = new int[end+1];
            for(int i = 1; i <= end; i++){
                x[i] = n[i];
            }
            Arrays.sort(x);
            if(end%2==0)
            System.out.println((x[end/2]+x[end/2+1])/2);
            else
                System.out.println(x[(end+1)/2]);
             end++;
            }
           
        }
        // TODO code application logic here
    }
