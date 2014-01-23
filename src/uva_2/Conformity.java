/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11286

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class Conformity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder("");
        while (true) {
            int frosCount = Integer.parseInt(br.readLine());
            if (frosCount == 0) {
                break;
            }
            String lines[] = new String[frosCount];
            boolean foundBefore[] = new boolean[frosCount];
            HashMap<String, Integer> coursePatternMap = new HashMap();
            int maxPattern = -1;
            int freq[] = new int[10001];
            for (int i = 0; i < frosCount; i++) {
                StringBuilder courses = new StringBuilder("");
                String tmp[] = br.readLine().split(" ");
                Arrays.sort(tmp);
                for (int j = 0; j < tmp.length; j++) {
                    courses.append(tmp[j]);
                }
                int freqCount = 0;
                String coursesString = courses.toString();
                if (!coursePatternMap.containsKey(coursesString)) {
                    freqCount = 1;
                    coursePatternMap.put(coursesString, freqCount);
                    freq[freqCount]++;
                } else {
                    freqCount = coursePatternMap.get(coursesString);
                    freqCount++;
                    coursePatternMap.put(coursesString, freqCount);
                    freq[freqCount]++;
                }
                if (freqCount > maxPattern) {
                    maxPattern = freqCount;
                }
                


            }
            //  Arrays.sort(lines);
            int maxFreqHolder = maxPattern*freq[maxPattern];
            output.append(maxFreqHolder);
            output.append("\n");
            //   System.out.println(maxFreqHolder);

        }
        System.out.print(output);
    }
}
