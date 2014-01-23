/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 536

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author user
 */
public class TreeRecovery {

    static int preIndex = 0;

    private static Node buildTree(char[] pre, char[] in, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }
        /* Pick current node from Preorder traversal using preIndex
         and increment preIndex */
        Node node = new Node(pre[preIndex++]);
        /* If this node has no children then return */
        if (inStart == inEnd) {
            return node;
        }
        /* Else find the index of this node in Inorder traversal */
        int inIndex = search(in, inStart, inEnd, node.value);
        /* Using index in Inorder traversal, construct left and
         right subtress */
        node.left = buildTree(pre, in, inStart, inIndex - 1);
        node.right = buildTree(pre, in, inIndex + 1, inEnd);
        return node;
    }

    private static int search(char[] arr, int start, int end, char value) {
        int i;
        for (i = start; i <= end; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return i;
    }

    static class Node {

        Node left, right;
        char value;

        public Node(char value) {
            this.value = value;
        }
    }
    /**
     * @param args the command line arguments
     */
    static StringBuilder output = new StringBuilder("");

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        StringBuilder result = new StringBuilder("");
        while ((line = br.readLine()) != null) {
            preIndex = 0;
            String[] preOrderInOrder = line.split(" ");
            char in[] = preOrderInOrder[1].toCharArray();
            char pre[] = preOrderInOrder[0].toCharArray();
            output = new StringBuilder("");
            Node head = buildTree(pre, in, 0, pre.length - 1);
            printPostOrder(head);
            result.append(output + "\n");
            System.out.println(result);

        }
        System.out.print(result);
    }

    private static void printPostOrder(Node head) {
        if (head != null) {
            printPostOrder(head.left);
            printPostOrder(head.right);
            //System.out.println(head.value);
            output.append(head.value);
        }
    }
}
