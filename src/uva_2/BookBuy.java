/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BookBuy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int prices[] = new int[n];
            for (int i = 0; i < n; i++) {
                prices[i] = input.nextInt();
            }

            int money = input.nextInt();
            int price1, price2;
            price1 = money / 2;
            price2 = money - price1;
            Arrays.sort(prices);
            while (true) {
                if (Arrays.binarySearch(prices, price1) > 0 && Arrays.binarySearch(prices, price2) > 0) {
                    System.out.println("price 1 = " + price1 + " price2 " + price2);
                    break;
                }
                price1 = price1 - 1;
                price2 = money - price1;
            }
        }

        // TODO code application logic here
    }
}
