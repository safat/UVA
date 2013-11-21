/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 *///uva 459
public class GraphConnectivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Map<Character, ArrayList<Character>> graph = new HashMap();
        int cases = input.nextInt();
        String dummy = input.nextLine();
        String empty = input.nextLine();
        while (cases-- > 0) {
            char maxNode = input.nextLine().toCharArray()[0];
            //    System.out.println("max node " + maxNode);
            int componentLen = 0;
            while (true) {
                String line = input.nextLine();
                if (line.equals("")) {
                    break;
                }
                //System.out.println("line "+line);
                char tmp[] = line.toCharArray();
                //System.out.println("<>"+tmp.length);
                if (tmp.length == 1) {
                    componentLen = 1;
                }
                if (tmp.length > 1) {
                          System.out.println(tmp[0] + "<>" + tmp[1]);
                    if (graph.containsKey(tmp[0])) {
                        ArrayList<Character> tmpList = graph.get(tmp[0]);
                        tmpList.add(tmp[1]);
                        graph.put(tmp[0], tmpList);
                    } else {
                        ArrayList<Character> tmpList = new ArrayList();
                        tmpList.add(tmp[1]);
                        graph.put(tmp[0], tmpList);
                    }
                    if (graph.containsKey(tmp[1])) {
                        ArrayList<Character> tmpList = graph.get(tmp[1]);
                        tmpList.add(tmp[0]);
                        graph.put(tmp[1], tmpList);
                    } else {
                        ArrayList<Character> tmpList = new ArrayList();
                        tmpList.add(tmp[0]);
                        graph.put(tmp[1], tmpList);
                    }
                }
                int size = graph.size();
                int maxComponent = Integer.MIN_VALUE;
                boolean visited[] = new boolean[maxNode + 2];

                for (Map.Entry<Character, ArrayList<Character>> entry : graph.entrySet()) {
                    char c = entry.getKey();
                    //       System.out.println(" now " + c);
                    if (!visited[c]) {
                        componentLen++;
                        visited[c] = true;
                        ArrayList<Character> adjacency = graph.get(c);
                        int listSize = adjacency.size();
                        for (int k = 0; k < listSize; k++) {
                            if (!visited[adjacency.get(k)]) {
                                dfs(adjacency.get(k), graph, visited);
                            }
                        }
                    }
                }
            }
            System.out.println(componentLen);
        }
    }

    private static void dfs(Character c, Map<Character, ArrayList<Character>> graph, boolean[] visited) {
        if (!visited[c]) {
            visited[c] = true;
            ArrayList<Character> adjacency = graph.get(c);
            int listSize = adjacency.size();
            for (int k = 0; k < listSize; k++) {
                if (!visited[adjacency.get(k)]) {
                    dfs(adjacency.get(k), graph, visited);
                }
            }
        }

    }
}
