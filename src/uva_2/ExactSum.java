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
public class ExactSum {
//uva 11057

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            boolean priceExist[] = new boolean[1000002];
            int bookCount = input.nextInt();
            int prc;
            for (int j = 0; j < bookCount; j++) {
                prc = input.nextInt();
                priceExist[prc] = true;
            }
            int money = input.nextInt();
            int price1, price2;
            price1 = money / 2;
            price2 = money - price1;
            while (true) {
                if (priceExist[price1] && priceExist[price2]) {
                    System.out.println("Peter should buy books whose prices are " + price1 + " and " + price2 + ".\n");
                    break;
                }
                price1 = price1 - 1;
                price2 = money - price1;
            }
            String dummy = input.nextLine();
        }
        // TODO code application logic here
    }
}
