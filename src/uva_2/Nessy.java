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
public class Nessy {
//uva 11044

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = Integer.parseInt(input.nextLine());
        while (caseCount-- > 0) {
            double row = input.nextDouble();
            double column = input.nextDouble();
            row -= 2;
            column -= 2;
            int result = (int)Math.ceil(row/3) * (int) Math.ceil(column/3);
            System.out.println(result);
            
        }

        // TODO code application logic here
    }
}
