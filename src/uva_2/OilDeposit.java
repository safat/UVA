/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 572

import java.util.Scanner;

/**
 *
 * @author user
 */
public class OilDeposit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int row = input.nextInt();
            int column = input.nextInt();
            if (row == 0) {
                break;
            }
            String dummy = input.nextLine();
            char[][] field = new char[row + 2][column + 2];

            for (int i = 1; i <= row; i++) {
                char[] tmp = input.nextLine().toCharArray();
                for (int j = 1; j <= column; j++) {
                    field[i][j] = tmp[j - 1];
                }
            }
           /*    for(int i = 1; i <= row ; i++){
                for(int j = 1; j <= column ; j++){
                System.out.print(field[i][j]+"\t");
                }
                System.out.println();
            }
             */   
            boolean visited[][] = new boolean[row + 2][column + 2];
            int count = 0;

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= column; j++) {
                    if (field[i][j] == '@' && !visited[i][j]) {
                        count++;
                        floodfill(i, j, field, visited);
                    }
                }

            }
            System.out.println(count);
            // TODO code application logic here

        }
    }

    private static void floodfill(int i, int j, char[][] field, boolean[][] visited) {
        visited[i][j] = true;
        //   System.out.println("called for (i,j) = ("+i+","+j+")");
        //visit left cell
        if (field[i][j - 1] == '@' && !visited[i][j - 1]) {
            floodfill(i, j - 1, field, visited);
        }
        //visit right cell
        if (field[i][j + 1] == '@' && !visited[i][j + 1]) {
            floodfill(i, j + 1, field, visited);
        }
        //visit upper cell
        if (field[i - 1][j] == '@' && !visited[i - 1][j]) {
            floodfill(i - 1, j, field, visited);
        }
        //visit lower cell
        if (field[i + 1][j] == '@' && !visited[i + 1][j]) {
            floodfill(i + 1, j, field, visited);
        }
        //visit upper left cell
        if (field[i - 1][j - 1] == '@' && !visited[i - 1][j - 1]) {
            floodfill(i - 1, j - 1, field, visited);
        }
        //visit lower left cell
        if (field[i + 1][j - 1] == '@' && !visited[i + 1][j - 1]) {
            floodfill(i + 1, j - 1, field, visited);
        }
        //upper right
        if (field[i - 1][j + 1] == '@' && !visited[i - 1][j + 1]) {
            floodfill(i - 1, j + 1, field, visited);
        }
        //lower right
        if (field[i + 1][j + 1] == '@' && !visited[i + 1][j + 1]) {
            floodfill(i + 1, j + 1, field, visited);
        }

    }
}
