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
public class HowOldAreYou {
//uva 11219

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        String dummy = input.nextLine();
        for (int i = 1; i <= cases; i++) {
            dummy = input.nextLine();
            String cDate = input.nextLine();
            String bDate = input.nextLine();
            int cYear, bYear, cMonth, bMonth, cDay, bDay;
            String tmpCurrentDate[] = cDate.split("/");
            String tmpBirthDate[] = bDate.split("/");
            cYear = Integer.parseInt(tmpCurrentDate[2]);
            bYear = Integer.parseInt(tmpBirthDate[2]);
            cMonth = Integer.parseInt(tmpCurrentDate[1]);
            bMonth = Integer.parseInt(tmpBirthDate[1]);
            cDay = Integer.parseInt(tmpCurrentDate[0]);
            bDay = Integer.parseInt(tmpBirthDate[0]);
            int ageYear = 0, ageMonth = 0, ageDay = 0;

            ageYear = cYear - bYear;
            if (cMonth < bMonth) {
                ageYear--;
            }
            if (cMonth == bMonth) {
                if (cDay < bDay) {
                    ageYear--;
                }
            }
            if (ageYear < 0) {
                System.out.println("Case #" + i + ": Invalid birth date");
            } else if (ageYear > 130) {
                System.out.println("Case #" + i + ": Check birth date");
            } else {
                System.out.println("Case #" + i + ": " + ageYear);
            }

        }
    }
}
