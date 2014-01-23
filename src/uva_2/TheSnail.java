/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 573

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class TheSnail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        StringBuilder result = new StringBuilder("");
        while ((line = br.readLine()) != null) {
            String inputDatas[] = line.split(" ");
            double cHeight = 0;
            int day = 0;
            double height = Double.parseDouble(inputDatas[0]);
            if (height == 0) {
                break;
            }
            double climb = Double.parseDouble(inputDatas[1]);
            double fall = Double.parseDouble(inputDatas[2]);
            double fatigue = Double.parseDouble(inputDatas[3]);
            fatigue = (fatigue * climb) / 100;
            cHeight = cHeight + climb;
            day += 1;
            if (cHeight > height) {
                result.append("success on day " + day + "\n");
                continue;
            }
            cHeight -= fall;
            if (cHeight < 0) {
                result.append("failure on day " + day + "\n");
                continue;
            }
            while (true) {
                day++;
                climb -= fatigue;
                if (climb < 0) {
                    climb = 0;
                }
                cHeight = cHeight + climb;
                if (cHeight > height) {
                    result.append("success on day " + day + "\n");
                    break;
                }
                cHeight -= fall;
                if (cHeight < 0) {
                    result.append("failure on day " + day + "\n");
                    break;
                }

            }
            // System.out.print(result);
        }
        System.out.print(result);
    }
}
