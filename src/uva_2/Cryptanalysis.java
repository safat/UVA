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
public class Cryptanalysis {

    /**
     * @param args the command line arguments
     */
    //uva 10008
    public static void main(String[] args) {
        int characterFrequency[] = new int[26];
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        String dumm = input.nextLine();
        String line = "";
        while (cases-- > 0) {
            line += input.nextLine();
        }
        int len = line.length();
        for (int i = 0; i < len; i++) {
            if (isSmall(line.charAt(i))) {
                characterFrequency[line.charAt(i) - 65 - 32] += 1;
            } else if (isCapital(line.charAt(i))) {
                characterFrequency[line.charAt(i) - 65] += 1;
            }
        }

        int array_index[] = new int[26];
        int array_frequency[] = new int[26];
        for (int i = 0; i < 26; i++) {
            array_index[i] = i;
            array_frequency[i] = characterFrequency[i];
        }

        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                if (array_frequency[i] <= array_frequency[j]) {
                    //  System.out.println("comparing " + (char) (array_index[i] + 65) + " with " + (char) (array_index[j] + 65));
                    if (array_frequency[i] == array_frequency[j]) {
                        if (array_index[i] < array_index[j]) {
                            //   System.out.println("dnt swap");
                            continue;
                        } else {
                            int tmp = array_frequency[i];
                            array_frequency[i] = array_frequency[j];
                            array_frequency[j] = tmp;
                            tmp = array_index[i];
                            array_index[i] = array_index[j];
                            array_index[j] = tmp;
                        }
                    } else {
                        int tmp = array_frequency[i];
                        array_frequency[i] = array_frequency[j];
                        array_frequency[j] = tmp;
                        tmp = array_index[i];
                        array_index[i] = array_index[j];
                        array_index[j] = tmp;

                    }

                }

            }
        }
        for (int i = 0;
                i < 26; i++) {
            if (array_frequency[i] > 0) {
                System.out.println((char) (array_index[i] + 65) + " " + array_frequency[i]);
            }
        }
        // System.out.println(characterOrderFrequency.toString()+":"+characterOrderFrequency.size());
    }

    static boolean isSmall(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    static boolean isCapital(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        } else {
            return false;
        }

    }
}
