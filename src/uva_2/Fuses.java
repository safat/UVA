/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 661

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class Fuses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        int count = 0;
        while (true) {
            int m, n, capacity;
            String inputs[] = br.readLine().split(" ");
            n = Integer.parseInt(inputs[0]);
            m = Integer.parseInt(inputs[1]);
            capacity = Integer.parseInt(inputs[2]);
            if (m == 0 && n == 0 ) {
                break;
            }
            count++;
            output.append("Sequence " + count + "\n");

            int powerConsumption[] = new int[n + 1];
            boolean onOff[] = new boolean[n + 1];

            int operations[] = new int[m];
            for (int i = 0; i < n; i++) {
                powerConsumption[i + 1] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < m; i++) {
                operations[i] = Integer.parseInt(br.readLine());
            }
            int maxCurrent = Integer.MIN_VALUE;
            int totalCurrent = 0;
            boolean blown = false;
            for (int i = 0; i < m; i++) {

                if (onOff[operations[i]]) {
                    onOff[operations[i]] = false;
                    totalCurrent -= powerConsumption[operations[i]];
                    //           System.out.println(i + " .total current - " + totalCurrent);

                } else {
                    onOff[operations[i]] = true;
                    totalCurrent += powerConsumption[operations[i]];
                    //         System.out.println(i + " .total current + " + totalCurrent);
                    if (totalCurrent > capacity) {
                        output.append("Fuse was blown.\n\n");
                        blown = true;
                        break;
                    }
                    if (totalCurrent > maxCurrent) {
                        maxCurrent = totalCurrent;
                    }
                }
            }
            if (!blown) {
                output.append("Fuse was not blown.\n");
                output.append("Maximal power consumption was " + maxCurrent + " amperes.\n\n");
            }
        }

        System.out.print(output);
    }
}
