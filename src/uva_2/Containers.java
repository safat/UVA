/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author user
 *///uva 1062
public class Containers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Stack<Character>> stackList = null;
        String containerLine = "";
        int caseCount = 1;
        while (true) {
            containerLine = input.nextLine();
            if (containerLine.endsWith("end")) {
                break;
            }
            stackList = new ArrayList<Stack<Character>>();
            int len = containerLine.length();
            Stack<Character> tmp = new Stack();
            tmp.push(containerLine.charAt(0));
            stackList.add(tmp);
            for (int i = 1; i < len; i++) {
                int stackListSize = stackList.size();
                boolean needNewStack = true;
                boolean foundSamePeek = false;
                int minValue = Integer.MAX_VALUE;
                int minPeekIndex = 0;
                //     System.out.println("current container " + containerLine.charAt(i));
                for (int j = 0; j < stackListSize; j++) {

                    tmp = stackList.get(j);
                    if (!tmp.empty()) {
                        if (tmp.peek() == containerLine.charAt(i)) {
                            stackList.remove(j);
                            //               System.out.println("removing " + tmp.toString());
                            tmp.push(containerLine.charAt(i));
                            stackList.add(tmp);
                            needNewStack = false;
                            foundSamePeek = true;
                            break;
                        } else if (tmp.peek() > containerLine.charAt(i)) {
                            int tmpDistance = tmp.peek() - containerLine.charAt(i);
                            if (tmpDistance < minValue) {
                                minValue = tmpDistance;
                                minPeekIndex = j;
                                needNewStack = false;
                            }
                        }
                    }

                }
                if (needNewStack) {
                    //   System.out.println("need new stack");
                    tmp = new Stack<Character>();
                    tmp.push(containerLine.charAt(i));
                    stackList.add(tmp);
                } else if (!foundSamePeek) {
                    tmp = stackList.get(minPeekIndex);
                    //   System.out.println("removing in not equal " + tmp.toString());
                    stackList.remove(minPeekIndex);
                    tmp.push(containerLine.charAt(i));
                    stackList.add(tmp);
                }
            }
            //  System.out.println(containerLine + ": " + stackList.toString());
            System.out.println("Case " + caseCount + ": " + stackList.size());
            caseCount++;

        }
        // TODO code application logic here
    }
}
