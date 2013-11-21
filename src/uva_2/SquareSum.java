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
public class SquareSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = 0;
       while (true) 
        {
           int n = input.nextInt();
           double tmp;
           tmp = n;
           int middle = (int) Math.ceil(tmp/2);
         //   int n = 10;
          //  String dum = input.nextLine();
            if (n == 0) {
               break;
            }
            caseCount++;
            int square[][] = new int[n + 2][n + 2];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    square[i][j] = input.nextInt();
                   // square[i][j]=1;
                }
            }
            int sum[] = new int[n + 1];

            for (int i = 1; i <= Math.ceil(n/2); i++) {
                //System.out.println();
                for (int j = i; j <= n - i + 1; j++) {
                    if (i != j) {
                       // sum[i] += square[j][i];
                 //       System.out.print(j+","+i+"\t");
                    }
                    sum[i] += square[i][j];
                }
                //System.out.println("overlap "+(n - i + 1)+" , "+i);
              //  sum[i] -= square[n - i + 1][i];
            }

            for (int i = n; i > Math.ceil(n/2); i--) {
                System.out.println();
                sum[n - i + 1] -= square[n - i + 1][i];
                //System.out.print("overlap "+(n - i + 1)+","+(i)+"\t");
                for (int j = n - i + 1; j <= i; j++) {
                    if (i != j) {
                      //  sum[n - i + 1] += square[j][i];
                //        System.out.print(j+","+i+"\t");
                    }
                 
                  //  sum[n - i + 1] += square[i][j];
                }
              
              //  System.out.println("overlap "+i+","+i);
            }
            middle = (int) Math.ceil(n/2);
            System.out.println("middle "+middle);
            if (n % 2 != 0) {
                sum[(int)Math.ceil(n/2)] = square[(int)Math.ceil(n/2)][(int)Math.ceil(n/2)];
            }

            System.out.print("Case "+caseCount+": ");
            for (int i = 1; i <=Math.ceil(n/2); i++) {
                System.out.print(sum[i]);
                if(i!=Math.ceil(n/2))
                   System.out.print(" ");
            }
            System.out.println();

        }


        // TODO code application logic here
    }
}
