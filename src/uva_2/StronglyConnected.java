/*6
 1 2
 1 3
 3 4
 2 4
 5 3
 2 3
 /*

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author user
 */
public class StronglyConnected {

    static int SIZE = 9;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int graph[][] = new int[SIZE + 1][SIZE + 1];
        int graphT[][] = new int[SIZE + 1][SIZE + 1];

        Scanner input = new Scanner(System.in);
        int edgeCount = input.nextInt();
        String dummy = input.nextLine();
        while (edgeCount-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            graph[a][b] = 1;
            graphT[b][a] = 1;
        }

        boolean[] visited = new boolean[SIZE + 1];
        Stack<Integer> nodeStack = new Stack();
        for (int i = 1; i < SIZE; i++) {
            if (!visited[i]) {
                dfs(graph, visited, i, nodeStack);
            }
        }

        boolean[] added = new boolean[SIZE + 1];
        while (!nodeStack.isEmpty()) {

            Stack<Integer> tmp = new Stack();
            int node = nodeStack.pop();
            if (!added[node]) {
                dfs2(graphT, added, node, tmp);
                System.out.println(tmp.toString());
                while (!tmp.isEmpty()) {
                    int cNode = tmp.pop();
                    for (int i = 1; i < SIZE; i++) {
                        graphT[cNode][i] = 0;
                        graphT[i][cNode] = 0;
                    }
                }
            }
        }

    }

    private static void dfs(int[][] graph, boolean[] visited, int node, Stack<Integer> nodeStack) {
        visited[node] = true;
        for (int i = 1; i < graph[node].length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(graph, visited, i, nodeStack);
            }
        }
        nodeStack.add(node);

    }

    private static void dfs2(int[][] graph, boolean[] visited, int node, Stack<Integer> nodeStack) {
        visited[node] = true;
        nodeStack.add(node);
        for (int i = 1; i < graph[node].length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs2(graph, visited, i, nodeStack);
            }
        }


    }
}
