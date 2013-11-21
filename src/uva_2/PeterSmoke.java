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
public class PeterSmoke {
//uva 10346
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
             int n = input.nextInt();
             int k = input.nextInt();
             int smokeCount = n;
             while(true){
             smokeCount+=(n/k);
             n = n%k+n/k;
             if(n<k)
                 break;
             }
             System.out.println(smokeCount);
        }
        // TODO code application logic here
    }
}
