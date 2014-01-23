/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class February {
//uva 12439

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Map<String, Integer> monthDays = new HashMap();
        Map<String, Integer> monthIndex = new HashMap();
        //  boolean leap[] = new boolean[1999998001];
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        monthDays.put("January", 31);
        monthDays.put("February", 28);
        monthDays.put("March", 31);
        monthDays.put("April", 30);
        monthDays.put("May", 31);
        monthDays.put("June", 30);
        monthDays.put("July", 31);
        monthDays.put("August", 31);
        monthDays.put("September", 30);
        monthDays.put("October", 31);
        monthDays.put("November", 30);
        monthDays.put("December", 31);
        monthIndex.put("January", 1);
        monthIndex.put("February", 2);
        monthIndex.put("March", 3);
        monthIndex.put("April", 4);
        monthIndex.put("May", 5);
        monthIndex.put("June", 6);
        monthIndex.put("July", 7);
        monthIndex.put("August", 8);
        monthIndex.put("September", 9);
        monthIndex.put("October", 10);
        monthIndex.put("November", 11);
        monthIndex.put("December", 12);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder("");
        long year[] = new long[2 * cases + 1];
        int dates[] = new int[2 * cases + 1];
        int months[] = new int[2 * cases + 1];
        for (int i = 1; i <= 2 * cases; i++) {
            String date[] = br.readLine().split(",");
            String monthDay[] = date[0].split(" ");
            year[i] = Long.parseLong(date[1].trim());
            months[i] = monthIndex.get(monthDay[0]);
            dates[i] = Integer.parseInt(monthDay[1]);
            //  System.out.println(dates[i]+" <> "+months[i]+" <> "+year[i]);
        }
        int count = 1;
        for (int j = 1; j <= 2 * cases; j += 2) {
            int leapCount = 0;
            long yLarge = year[j + 1];
            long ySmall = year[j];
            int mLarge = months[j + 1];
            int mSmall = months[j];
            int dLarge = dates[j + 1];
            int dSmall = dates[j];
            long start = -1, end = -1;
            if (mSmall > 2) {
                start = ySmall + 1;
            } else if (mSmall == 2 && dSmall <= 29) {
                start = ySmall;
            } else {
                start = ySmall;
            }
            if (mLarge > 2) {
                end = yLarge;
            } else if (mLarge == 2 && dLarge == 29) {
                end = yLarge;
            } else {
                end = yLarge - 1;
            }
//            for (long y = start; y <= end; y++) {
//                if (isLeapYear(y)) {
//                    leapCount++;
//                }
//            }

            int divisibleByFour = getNumberofMultipleInRangeOf(start, end, 4);
            int divisibleByHundred = getNumberofMultipleInRangeOf(start, end, 100);
            int visibleFourByHundred = getNumberofMultipleInRangeOf(start, end, 400);
           leapCount = divisibleByFour - divisibleByHundred + visibleFourByHundred;
            // System.out.println("start : " + start + " end " + end);
            output.append("Case " + count + ": ");
            count++;
            output.append(leapCount);
            output.append("\n");
        }
        System.out.print(output);

        //  }

        // TODO code application logic here
    }

//    private static boolean isLeapYear(long yLarge) {
//        if ((yLarge % 4 == 0 && yLarge % 100 != 0) || yLarge % 400 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    private static int getNumberofMultipleInRangeOf(long start, long end, int d) {
        int count = (int) end / d - (int) start / d;
        if (start % d == 0) {
            count++;
        }
        return count;
    }
}
