/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 12015

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author user
 */
public class FeelingLucky {

    static class Pages {

        String name;
        int rank;

        public Pages(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder("");
        for (int i = 1; i <= caseCount; i++) {
            output.append("Case #" + i + ":\n");
            int maxRank = Integer.MIN_VALUE;
            Queue<Pages> webpageQueue = new LinkedList();
            for (int j = 0; j < 10; j++) {
                String line[] = br.readLine().split(" ");
                int rank = Integer.parseInt(line[1]);
                if (rank >= maxRank) {
                    maxRank = rank;
                    webpageQueue.add(new Pages(line[0], rank));
                }
            }
            while (webpageQueue.peek().rank != maxRank) {
                webpageQueue.poll();
            }
            Pages webpage = webpageQueue.poll();
            output.append(webpage.name + "\n");
            int rank = webpage.rank;
            while (!webpageQueue.isEmpty()) {
                webpage = webpageQueue.poll();
                if (webpage.rank == rank) {
                    output.append(webpage.name + "\n");
                } else {
                    break;
                }
            }
        }
        System.out.print(output);
    }
}
