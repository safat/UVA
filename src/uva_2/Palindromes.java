/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 401

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Palindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        char[] mirrors = new char[100];
        mirrors['A'] = 'A';
        mirrors['E'] = '3';
        mirrors['H'] = 'H';
        mirrors['I'] = 'I';
        mirrors['J'] = 'L';
        mirrors['L'] = 'J';
        mirrors['M'] = 'M';
        mirrors['O'] = 'O';
        mirrors['S'] = '2';
        mirrors['T'] = 'T';
        mirrors['U'] = 'U';
        mirrors['V'] = 'V';
        mirrors['W'] = 'W';
        mirrors['X'] = 'X';
        mirrors['Y'] = 'Y';
        mirrors['Z'] = '5';
        mirrors['1'] = '1';
        mirrors['2'] = 'S';
        mirrors['3'] = 'E';
        mirrors['5'] = 'Z';
        mirrors['8'] = '8';
        mirrors[' '] = ' ';
        // System.out.println(mirrors['P'] == 0);
        StringBuilder output = new StringBuilder("");
        while (input.hasNext()) {
            boolean palindrome = true;
            boolean mirrored = true;
            String word = input.nextLine().trim();
            int len = word.length();
            int indexLeft = 0;
            int indexRight = len - 1;
            //System.out.println(word.charAt(indexLeft) + "<><>" + word.charAt(indexRight));
            while (indexLeft <= indexRight) {
                // System.out.println(word.charAt(indexLeft) + "<><>" + word.charAt(indexRight));
                if (palindrome && (word.charAt(indexLeft) != word.charAt(indexRight))) {
                    //System.out.println(word.charAt(indexLeft)+"<><>"+indexRight);
                    palindrome = false;
                }
                if (mirrored && (mirrors[word.charAt(indexLeft)] != word.charAt(indexRight))) {
                    mirrored = false;
                }
                indexLeft++;
                indexRight--;
            }


            if (mirrored && palindrome) {
                output.append(word + " -- is a mirrored palindrome.\n\n");
            } else if (!mirrored && palindrome) {
                output.append(word + " -- is a regular palindrome.\n\n");
            } else if (mirrored && !palindrome) {
                output.append(word + " -- is a mirrored string.\n\n");
            } else {
                output.append(word + " -- is not a palindrome.\n\n");
            }
           // System.out.print(output);
        }
        System.out.print(output);
    }
}
