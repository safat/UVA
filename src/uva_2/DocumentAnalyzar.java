/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 11860

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class DocumentAnalyzar {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<String> wordList;
    public static Set<String> wordSet;
    public static TreeSet<Integer> indexSet;

    public static void main(String[] args) {

        wordList = new ArrayList();
        wordSet = new HashSet();
        String s = "a@#$a^%a a a\n"
                + "b b-b-c++c_a+a+b+b--b_b_c_b_a_c_b_c++12b";

        Map<String, Integer> wordMap = new HashMap();
        int len = s.length();
        int count = 0;
        StringBuilder tmp = new StringBuilder("");
        for (int i = 0; i < len; i++) {
            if (!isLowerCase(s.charAt(i))) {
                continue;
            } else {
                while (i < len && (isLowerCase(s.charAt(i)))) {
                    tmp.append(s.charAt(i));
                    i++;
                }
                count++;
                String wrd = tmp.toString();
                wordList.add(wrd);
                wordSet.add(wrd);
                //System.out.println(count + ">" + tmp);
                tmp = new StringBuilder("");
            }
        }
        indexSet = new TreeSet();
        int wordCount = wordSet.size();
        int listSize = wordList.size();
        int minRange = Integer.MAX_VALUE;
        int start = 0, end = 0;
        for (int i = 0; i < listSize; i++) {
            if (!wordMap.containsKey(wordList.get(i))) {
                wordMap.put(wordList.get(i), i + 1);
                wordCount--;
            //    System.out.println("wordcount " + wordCount);
                indexSet.add(i + 1);
            } else {
                int pInd = wordMap.get(wordList.get(i));
                indexSet.remove(pInd);
                wordMap.put(wordList.get(i), i + 1);
                indexSet.add(i + 1);
            }
            if (wordCount == 0) {
                int tStart = indexSet.first();
                int tEnd = indexSet.last();
            //    System.out.println("temp start end " + tStart + " , " + tEnd);
                if ((tEnd - tStart) < minRange) {
                    start = tStart;
                    end = tEnd;
                    minRange = tEnd - tStart;
              //      System.out.println("current start end " + tStart + " , " + tEnd);
                }
            }

        }

        System.out.println(start + " " + end);

    }

    static boolean isLowerCase(char ch) {
        return (ch >= 'a' && ch <= 'z') ? true : false;
    }
}
