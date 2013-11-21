/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ADDALL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PriorityQueue<Integer> numbers = new PriorityQueue();
        
        Scanner input = new Scanner(System.in);
        int n ;
        int cost;
        while(true){
            cost = 0;
            numbers.clear();
            n = input.nextInt();
          //  String dummy = input.nextLine();
            if(n==0) break;
           
            while(n-- > 0 ){
                int num = input.nextInt();
                numbers.add(num);
            }
            int sum = 0;
            while(numbers.size()>=2){
                sum = numbers.remove()+numbers.remove();
                cost+=sum;
                numbers.add(sum);
                
            }
            
            System.out.println(cost);
        
        }
        
        
        
        
        
        // TODO code application logic here
    }
}
