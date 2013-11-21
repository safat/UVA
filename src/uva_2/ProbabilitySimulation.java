/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProbabilitySimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner input = new Scanner(System.in);
        boolean[] isThereResource = new boolean[4];
        int round = 100000;
        int correctGuessM = 0;
        int correctGuess = 0;
        for (int i = 0; i < round; i++) {
            int randomResource;
            randomResource = (1 + ran.nextInt(3));
            isThereResource[randomResource] = true;
            int openedGate;
            int result;
            //   System.out.println("#### Choose a door no between 1 to 3 ###########");
            int userChoice = (1 + ran.nextInt(3));
            while (true) {
                openedGate = (1 + ran.nextInt(3));
                if (openedGate != userChoice && openedGate != randomResource) {
                    break;
                }
            }
            int move = (1 + ran.nextInt(2));
            // 1 not switch 2 switch
            boolean moved = false;
            if (move == 2) {
                userChoice = (6 - (openedGate + userChoice));
                moved = true;
            }
            //     System.out.println("Door #" + openedGate + " is opended now");
            if (userChoice == randomResource) {
                if (moved) {
                    correctGuessM++;
                } else {
                    correctGuess++;
                }
            }
        }
        double result = (double)correctGuess / correctGuessM;
        System.out.println("#ration correctGuess/correctGuessmoved  " + result);
        // TODO code application logic here
    }
}
