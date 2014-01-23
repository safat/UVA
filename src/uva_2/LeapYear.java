/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author user
 */
public class LeapYear {
//uva 10070

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String year = "";
        StringBuilder output = new StringBuilder("");
        while ((year = br.readLine()) != null) {
            BigInteger yr = new BigInteger(year);
            boolean bulukulu = false;
            boolean hulukulu = false;
            boolean leap = false;
            if (yr.divideAndRemainder(BigInteger.valueOf(15))[1].toString().equals("0")) {
                hulukulu = true;
            }
            if (((yr.divideAndRemainder(BigInteger.valueOf(4))[1].toString().equals("0")) && !yr.divideAndRemainder(BigInteger.valueOf(100))[1].toString().equals("0")) || (yr.divideAndRemainder(BigInteger.valueOf(400))[1].toString().equals("0"))) {
                leap = true;
                output.append("This is leap year.");
                output.append("\n");
                if (yr.divideAndRemainder(BigInteger.valueOf(55))[1].toString().equals("0")) {
                    bulukulu = true;
                }
            }
            if (hulukulu) {
                output.append("This is huluculu festival year.");
                output.append("\n");
            }
            if (bulukulu) {
                output.append("This is bulukulu festival year.");
                output.append("\n");
            }
            if (!leap && !hulukulu && !bulukulu) {
                output.append("This is an ordinary year.");
                output.append("\n");
            }
            output.append("\n");

        //     System.out.print(output);
        }

       System.out.print(output.substring(0, output.length() - 1));

    }
}
