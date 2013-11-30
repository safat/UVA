/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 490

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//uva 490
/**
 *
 * @author user
 */
public class RotatingSentence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner input = new Scanner(new File("in.txt"));
        ArrayList<String> sentences = new ArrayList();
        ArrayList<Integer> lenths = new ArrayList();
        int maxLen = Integer.MIN_VALUE;

        while (input.hasNextLine()) {
            String line = input.nextLine().replaceAll("    ", "");
            int len = line.length();
            if (len > maxLen) {
                maxLen = len;
            }
            lenths.add(len);
            sentences.add(line);
        }
        StringBuilder result = new StringBuilder("");
        int size = sentences.size();
        for (int i = 0; i < maxLen; i++) {
            for (int j = size - 1; j >= 0; j--) {
                if (i < lenths.get(j)) {
                    result.append(sentences.get(j).charAt(i));
                } else {
                    if (i < size - 1)
                    {
                        result.append(" ");
                    }
                }

            }
            //if(i!=maxLen-1)
            result.append("\n");
        }
        System.out.println(result);
    }
}
