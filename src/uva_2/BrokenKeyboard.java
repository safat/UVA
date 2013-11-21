/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;


import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author user
 *///uva 11988
public class BrokenKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String line = input.nextLine();
            String output = "";
            boolean back = false;
            LinkedList<Character> result = new LinkedList<Character>();
            int len = line.length();
            String tmp = "";
            int count = 0;
            for (int i = 0; i < len; i++) {
                if (line.charAt(i) == '[') {
                    back = true;
                    count = 0;
                    continue;
                }
                if (line.charAt(i) == ']') {
                    back = false;
                    count = 0;
                    continue;
                }
                if (back) {
                    result.add(count++, line.charAt(i));
                } else {
                    result.add(line.charAt(i));
                }
            }
            len = result.size();
            for (int i = 0; i < len; i++) {
                output += result.get(i);
            }
            System.out.println(output);

        }
        // TODO code application logic here
    }
}
