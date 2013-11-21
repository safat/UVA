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
public class SaveSetu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        int cash = 0;
        String dum = input.nextLine();
        while(testCases-- > 0){
        
            String[] op = input.nextLine().split(" ");
            
           if(op[0].equals("report"))
               System.out.println(cash);
           else
               cash+=Integer.parseInt(op[1]);
            
        }
        
        // TODO code application logic here
    }
}
