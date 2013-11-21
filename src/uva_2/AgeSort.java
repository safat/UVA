/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;

/**
 *
 * @author user
 *///uva 11462
public class AgeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            int numberCount = input.nextInt();
            int ages[] = new int[200];
            StringBuilder agesLine = new StringBuilder("");
            if(numberCount==0)
                break;
           String dummy = input.nextLine();
           int maxAge = -1; 
           while(numberCount-->0){
               int age = input.nextInt();
               ages[age]+=1;
               if(age>maxAge) 
                   maxAge = age;
           }
          
           for(int i = 1 ; i <= maxAge; i++){
               for(int j = 0 ; j < ages[i]; j++){
                 if(i==maxAge&&j==ages[i]-1)
                     agesLine.append(i);
                else agesLine.append(i+" ");
               }
           
           }
           
           System.out.println(agesLine);
           
        }
        
        // TODO code application logic here
    }
}
