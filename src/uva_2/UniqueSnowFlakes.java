/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
//uva 11572
public class UniqueSnowFlakes {

    /**
     * @param args the command line arguments
     */
    public static HashMap<String, Integer> items;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder output = new StringBuilder("");
        int cases = Integer.parseInt(br.readLine());
        while (cases-- > 0) {
            int snowFlakes = Integer.parseInt(br.readLine());
            String[] flakearr = new String[snowFlakes];
            for (int i = 0; i < snowFlakes; i++) {
                flakearr[i] = br.readLine();
            }
            int lastUpdatedIndex = -1;
            items = new HashMap();
            int count = 0;
            int maxCount = Integer.MIN_VALUE;
            for (int i = 0; i < flakearr.length; i++) {
                if (!items.containsKey(flakearr[i])) {
                    items.put(flakearr[i], i);
                    count++;
                } else {
                    int index = items.get(flakearr[i]);
                    items.put(flakearr[i], i);
                    if (lastUpdatedIndex > index) {
                        count++;
                    } else {
                        count = i - index;
                        lastUpdatedIndex = index;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                }

             //   System.out.println(i+" "+flakearr[i]+" count "+count);
            }
            output.append(maxCount);
            output.append("\n");
        }
        System.out.print(output);
    }
}
