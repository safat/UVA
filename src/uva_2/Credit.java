/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11078

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Credit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        String dummy = input.nextLine();
        while (testCases-- > 0) {
            int studentNo = input.nextInt();
            dummy = input.nextLine();

            //int prev = input.nextInt();
            int students[] = new int[studentNo];
            int result;
            for (int i = 0; i < studentNo; i++) {
                students[i] = input.nextInt();
            }
            // System.out.println(max);
            int max = Integer.MIN_VALUE;
            int minJunior = Integer.MAX_VALUE;
            for (int i = studentNo - 2; i >= 0; i--) {
                minJunior = Math.min(minJunior, students[i + 1]);
                max = Math.max(students[i]-minJunior, max);
            }
            System.out.println(max);

        }
        // TODO code application logic here
    }
}
