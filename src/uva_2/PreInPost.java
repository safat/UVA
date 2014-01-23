/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 10701

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class PreInPost {

    static class Node {

        char data;
        Node left, right;

        Node(char data) {
            this.data = data;
        }
    }

    private static int searchIndex(char[] in, char data, int start, int end) {
        int i;
        for (i = start; i <= end; i++) {
            if (in[i] == data) {
                break;
            }
        }
        return i;
    }

    private static Node buildTree(char[] pre, char[] in, int cStart, int cEnd) {
        if (cStart > cEnd) {
            return null;
        }
        Node node = new Node(pre[preIndex++]);
        if (cStart == cEnd) {
            return node;
        }
        int cRootIndex = searchIndex(in, node.data, cStart, cEnd);
        node.left = buildTree(pre, in, cStart, cRootIndex - 1);
        node.right = buildTree(pre, in, cRootIndex + 1, cEnd);
        return node;

    }

    private static void printPostOrder(Node head) {
        if (head != null) {
            printPostOrder(head.left);
            printPostOrder(head.right);
            result.append(head.data);
        }
    }
    static int preIndex = 0;
    static StringBuilder result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder("");
        while (cases-- > 0) {
            result = new StringBuilder("");
            preIndex = 0;
            String[] preIn = br.readLine().split(" ");
            char pre[] = preIn[1].toCharArray();
            char in[] = preIn[2].toCharArray();
            Node head = buildTree(pre, in, 0, pre.length - 1);
            printPostOrder(head);
            output.append(result + "\n");

        }
        System.out.print(output);
    }
}
