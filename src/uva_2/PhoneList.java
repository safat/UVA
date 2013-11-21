/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class PhoneList {
//uva 11362 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = Integer.parseInt(input.nextLine());
        while (testCases-- > 0) {
            int numberCount = Integer.parseInt(input.nextLine());
            Set<String> numbers = new TreeSet();
            while (numberCount-- > 0) {
                numbers.add(input.nextLine());
            }
            boolean hasPrefix = false;
            String prev = "..";
       //     System.out.println(numbers.toString());
            for (String s : numbers) {
          //      System.out.println("prev : "+prev+"  current "+s);
                if (s.startsWith(prev)) {
                    hasPrefix = true;
                    break;
                }
                prev = new String(s);
            }
            if (hasPrefix) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
    }
}
