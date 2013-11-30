/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dummy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("in.txt"));
        String text="";
        while(input.hasNextLine()){
          text = input.nextLine();
          String[] words = text.split("[^a-zA-Z0-9']+");
          for(String word : words)
              System.out.println(word);
        }
      
       
        // TODO code application logic here
    }
}
