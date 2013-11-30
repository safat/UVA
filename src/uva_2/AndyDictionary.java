/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class AndyDictionary {
//uva 10815

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        TreeSet<String> dictionary = new TreeSet();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            line = line.toLowerCase();
            String[] in = line.toLowerCase().split("[^A-Za-z]");
            for (int i = 0; i < in.length; i++) {
                if (!in[i].equals("")) {
                    dictionary.add(in[i]);
                }
            }
        }
        int i = 0;
        int size = dictionary.size();
        StringBuilder output = new StringBuilder("");
        for (String s : dictionary) {
            if (i < size - 1) {
                output.append(s + "\n");
            } else {
                output.append(s);
            }
            i++;
        }
        System.out.println(output);
        // TODO code application logic here
    }
}
//