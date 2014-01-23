/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//uva 568

/**
 *
 * @author user
 */
public class JustTheFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        String line = "";
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            if (n < 10) {
                output.append("    ");
            } else if (n < 100) {
                output.append("   ");
            } else if (n < 1000) {
                output.append("  ");
            } else if (n < 10000) {
                output.append(" ");
            }

            output.append(n + " -> " + L(n) + "\n");
          //  System.out.print(output);
        }
        System.out.print(output);
    }

    public static int P(int K) {
        int A[] = {6, 2, 4, 8};
        if (K < 1) {
            return 1;
        }
        return A[K % 4];
    }

    static int L(int N) {
        int A[] = {1, 1, 2, 6, 4};
        if (N < 5) {
            return A[N];
        }
        return (P(N / 5) * L(N / 5) * L(N % 5)) % 10;
    }
}
