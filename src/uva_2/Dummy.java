/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dummy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = {10,12,4,3,3,3,1};
        int b[] = new int[a.length];
      Arrays.sort(a);
       System.out.println( Arrays.binarySearch(a, 2));
       System.out.println( Arrays.binarySearch(a, 3));
       System.out.println( Arrays.binarySearch(a, 1));
        //  System.out.println(10/(double)4);
    }
}