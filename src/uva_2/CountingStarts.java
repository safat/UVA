/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11244

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CountingStarts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int row = input.nextInt();
            int column = input.nextInt();
            if (row == 0 & column == 0) {
                break;
            }
            String dummy = input.nextLine();
            char[][] inputs = new char[row + 2][column + 2];
            for (int i = 0; i < row; i++) {
                String str = input.nextLine();
                //System.out.println("gotcha "+str);
                char tmp[] = str.toCharArray();
                for (int j = 0; j < tmp.length; j++) {
                    inputs[i+1][j+1] = tmp[j];
                }
            }
            int count = 0;
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= column; j++) {
                    if (inputs[i][j] == '*') {
                     //   System.out.println("(i,j)"+i+","+j);
                        if (inputs[i - 1][j] != '*' && inputs[i + 1][j] != '*' && inputs[i][j - 1] != '*' && inputs[i][j + 1] != '*' && inputs[i - 1][j - 1] != '*'&& inputs[i - 1][j + 1]!='*' && inputs[i + 1][j + 1] != '*'&& inputs[i + 1][j - 1] != '*') {
                            count++;
                       //     System.out.println("hit");
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
    // TODO code application logic here
}

