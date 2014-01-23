/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.*;
import java.util.*;

public class News {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int n;
        HashMap<Character, Double> h;
        String[] sp;
        int m;
        StringBuilder l;
        for (int i = 0; i < t; i++) {
            h = new HashMap<Character, Double>();
            n = Integer.parseInt(br.readLine());
            double res = 0;
            for (int j = 0; j < n; j++) {
                sp = br.readLine().split(" ");
                h.put(sp[0].charAt(0), Double.parseDouble(sp[1]) / (100 * 1.0));
            }
            m = Integer.parseInt(br.readLine());
            for (int j = 0; j < m; j++) {
                l = new StringBuilder(br.readLine());
                for (int k = 0; k < l.length(); k++) {
                    if (h.containsKey(l.charAt(k))) {
                        res += h.get(l.charAt(k));
                    }
                }
            }
            System.out.printf("%.2f$\n", res);
        }
    }
}