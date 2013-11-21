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
public class TeX {
    //uva 272

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "";
        String result = "";
        while (input.hasNext()) {
            s += input.nextLine();
            int left = 1;
            char[] tmp = s.toCharArray();
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] == '"') {
                    if (left == 1) {
                        //System.out.print("``");
                        result += "``";
                        left = 0;
                    } else if (left == 0) {
                        result += "''";
                        left = 1;
                    }
                } else {
                    result += tmp[i];
                }
            }
        }
        System.out.println(result);
// TODO code application logic here
    }
}
