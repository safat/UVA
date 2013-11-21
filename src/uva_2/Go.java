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
 */ //uva 852
public class Go {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        String dummy = input.nextLine();
        while (cases-- > 0) {
            int blackStoneCount = 0;
            int whiteStoneCount = 0;

            char[][] board = new char[11][11];
            for (int i = 1; i <= 9; i++) {
                String str = input.nextLine();
                char[] tmp = str.toCharArray();
                for (int j = 1; j <= 9; j++) {
                    board[i][j] = tmp[j - 1];
                    if (tmp[j - 1] == 'X') {
                        blackStoneCount++;
                    } else if (tmp[j - 1] == 'O') {
                        whiteStoneCount++;
                    }
                }
            }
         //   System.out.println(blackStoneCount + ":" + whiteStoneCount);
            boolean visited[][] = new boolean[11][11];
            //flood fill for white
            int count = 1;
            int whiteCoveredCount = 0;
            char antistoneType = 'X';
            if (whiteStoneCount != 0) {
                for (int i = 1; i <= 9; i++) {
                    for (int j = 1; j <= 9; j++) {
                        if (!visited[i][j] && board[i][j] == '.') {
                            count = floodfill(board, i, j, visited, count, antistoneType);
                            whiteCoveredCount += count;
                            count = 1;

                        }
                    }
                }
            }

            boolean visit[][] = new boolean[11][11];
            count = 1;
            int blackCoveredCount = 0;
            antistoneType = 'O';
            if (blackStoneCount != 0) {
                for (int i = 1; i <= 9; i++) {
                    for (int j = 1; j <= 9; j++) {
                        if (!visit[i][j] && board[i][j] == '.') {
                            count = floodfill(board, i, j, visit, count, antistoneType);
                            blackCoveredCount += count;
                            count = 1;

                        }
                    }
                }
            }
            
            System.out.println("Black "+(blackCoveredCount+blackStoneCount)+" White "+(whiteStoneCount+whiteCoveredCount));
        }


        // TODO code application logic here
    }
// for O

    static int floodfill(char[][] board, int i, int j, boolean visited[][], int count, char antiType) {
        //System.out.println("i,j)=(" + i + "," + j + ") count: " + count);
        if ((i <= 0 || i > 9) || (j <= 0 || j > 9)) {
            return count;
        } else if (board[i][j + 1] == antiType || board[i][j - 1] == antiType || board[i - 1][j] == antiType || board[i + 1][j] == antiType) {
            count = 0;
            return count;
        }
        if (board[i][j] == '.' && !visited[i][j]) {
            visited[i][j] = true;
            //System.out.println("dot found " + "i,j)=(" + i + "," + j + ") count: " + count);
            if (board[i][j + 1] == '.' && !visited[i][j + 1]) {
                return floodfill(board, i, j + 1, visited, count + 1, antiType);
            }
            if (board[i][j - 1] == '.' && !visited[i][j - 1]) {
                return floodfill(board, i, j - 1, visited, count + 1, antiType);
            }
            if (board[i - 1][j] == '.' && !visited[i - 1][j]) {
                return floodfill(board, i - 1, j, visited, count + 1, antiType);
            }
            if (board[i + 1][j] == '.' && !visited[i + 1][j]) {
                return floodfill(board, i + 1, j, visited, count + 1, antiType);
            }
        }
        return count;

    }
}
