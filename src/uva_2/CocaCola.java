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
//uva 11877
public class CocaCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int n = input.nextInt();
            if (n == 0) {
                break;
            }
            int count = 0;
            while (true) {
                count += n / 3;
                n = n / 3 + n % 3;
                if (n < 3) {
                    break;
                }
            }
            if (n == 2) {
                count += 1;
            }
            System.out.println(count);
        }
        // TODO code application logic here
    }
}
