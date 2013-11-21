/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class WhereIsMarble {
//uva 10474

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        StringBuffer sb = null;
        while (true) {
            sb = new StringBuffer("");
            String str[] = br.readLine().split(" ");
            int marble = Integer.parseInt(str[0]);
            int query = Integer.parseInt(str[1]);
            ///    System.out.println(marble+" "+query);
            if (marble == 0 && query == 0) {
                break;
            }
            count++;
            int marbles[] = new int[marble];
            for (int i = 0; i < marble; i++) {
                marbles[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(marbles);
            sb.append("CASE# " + count + ":\n");
            for (int i = 0; i < query; i++) {
                int current = Integer.parseInt(br.readLine());
                int index = search(marbles, current);
                index += 1;
                if (index <= 0) {
                    sb.append(current + " not found\n");
                } else {
                    sb.append(current + " found at " + index + "\n");
                }

            }
            System.out.print(sb);
        }
    }
    // TODO code application logic here

    static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
