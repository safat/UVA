/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Slogan {
//uva 12592

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> slogan = new HashMap();
        int sloganCount = input.nextInt();
        String dummy = input.nextLine();
        for (int i = 0; i < sloganCount; i++) {
            slogan.put(input.nextLine(), input.nextLine());
        }
        int n = Integer.parseInt(input.nextLine());
        while (n-- > 0) {
            System.out.println(slogan.get(input.nextLine()));
        }
        // TODO code application logic here
    }
}
