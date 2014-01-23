/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 10494

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author user
 */
public class IFICHILD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        String operationOperator[] = new String[3];

        StringBuilder output = new StringBuilder("");
        while ((line = br.readLine()) != null) {
            operationOperator = line.split("\\s+");
            BigInteger n1 = new BigInteger(operationOperator[0]);
            BigInteger n2 = new BigInteger(operationOperator[2]);
            if (operationOperator[1].equals("/")) {
                output.append(n1.divide(n2).toString() + "\n");
            } else {
                output.append(n1.divideAndRemainder(n2)[1] + "\n");
            }
          //  System.out.print(output);
        }
        System.out.print(output);
    }
}
