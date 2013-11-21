/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class Combination {

    /**
     * @param args the command line arguments
     */
    static Map<Integer, Integer> permutationMemory = new HashMap();

    public static void main(String[] args) {
        // TODO code application logic here

       // System.out.println(combination(100, 10));
        
        System.out.println(permutation(30));
         System.out.println(permutation(30));
         
         System.out.println(permutationMemory.toString());

    }

    public static int combination(int n, int k) {
        return permutation(n) / (permutation(k) * permutation(n - k));
    }

    public static int permutation(int i) {
        if (i == 1) {
            return 1;
        }
        int x;
        if (permutationMemory.containsKey(i)) {
            return permutationMemory.get(i);
        } else {
            x = i * permutation(i - 1);
            permutationMemory.put(i, x);
            return x;

        }
    }
}
