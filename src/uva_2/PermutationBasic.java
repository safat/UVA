/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

public class PermutationBasic {

    public static void main(String args[]) {
        permuteString("", "abc");
    }

    public static void permuteString(String beginningString, String endingString) {
        if (endingString.length() <= 1) {
            System.out.println(beginningString + endingString);
        } else {
            for (int i = 0; i < endingString.length(); i++) {
                try {
                    String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                    System.out.println("ending string "+endingString.substring(0, i) + " + " + endingString.substring(i + 1));
                    System.out.println("begin string "+beginningString + endingString.charAt(i));
                    permuteString(beginningString + endingString.charAt(i), newString);
                } catch (StringIndexOutOfBoundsException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}