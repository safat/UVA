/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 12347

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Bst {
   static StringBuilder output  = new StringBuilder("");

    private static void insert(Node head, int element) {
        if (element < head.value) {
            if (head.left == null) {
                Node node = new Node();
                node.value = element;
                head.left = node;
            } else {
                insert(head.left, element);
            }
        } else if (element > head.value) {
            if (head.right == null) {
                Node node = new Node();
                node.value = element;
                head.right = node;
            } else {
                insert(head.right, element);
            }
        } else {
            insert(head.right, element);
        }
    }

    private static void printPostOrder(Node head) {
        if (head != null) {
            printPostOrder(head.left);
            printPostOrder(head.right);
            //System.out.println(head.value);
            output.append(head.value + "\n");
        }
    }

    /**
     * @param args the command line arguments
     */
    static class Node {

        int value;
        Node left, right;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        //  Scanner input = new Scanner(new File("in.txt"));
        ArrayList<Integer> preOrderList = new ArrayList();
        String line = "";
        while ((line = br.readLine())!=null) {
            preOrderList.add(Integer.parseInt(line));
        }
        Node head = new Node();
        head.value = preOrderList.get(0);
        int size = preOrderList.size();
        for (int i = 1; i < size; i++) {
            insert(head, preOrderList.get(i));
        }
        printPostOrder(head);
        System.out.print(output);
    }
}

/*
 * 
 // author: Rodrigo Alves
// problem: Binary Search Tree
// url: http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3769
// type: Data Structures
// status: AC
#include <stdio.h>

typedef struct bstree {
    int value;
    struct bstree *leftChild;
    struct bstree *rightChild;
} BSTree;

BSTree* BSTInsert(BSTree *originalTree, int input)
{
    BSTree *newtree = new BSTree();
    newtree -> value = input;

    if (originalTree -> value == 0) {
        originalTree -> value = input;
    } else if (input < originalTree -> value) {
        if (originalTree -> leftChild == NULL) {
            originalTree -> leftChild = newtree;
        } else {
            BSTInsert(originalTree -> leftChild, input);
        }
    } else {
        if (originalTree -> rightChild == NULL) {
            originalTree -> rightChild = newtree;
        } else {
            BSTInsert(originalTree -> rightChild, input);
        }
    }
    return newtree;
}

void postOrder(BSTree *myTree) {
    if (myTree) {
        postOrder(myTree -> leftChild);
        postOrder(myTree -> rightChild);
        printf("%d\n", myTree -> value);
    }
}

int main()
{
    int numero;
    BSTree *arvore = new BSTree();

    while(scanf("%d", &numero) != EOF) {
        BSTInsert(arvore, numero);
    }

    postOrder(arvore);
    return 0;
}
 */