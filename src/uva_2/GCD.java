/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11417

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    static int SIZE = 5001;
    static int memory[][] = new int[SIZE + 1][SIZE + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            long result = 0;
            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    result += getGcd(i, j);
                }
            }
            output.append(result);
            output.append("\n");
        }
        System.out.print(output);
    }

    private static int getGcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            int i = y;
            int j = x % y;
            if (memory[i][j] == 0) {
                return memory[j][i] = memory[i][j] = getGcd(i, j);
            } else {
                return memory[i][j];
            }

        }
    }

    private static int getGcd2(int x, int y) {
        if (y == 0) {
            return x;
        } else {

            return getGcd(y, x % y);
        }
    }

}