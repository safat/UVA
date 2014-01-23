/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 10905

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author user
 */
public class ChildrenGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        while (true) {
            int numberCount = Integer.parseInt(br.readLine());
            if (numberCount == 0) {
                break;
            }
            String numbers[] = br.readLine().split(" ");
            sort(numbers);

            for (int i = numbers.length - 1; i >= 0; i--) {
                //  System.out.println(numbers[i]);
                output.append(numbers[i]);
            }
            output.append("\n");

        }
        System.out.print(output);
    }

    private static void sort(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (!firstLessThanSecond(numbers[j], numbers[j + 1])) {
                    //   System.out.println("swapping");
                    String tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }

    }

    private static boolean firstLessThanSecond(String first, String second) {
        BigInteger n1 = new BigInteger(first + second);
        BigInteger n2 = new BigInteger(second + first);
        if (n1.compareTo(n2) > 0) {
            return false;
        } else {
            return true;
        }
    }
}