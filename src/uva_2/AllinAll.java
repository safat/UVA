/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AllinAll {
//uva 10340

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String[] in = input.nextLine().split(" ");
            char[] original = in[0].toCharArray();
            char[] encoded = in[1].toCharArray();
            int searchLowRange = 0;
            boolean isEncoded = false;
            if (in[0].length() == 0) {
                isEncoded = true;
            } else if (in[1].length() < in[0].length()) {
                isEncoded = false;
            } else {
                for (int i = 0; i < original.length; i++) {
                    isEncoded = false;
                    for (int j = searchLowRange; j < encoded.length; j++) {
                        if (original[i] == encoded[j]) {
                            searchLowRange = j+1;
                            isEncoded = true;
                            break;
                        }
                    }
                    if (!isEncoded) {
                        break;
                    }
                }
            }
            if (isEncoded) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
