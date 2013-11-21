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
public class DnaSorting {
//uva  612
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        String dummy = input.nextLine();

        for (int i = 0; i < cases; i++) {
            dummy = input.nextLine();
            int len = input.nextInt();
            int n = input.nextInt();
            int[] unorderness = new int[n];
            String[] inputs = new String[n];
            dummy = input.nextLine();
            String seq = "";
            for (int j = 0; j < n; j++) {
                seq = input.nextLine();
                inputs[j] = seq;
            }
            for(int j = 0 ; j < n;j++){
                seq = inputs[j];
                int sum = 0;
                for (int k = 0; k < len; k++) {
                    for (int m = k+1; m < len; m++) {
                        if (seq.charAt(k) > seq.charAt(m)) {
                            sum += 1;
                        }
                    }
                }
                unorderness[j] = sum;
            }
        //    for (int k = 0; k < n; k++) {
          //      System.out.println(inputs[k]+":"+unorderness[k]);
           // }
            for (int k = 1; k < n; k++) {
                for (int m = 0; m < n-1; m++) {
                    if(unorderness[m]>unorderness[m+1]){
                        int tmp = unorderness[m+1];
                        unorderness[m+1] = unorderness[m];
                        unorderness[m] = tmp;
                        String tmpSeq = inputs[m+1];
                        inputs[m+1] = inputs[m];
                        inputs[m] = tmpSeq;
                    }
                }
            }
            
            for(int k = 0; k < n; k++)
                System.out.println(inputs[k]);
            if(i!=cases-1)
                System.out.println();

        }


        // TODO code application logic here
    }
}
