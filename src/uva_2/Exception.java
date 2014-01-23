/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

/**
 *
 * @author user
 */
public class Exception {

    public static void main(String args[]) {
        System.out.println("A");

        try {
            System.out.println("B");
            System.exit(0);
        }
       
       finally{
        System.out.println("D");
        }

    }
}
//
//    
//        try { 
//System.out.println("B");
//        System.exit(0);
//    }
//    catch(Exception e
//
//    
//        ) 
//{  System.out.println("C");
//    }
//
//    
//        finally  { System.out.println("D");
//    }
