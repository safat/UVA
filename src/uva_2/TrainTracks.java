/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11586
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class TrainTracks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder("");
        while (cases-- > 0) {
            int count[] = new int[78];
            String line = br.readLine();
            int len = line.length();
            for (int i = 0; i < len; i++) {
                count[line.charAt(i)]++;
            }
            if (count['M']!=1 && count['M'] == count['F']) {
                output.append("LOOP\n");
            } else {
                output.append("NO LOOP\n");
            }
        }
        System.out.print(output);
    }
}
