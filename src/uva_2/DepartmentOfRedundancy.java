/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 484

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author user
 */
public class DepartmentOfRedundancy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] input = {3, 1, 2, 2, 1, -1, -1, 3, 5, 3, 3, 2, 10, -20};
        
        ArrayList<Integer> digitList = new ArrayList();
        Map<Integer, Integer> freqMap = new HashMap();
        int tFreq = 0;
        for (int i = 0; i < input.length; i++) {
            if (!digitList.contains(input[i])) {
                digitList.add(input[i]);
                freqMap.put(input[i], 0);
            }
            tFreq = freqMap.get(input[i]);
            freqMap.put(input[i], tFreq + 1);
        }
        int size = digitList.size();
        StringBuilder output = new StringBuilder("");
        int freq = 0;
        int n = 0;
        for (int i = 0; i < size; i++) {
            n = digitList.get(i);
            output.append(n + " " + freqMap.get(n) + "\n");
        }
        System.out.print(output);
    }
}
