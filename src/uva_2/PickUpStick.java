/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//11686

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author user
 */
public class PickUpStick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        while (true) {
            String in = br.readLine();
            String[] line = in.split(" ");
            int sticks = Integer.parseInt(line[0]);
            int edges = Integer.parseInt(line[1]);
            if (sticks == 0 && edges == 0) {
                break;
            }
            ArrayList<Integer>[] adjacency = new ArrayList[sticks + 1];
            for (int i = 1; i <= sticks; i++) {
                adjacency[i] = new ArrayList<Integer>();
            }
            for (int i = 1; i <= edges; i++) {
                line = br.readLine().split(" ");
                int nodeA = Integer.parseInt(line[0]);
                int nodeB = Integer.parseInt(line[1]);
                adjacency[nodeA].add(nodeB);
            }

            boolean visited[] = new boolean[sticks + 1];
            boolean[] cycled = new boolean[1];
            int status[] = new int[sticks + 1];
            Stack<Integer> stickStack = new Stack();
            for (int i = 1; i <= sticks; i++) {
               cycled[0] = false;
                if (status[i] == 0) {
                    dfs(adjacency, i, status, stickStack, cycled);
                    if (cycled[0]) {
                        break;
                    }
                }
            }

            if (stickStack.empty()||cycled[0]) {
                output.append("IMPOSSIBLE\n");
            } else {
                while (!stickStack.isEmpty()) {
                    output.append(stickStack.pop() + "\n");
                }
            }
        }
        System.out.print(output);
    }

    private static void dfs(ArrayList<Integer>[] adjacency, int cNode, int[] status, Stack<Integer> stickStack, boolean[] cycled) {
        status[cNode] = 1;
        ArrayList<Integer> neighbours = adjacency[cNode];
        int size = neighbours.size();
        for (int i = 0; i < size; i++) {
            int node = neighbours.get(i);
            if (status[node] == 0) {
                dfs(adjacency, node, status, stickStack, cycled);
            } else if (status[node] == 1) {
                cycled[0] = true;
                return;
            }
        }
        status[cNode] = 2;
        stickStack.push(cNode);
    }
}
