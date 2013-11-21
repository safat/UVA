/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Median {

    /**
     * @param args the command line arguments
     *///10107
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        while(input.hasNext()){
            numbers.add(input.nextInt());
        }
        
        int output;
        int size = numbers.size();
        if(size%2==0)
            output =(int) (numbers.get(size/2-1)+numbers.get(size/2))/2;
        else
            output = numbers.get((size)/2);
        
        System.out.println(output);
        // TODO code application logic here
    }
}
