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
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        int cash = 0;
        //String dum = input.nextLine();
        String n1, n2;
        while (testCases-- > 0) {
            int n = input.nextInt();
            int count = 0;
            while (true) {
                n1 = n + "";
                n2 = new StringBuilder(n1).reverse().toString();
            //    System.out.println(n1+">"+n2);
                if (pali(n1)) {
                    System.out.println(count+" "+n1);
                    break;
                } else {
                    n = Integer.parseInt(n2) + n;
                    count++;
                }

            }


        }

        // TODO code application logic here
    }
    
     static boolean pali(String s){
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
           if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
