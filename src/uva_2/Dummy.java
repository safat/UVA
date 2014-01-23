/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class Dummy {

    public static void main(String args[]) {
        System.out.println(gcd(9, 15));
        System.out.println(gcd(15, 9));
    }

    private static long gcd(long iNumber, long jNumber) {
        if (iNumber == 0) {
            return jNumber;
        } else {
            return gcd(jNumber % iNumber, iNumber);
        }
    }
}