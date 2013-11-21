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
public class RelationalOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int testCase = input.nextInt();
      //  String dum = input.nextLine();
        int n1,n2;
        while(testCase-- > 0){
            n1 = input.nextInt();
            n2 = input.nextInt();
        
            if(n1>n2)
                System.out.println(">");
            else if(n1<n2)
                System.out.println("<");
            else
                System.out.println("=");
        }
        
        
        
        
        // TODO code application logic here
    }
}
