/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigInteger;
 
public class MaxMultis {
    public static void main(String[] args) {
        int v;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            ArrayList<Integer> a = new ArrayList<Integer>();
            while (in.hasNext() && ((v = in.nextInt()) != -999999)) a.add(v);
            BigInteger max = BigInteger.valueOf(a.get(0));
            int len = a.size();
            for (int i = 0; i < len; i++) {
                BigInteger cur = BigInteger.valueOf(a.get(i));
                max = cur.max(max);
                for (int j = i + 1; j < len; j++) {
                    cur = cur.multiply(BigInteger.valueOf(a.get(j)));
                    max = cur.max(max);
                }
            }
            System.out.println(max);
        }
    }
 
}