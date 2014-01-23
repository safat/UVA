/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11388

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class GCDvLCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        long  gcd, lcm;
        StringBuilder output = new StringBuilder("");
        while (cases-- > 0) {
            String[] gcdLcm = br.readLine().split(" ");
            gcd = Long.parseLong(gcdLcm[0]);
            lcm = Long.parseLong(gcdLcm[1]);
            if (lcm % gcd == 0) {
                output.append(gcd + " " + lcm);
            } else {
                output.append("-1");
            }
            output.append("\n");
        }
        System.out.print(output);
    }
}
