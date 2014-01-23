/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11089

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class FiBinary {

    static int size = 1000000000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> fiBinary = getBinary(size);
    }

    private static ArrayList<String> getBinary(int size) {
        int count = 0;
        int n = 0;
        ArrayList<String> tmp = new ArrayList();
        while (true) {
            if (n == size) {
                break;
            }
            String binary = Integer.toBinaryString(n);
            if (!binary.contains("11")) {
                System.out.println(count+" : "+binary);
                tmp.add(binary);
                count++;
            }
            n++;
        }
        return tmp;
    }
}
