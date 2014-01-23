/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 280

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class Vertex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");
        while (input.hasNext()) {
            int nodeCount = input.nextInt();
            if (nodeCount == 0) {
                break;
            }
            String dummy = input.nextLine();
            TreeSet<Integer> adjacency[] = new TreeSet[nodeCount + 1];
            for (int i = 1; i <= nodeCount; i++) {
                adjacency[i] = new TreeSet();
            }
            while (true) {
                String[] edges = input.nextLine().split(" ");
                int cNode = Integer.parseInt(edges[0]);
                if (cNode == 0) {
                    break;
                }
                for (int i = 1; i < edges.length - 1; i++) {
                    adjacency[cNode].add(Integer.parseInt(edges[i]));
                }

            }
            String startingNodes[] = input.nextLine().split(" ");

            for (int i = 1; i < startingNodes.length; i++) {
                boolean isVisited[] = new boolean[nodeCount + 1];
                int cStart = Integer.parseInt(startingNodes[i]);
                //isVisited[cStart] = true;
                dfs(adjacency, cStart, isVisited);
                StringBuilder tmp = new StringBuilder("");
                int unreachedCount = 0;
                for (int j = 1; j < isVisited.length; j++) {
                    if (!isVisited[j]) {
                        unreachedCount++;
                        tmp.append(" " + j);
                    }
                }
                output.append(unreachedCount + "").append(tmp + "\n");
            }
        }
        System.out.print(output);
    }

    private static void dfs(TreeSet<Integer>[] adjacency, int cStart, boolean[] isVisited) {
        Set<Integer> cNeighbourSet = adjacency[cStart];
        for (int node : cNeighbourSet) {
            if (!isVisited[node]) {
                isVisited[node] = true;
                dfs(adjacency, node, isVisited);
            }
        }
    }
}