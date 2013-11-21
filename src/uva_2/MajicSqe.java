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
public class MajicSqe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();
        String dum = input.nextLine();
        
        for (int k = 1; k <= testCases; k++) {
            
            String s = filter(input.nextLine());
            System.out.println("Case #" + k + ":");
            int len = s.length();
            double n1 = Math.sqrt(len);
            boolean isMajic = true;
            int n = (int) n1;
            if (n - (int) n != 0) {
                isMajic = false;
            } else {
                //String sRev = reverse(s);
                if (!(paliHorizontal(s, len))) {
                    isMajic = false;
                }
            }
            if (isMajic) {
                System.out.println(n);
            } else {
                System.out.println("No magic :(");
            }
        }
        // TODO code application logic here
    }

    public static String filter(String str) {
        StringBuilder tmp = new StringBuilder("");
        int len = str.length();
        for (int i = 0; i <len ; i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                tmp.append(str.charAt(i));
            }
        }
        return tmp.toString();
    }

    static boolean paliHorizontal(String s, int len) {
        int j = len - 1;
        int size = len / 2;
        for (int i = 0; i < size; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;

    }
   
}
