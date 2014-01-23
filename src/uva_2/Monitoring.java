/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 10687

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Monitoring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        while (true) {
            int nodes = Integer.parseInt(br.readLine());
            if (nodes == 0) {
                break;
            }
            int x[] = new int[nodes];
            int y[] = new int[nodes];
            String[] inputs = br.readLine().split(" ");
            int xC = 0;
            int yC = 0;
            for (int i = 0; i < inputs.length; i++) {
                if (i % 2 == 0) {
                    x[xC++] = Integer.parseInt(inputs[i]);
                } else {
                    y[yC++] = Integer.parseInt(inputs[i]);
                }
            }
            ArrayList<Integer>[] adjacency = new ArrayList[nodes];
            for (int i = 0; i < adjacency.length; i++) {
                adjacency[i] = new ArrayList();
            }
            for (int i = 0; i < x.length; i++) {
                double fMin = Double.MAX_VALUE;
                double sMin = Double.MAX_VALUE - 1.0;
                int fIndex = 0;
                int sIndex = 0;
                boolean first = true;
                for (int j = 0; j < x.length; j++) {
                    if (i != j) {
                        double distance = Math.pow((x[i] - x[j]), 2) + Math.pow((y[i] - y[j]), 2);
                     //   System.out.println("distance of " + j + " -> " + distance);
                        if (distance < fMin) {
                            if (!first) {
                                sMin = fMin;
                                sIndex = fIndex;
                            }
                            fMin = distance;
                            fIndex = j;
                        } else if (distance >= fMin && distance < sMin) {
                            sMin = distance;
                            sIndex = j;
                        }
                        first = false;
                       // System.out.println(fMin+"<>"+sMin);
                    }

                }

               // System.out.println("for " + i + " adjacent are " + fIndex + ":" + fMin + " " + sIndex + ":" + sMin);
                adjacency[i].add(sIndex);
                adjacency[i].add(fIndex);

            }
            boolean visited[] = new boolean[nodes];
            int start = 0;
            dfs(start, adjacency, visited);
            boolean allreachable = true;
            for (int i = 0; i < visited.length; i++) {
                if (!visited[i]) {
                    allreachable = false;
                    break;
                }
            }
            if (allreachable) {
                output.append("All stations are reachable.\n");
            } else {
                output.append("There are stations that are unreachable.\n");
            }
        }
        
        System.out.print(output);

    }

    private static void dfs(int start, ArrayList<Integer>[] adjacency, boolean[] visited) {
        visited[start] = true;
        ArrayList<Integer> tmp = adjacency[start];
        for (int i = 0; i < 2; i++) {
            if (!visited[tmp.get(i)]) {
                dfs(tmp.get(i), adjacency, visited);
            }
        }
    }
}
