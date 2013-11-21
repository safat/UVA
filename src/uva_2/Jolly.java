/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;

/**
 *
 * @author user
 *///10038
public class Jolly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String line = input.nextLine();
            String[] numbers = line.split(" ");
            int n = Integer.parseInt(numbers[0]);
            boolean[] isJolly = new boolean[n];
            boolean jolly = true;
            int jollyCount = n - 1;
            for (int i = 1; i < numbers.length - 1; i++) {
                int a = Integer.parseInt(numbers[i]);
                int b = Integer.parseInt(numbers[i + 1]);
                if (Math.abs(b - a) <= n - 1 && Math.abs(b - a) >= 1) {
                    if (!isJolly[Math.abs(b - a)]) {
                        jollyCount--;
                    }
                    isJolly[Math.abs(b - a)] = true;
                } else {
                    jolly = false;
                    break;
                }
            }

            if (jollyCount == 0) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }

        }
        // TODO code application logic here
    }
}
