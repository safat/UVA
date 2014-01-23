/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11661

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class BurgerTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        while (true) {
            int len = Integer.parseInt(br.readLine());
            if (len == 0) {
                break;
            }
            String line = br.readLine();
            int dIndex = -1;
            int rIndex = -1;
            int minDistance = Integer.MAX_VALUE;
            for (int i = 0; i < len; i++) {
                if (line.charAt(i) == 'Z') {
                    minDistance = 0;
                    break;
                } else if (line.charAt(i) == 'R' || line.charAt(i) == 'D') {

                    if (line.charAt(i) == 'R') {
                        rIndex = i;
                    } else {
                        dIndex = i;
                    }
                    if (dIndex != -1 && rIndex != -1) {
                        if (Math.abs(rIndex - dIndex) < minDistance) {
                            minDistance = Math.abs(rIndex - dIndex);
                        }
                    }
                  
                }
            }
            output.append(minDistance + "\n");
        }
        System.out.print(output);

    }
}
