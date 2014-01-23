/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11060

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author user
 */
public class Beverages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // BufferedReader br = new BufferedReader(new FileReader("in.txt"));
        String count = "";
        int cases = 1;
        StringBuilder result = new StringBuilder("");
        while ((count = br.readLine()) != null) {

            Map<String, Integer> beverageMap = new HashMap();
            Map<Integer, String> rBeverageMap = new HashMap();
            //  System.out.println("<>"+br.readLine());
            int beverageCount = Integer.parseInt(count);

            for (int i = 1; i <= beverageCount; i++) {
                String beverageName = br.readLine();
                beverageMap.put(beverageName, i);
                rBeverageMap.put(i, beverageName);
            }
            ArrayList<Integer>[] adjacency = new ArrayList[beverageCount + 1];
            for (int i = 1; i <= beverageCount; i++) {
                adjacency[i] = new ArrayList<Integer>();
            }
            int edgeCount = Integer.parseInt(br.readLine());
            for (int i = 1; i <= edgeCount; i++) {
                String nodes[] = br.readLine().split(" ");
                adjacency[beverageMap.get(nodes[0])].add(beverageMap.get(nodes[1]));


            }

            boolean[] visited = new boolean[beverageCount + 1];
            Stack<Integer> nodeStack = new Stack();
            for (int i = adjacency.length - 1; i >= 1; i--) {
                if (!visited[i]) {
                    dfs(adjacency, i, nodeStack, visited);
                }

            }
            result.append("Case #" + cases + ": Dilbert should drink beverages in this order:");
            cases++;
            while (!nodeStack.isEmpty()) {
                result.append(" " + rBeverageMap.get(nodeStack.pop()));
                // System.out.println(rBeverageMap.get(nodeStack.pop()));
            }
            result.append(".\n\n");
            br.readLine();
         //  System.out.println(result);
        }
        System.out.print(result);
    }

    private static void dfs(ArrayList<Integer>[] adjacency, int cNode, Stack<Integer> nodeStack, boolean[] visited) {
        visited[cNode] = true;
        ArrayList<Integer> neighbours = adjacency[cNode];
        Collections.sort(neighbours, Collections.reverseOrder());
        int size = neighbours.size();
        for (int i = 0; i < size; i++) {
            int nNode = neighbours.get(i);
            if (!visited[nNode]) {
                dfs(adjacency, nNode, nodeStack, visited);
            }
        }
        nodeStack.push(cNode);
    }
}
