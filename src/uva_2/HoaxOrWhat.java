/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11136

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 *
 * @author user
 */
public class HoaxOrWhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> billQueue = new PriorityQueue();
        PriorityQueue<Integer> rbillQueue = new PriorityQueue();
        StringBuilder output = new StringBuilder("");
        while (true) {
            int days = Integer.parseInt(br.readLine());
            long cost = 0;
            if (days == 0) {
                break;
            }
            while (days-- > 0) {
                String billArr[] = br.readLine().split(" ");
                int bills = Integer.parseInt(billArr[0]);
                //  System.out.println("bills "+bills);
                for (int i = 1; i <= bills; i++) {
                    int cBill = Integer.parseInt(billArr[i]);
                    billQueue.add(cBill);
                    rbillQueue.add(-cBill);
                }
                int highest = rbillQueue.poll();
                highest = highest * -1;
                int lowest = billQueue.poll();
                cost += (highest - lowest);

                billQueue.remove(highest);
                rbillQueue.remove(-lowest);
            }
            output.append(cost);
            output.append("\n");
        }
        System.out.print(output);
    }
}
