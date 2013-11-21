/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;

/**
 *
 * @author user
 */// uva 494
public class KindergartenCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String line = input.nextLine();
            int len = line.length();
            boolean inWord = false;
            int wordCount = 0;
            for (int i = 0; i < len; i++) {
                if (isAlphabet(line.charAt(i)) && (!inWord)) {
                    wordCount += 1;
                    inWord = true;
                } else if (!isAlphabet(line.charAt(i)) && inWord) {
                    inWord = false;
                }
            }
            System.out.println(wordCount);
        }
        // TODO code application logic here
    }

    static boolean isAlphabet(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        } else {
            return false;
        }

    }
}
