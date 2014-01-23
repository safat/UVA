/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//11340

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class Newspaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        int caseCount = Integer.parseInt(br.readLine());
       // String dummy = br.readLine();
      //  int letter = Integer.parseInt(br.readLine());
        String line = "";
        while (caseCount-- > 0) {
            Map<String,Double> priceMap = new HashMap();
            int priceCount = Integer.parseInt(br.readLine());
            while (priceCount-- > 0) {
                line = br.readLine();
                String[] prices = line.split(" ");
              //  price[line.charAt(0)] = Double.parseDouble(prices[1]);
                priceMap.put(prices[0],Double.parseDouble(prices[1]));
            }

            int lines = Integer.parseInt(br.readLine());
            double totalCent = 0;
            while (lines-- > 0) {
                StringBuilder tmp = new StringBuilder(br.readLine());
                int len = tmp.length();
                for (int i = 0; i < len; i++) {
                    if(priceMap.containsKey(tmp.charAt(i)+""))
                    totalCent += priceMap.get(tmp.charAt(i)+"");
                }
            }
            
            totalCent /= 100;
            //System.out.println(totalCent);
              System.out.printf("%.2f$\n", totalCent);
        }
       // System.out.print(output);
    }
}
