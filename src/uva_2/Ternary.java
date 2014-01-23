/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class Ternary {
//uva 11185

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n <= -1) {
                break;
            }
            output.append(Integer.toString(n, 3));
            output.append("\n");
        }
        System.out.print(output);
    }
}
