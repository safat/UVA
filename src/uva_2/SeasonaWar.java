/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Scanner;
//uva 352
/**
 *
 * @author user
 */
public class SeasonaWar {
//uva 352

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = 0;
        while (input.hasNext()) {
            cases++;
            int sqr = input.nextInt();
            String dummy = input.nextLine();
            int[][] imageboard = new int[sqr + 2][sqr + 2];
            for (int i = 1; i <= sqr; i++) {
                char[] tmp = input.nextLine().toCharArray();
                for (int j = 1; j <= tmp.length; j++) {
                    imageboard[i][j] = tmp[j - 1];
                }
            }
         
            /*for(int i = 1; i <= sqr ; i++){
                for(int j = 1; j <= sqr ; j++){
                System.out.print(imageboard[i][j]+"\t");
                }
                System.out.println();
            }
                
            */
            boolean visited[][] = new boolean[sqr + 2][sqr + 2];
            int count = 0;
            for (int i = 1; i <= sqr; i++) {
                for (int j = 1; j <= sqr ; j++) {
                    if(imageboard[i][j]=='1'&&!visited[i][j]){
                     count++;
                     floodfill(i,j,imageboard,visited);
                    }
                }
            }
            
            System.out.println("Image number "+cases+" contains "+count+" war eagles.");
        }
        // TODO code application logic here
    }

    private static void floodfill(int i, int j, int[][] imageboard, boolean[][] visited) {
        visited[i][j] = true;
     //   System.out.println("called for (i,j) = ("+i+","+j+")");
        //visit left cell
        if(imageboard[i][j-1]=='1'&&!visited[i][j-1])
            floodfill(i,j-1,imageboard,visited);
        //visit right cell
        if(imageboard[i][j+1]=='1'&&!visited[i][j+1])
            floodfill(i,j+1,imageboard,visited);
        //visit upper cell
        if(imageboard[i-1][j]=='1'&&!visited[i-1][j])
            floodfill(i-1,j,imageboard,visited);
        //visit lower cell
        if(imageboard[i+1][j]=='1'&&!visited[i+1][j])
            floodfill(i+1,j,imageboard,visited);
        //visit upper left cell
        if(imageboard[i-1][j-1]=='1'&&!visited[i-1][j-1])
            floodfill(i-1,j-1,imageboard,visited);
        //visit lower left cell
        if(imageboard[i+1][j-1]=='1'&&!visited[i+1][j-1])
            floodfill(i+1,j-1,imageboard,visited);
        //upper right
          if(imageboard[i-1][j+1]=='1'&&!visited[i-1][j+1])
            floodfill(i-1,j+1,imageboard,visited);
         //lower right
         if(imageboard[i+1][j+1]=='1'&&!visited[i+1][j+1])
            floodfill(i+1,j+1,imageboard,visited);
          
    }
}
