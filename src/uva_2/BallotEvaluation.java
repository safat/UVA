
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11629

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class BallotEvaluation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        String[] ins = br.readLine().split(" ");
        int candidate = Integer.parseInt(ins[0]);
        int guess = Integer.parseInt(ins[1]);
        String vote[];
        Map<String, Integer> voteMap = new HashMap();
        for (int i = 0; i < candidate; i++) {
            vote = br.readLine().split(" ");
            double tmp = Double.parseDouble(vote[1])*10.0;
            voteMap.put(vote[0],(int)tmp);
        }
        String operations[];
        for (int i = 0; i < guess; i++) {
            output.append("Guess #" + (i + 1));
            operations = br.readLine().split(" ");
            int result = Integer.parseInt(operations[operations.length - 1])*10;
            String operation = operations[operations.length - 2];
            //    System.out.println("operation." + operation);
            int sum = 0;
            for (int j = 0; j < operations.length - 2; j += 2) {
                sum += (voteMap.get(operations[j]));
            }
           // System.out.println(sum);
            if (operation.equals("=")) {
                if (sum == result) {
                    output.append(" was correct.\n");
                } else {
                    output.append(" was incorrect.\n");
                }
            } else if (operation.equals(">")) {
                if (sum > result) {
                    output.append(" was correct.\n");
                } else {
                    output.append(" was incorrect.\n");
                }
            } else if (operation.equals("<")) {
                if (sum < result) {
                    output.append(" was correct.\n");
                } else {
                    output.append(" was incorrect.\n");
                }
            } else if (operation.equals(">=")) {
                if (sum >= result) {
                    output.append(" was correct.\n");
                } else {
                    output.append(" was incorrect.\n");
                }
            } else if (operation.equals("<=")) {
                if (sum <= result) {
                    output.append(" was correct.\n");
                } else {
                    output.append(" was incorrect.\n");
                }
            }



        }
        System.out.print(output);
    }
}
