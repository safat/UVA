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
public class LCS {
//uva 10405

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String firstStr = input.nextLine();
            String secondStr = input.nextLine();
            String subString = lcs(firstStr, secondStr);
            System.out.println(subString.length());
        }
        // TODO code application logic here
    }

    public static String lcs(String a, String b) {
    int[][] lengths = new int[a.length()+1][b.length()+1];
 
    // row 0 and column 0 are initialized to 0 already
 
    for (int i = 0; i < a.length(); i++)
        for (int j = 0; j < b.length(); j++)
            if (a.charAt(i) == b.charAt(j))
                lengths[i+1][j+1] = lengths[i][j] + 1;
            else
                lengths[i+1][j+1] =
                    Math.max(lengths[i+1][j], lengths[i][j+1]);
 
    // read the substring out from the matrix
    StringBuffer sb = new StringBuffer();
    for (int x = a.length(), y = b.length();
         x != 0 && y != 0; ) {
        if (lengths[x][y] == lengths[x-1][y])
            x--;
        else if (lengths[x][y] == lengths[x][y-1])
            y--;
        else {
            assert a.charAt(x-1) == b.charAt(y-1);
            sb.append(a.charAt(x-1));
            x--;
            y--;
        }
    }
 
    return sb.reverse().toString();
}
}
