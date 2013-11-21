/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MirroClock {
//uva 11650

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        String dummy = input.nextLine();
        for (int i = 1; i <= caseCount; i++) {
            String in = input.nextLine();
            String line[] = in.split(":");
            //System.out.println("input "+in);
            //System.out.println(line.length);
            int hr = Integer.parseInt(line[0]);
            int min = Integer.parseInt(line[1]);
            String h = "";
            String m = "";
            //System.out.println(hr + "<>" + min);
            if (min > 0) {
                if (hr == 12) {
                    hr = 1;
                } else {
                    hr += 1;
                }
            }
            if (min == 0) {
                min = 0;
            } else {
                min = 60 - min;
            }
            if (hr == 12) {
                hr = 12;
            } else {
                hr = 12 - hr;
            }
            if (hr < 10) {
                h = "0" + hr;
            } else {
                h += hr;
            }
            if (min < 10) {
                m = "0" + min;
            } else {
                m += min;
            }
            System.out.println(h + ":" + m);
        }
        // TODO code application logic here
    }
}
