/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class CombinationBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 1};
        int r = 3;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        printCombination(arr, n, r);
    }

// The main function that prints all combinations of size r
// in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r) {
        // A temporary array to store all combination one by one
        int data[] = new int[r];
        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, n, r, 0, data, 0);
    }

    /* arr[]  ---> Input Array
     n      ---> Size of input array
     r      ---> Size of a combination to be printed
     index  ---> Current index in data[]
     data[] ---> Temporary array to store current combination
     i      ---> index of current element in arr[]     */
    static void combinationUtil(int arr[], int n, int r, int index, int data[], int i) {
        // Current cobination is ready, print it
        //   System.out.println("index "+index+" i "+i);
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.printf("%d ", data[j]);
            }
            System.out.println();
            return;
        }

        // When no more elements are there to put in data[]
        if (i >= n) {
            return;
        }

        // current is included, put next at next location
        data[index] = arr[i];
        combinationUtil(arr, n, r, index + 1, data, i + 1);
        while (i < n - 2 && arr[i] == arr[i + 1]) {
            i++;
        }
        // current is excluded, replace it with next (Note that
        // i+1 is passed, but index is not changed)
        combinationUtil(arr, n, r, index, data, i + 1);
    }
}
