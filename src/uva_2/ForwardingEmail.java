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
public class ForwardingEmail {
//uvA 12442

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] graph = new int[50050];
        int cases = input.nextInt();
        String dummy = input.nextLine();
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i <= cases; i++) {
            int pairCount = input.nextInt();
            dummy = input.nextLine();
            int emailFrom, emailTo;
            for (int k = 0; k < pairCount; k++) {
                emailFrom = input.nextInt();
                emailTo = input.nextInt();
                graph[emailFrom] = emailTo;
            }
            int maxLen = -1;
            int ans = 0;
            int[] results = new int[pairCount + 1];
            for (int l = 0; l <= pairCount; l++) {
                results[l] = -1;
            }

            for (int m = 1; m <= pairCount; m++) {
                int currentSender = m;
                boolean[] received = new boolean[pairCount + 1];
                //  System.out.println(received[3]);
                //  received[entry.getValue()] = true;
                int seenCount = 1;
                received[currentSender] = true;
                if (results[currentSender] == -1) {
                    seenCount = dfs(currentSender, graph, seenCount, received, results);
                    results[currentSender] = seenCount;
                }
                for (int x = 1; x <= pairCount; x++) {
                    System.out.println(x + ": " + results[x]);
                }
                if (results[currentSender] > maxLen) {
                    ans = currentSender;
                    maxLen = seenCount;
                }
            }
            //     System.out.println("Case " + i + ": " + ans);
            result.append("Case " + i + ": " + ans + "\n");
        }

        System.out.println(result);

    }

    private static int dfs(int currentSender, int[] graph, int count, boolean[] received, int[] results) {
        System.out.println("called for " + currentSender);
        if (received[graph[currentSender]]) {
            return count;
        } else {
            received[graph[currentSender]] = true;
            if (results[currentSender] != -1) {
                return results[currentSender];
            } else {
                return results[currentSender] = dfs(graph[currentSender], graph, count + 1, received, results);
            }
        }
    }
}
