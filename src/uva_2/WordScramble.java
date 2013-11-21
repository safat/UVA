/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 483

import java.util.Scanner;

/**
 *
 * @author user
 */
public class WordScramble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String sentence = input.nextLine();
            String output = "";
            int len = sentence.length();
            for (int i = 0; i < len; i++) {
                if (sentence.charAt(i) == ' ') {
                    output += sentence.charAt(i);
                } else {
                    StringBuilder tmp = new StringBuilder("");
                    while (i < len && sentence.charAt(i) != ' ' ) {
                        tmp.append(sentence.charAt(i));
                        i++;
                    }
                    if (i < len) {
                        i -= 1;
                    }
                    output += (tmp.reverse());
                }
            }
            System.out.println(output);
        }
    }
}
