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
public class Baby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        int testCases = input.nextInt();
        String exp="";
        int len;
        double result;
        while(testCases-- > 0){
        result = 1;
             exp  = input.nextLine();
             len = exp.length();
             
             for(int i = 0; i < len; i++){
                 System.out.println(exp+">res:"+result);
             char c =exp.charAt(i); 
                 if(c>='0'&&c<='9'){
                     result*=(double)c;
                     System.out.println("found : "+c);
                 }
                 else if(c=='斤'){
                     result*=0.5;
                     System.out.println("found chinese : "+c);
                 }
                 else if(c=='两'){
                     System.out.println("found chinese: "+c);
                     result*=0.05;
                 }
                     
             }
             System.out.println(result);
             
             
        }
        // TODO code application logic here
    }
}
