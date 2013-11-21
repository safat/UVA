/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

/**
 *
 * @author user
 */
import java.util.*;
public class StackAnagram {
 static int count = 0;
    static void anagram(String s1, String s2, String stack, String instr) {

        System.out.println(++count+". s1:"+s1+"\ns2:"+s2+"\nstack:"+stack+"\ninstr:"+instr);
        
         if (s2.isEmpty()) {
            if (s1.isEmpty() && stack.isEmpty()) {
                System.out.println(instr.trim());
            }
            return;
        }
        if (!s1.isEmpty()) {
            anagram(s1.substring(1), s2, s1.charAt(0) + stack, instr + "i ");
        }
        if (!stack.isEmpty() && stack.charAt(0) == s2.charAt(0)) {
            System.out.println("sub");
            anagram(s1, s2.substring(1), stack.substring(1), instr + "o ");
        }
        else{
        
            System.out.println("not called");
            
        }
    }

    static void anagram(String s1, String s2) {
        System.out.println("[");
        anagram(s1, s2, "", "");
        System.out.println("]");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String word, tWord;
       
        while (input.hasNext()) {
            word = input.nextLine();
            tWord = input.nextLine();
            System.out.println("[");
            if(word.length()==tWord.length())
            anagram(word, tWord, "", "");
            System.out.println("]");
        }

    }
}