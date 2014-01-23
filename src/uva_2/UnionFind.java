/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class UnionFind {

    static class Edge {

        int source, destination;

        public Edge(int s, int d) {
            this.source = s;
            this.destination = d;
        }

        public Edge() {
        }
    }

    static class Graph {

        int vertexCount, edgeCount;
        Edge[] edge;
    }

    static Graph createGraph(int numberOfVertex, int numberOfE) {
        Graph graph = new Graph();
        Edge edge = new Edge(numberOfVertex, numberOfE);
        graph.vertexCount = numberOfVertex;
        graph.edgeCount = numberOfE;
        graph.edge = new Edge[numberOfE];
        for (int i = 0; i < numberOfE; i++) {
            graph.edge[i] = new Edge();
        }
        return graph;
    }
    // A utility function to find the subset of an element i

    static int find(int parent[], int i) {
        if (parent[i] == -1) {
            return i;
        }
        return find(parent, parent[i]);
    }

// A utility function to do union of two subsets 
    static void Union(int parent[], int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    static boolean isCycle(Graph graph) {
        // Allocate memory for creating V subsets
        int[] parent = new int[graph.vertexCount];

        // Initialize all subsets as single element sets
        for (int i = 0; i < parent.length; i++) {
            parent[i] = -1;
        }

        // Iterate through all edges of graph, find subset of both
        // vertices of every edge, if both subsets are same, then there is
        // cycle in graph.
        for (int i = 0; i < graph.edgeCount; ++i) {
            int x = find(parent, graph.edge[i].source);
            int y = find(parent, graph.edge[i].destination);

            if (x == y) {
                return true;
            }

            Union(parent, x, y);
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = createGraph(3, 3);
        graph.edge[0].source = 0;
        graph.edge[0].destination = 1;
        graph.edge[1].source = 1;
        graph.edge[1].destination = 2;
        graph.edge[2].source = 0;
        graph.edge[2].destination = 2;
        if (isCycle(graph)) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn't contain cycle");
        }


    }
}
