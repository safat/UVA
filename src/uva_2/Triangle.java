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
public class Triangle {
//uva 488

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        String dummy = input.nextLine();
        while (caseCount-- > 0) {
            dummy = input.nextLine();
            int amplitude = input.nextInt();
            int frequency = input.nextInt();
            for (int i = 0; i < frequency; i++) {

                for (int j = 1; j <= amplitude; j++) {
                    int n = j;
                    String tmp = "";
                    for (int k = 1; k <= n; k++) {
                        tmp += j;
                    }
                    System.out.println(tmp);
                }
                for (int j = amplitude - 1; j >= 1; j--) {
                    int n = j;
                    String tmp = "";
                    for (int k = 1; k <= n; k++) {
                        tmp += j;
                    }
                    System.out.println(tmp);
                }
                if (i != frequency - 1) {
                    System.out.println();
                }

            }
            if (caseCount == 1) {
                System.out.println();
            }
        }
        // TODO code application logic here
    }
}
/*
 *
 * #include<iostream>
using namespace std;
 
void printWave(int amplitude)
{
        for(int i = 1; i <= amplitude; i++){
                for(int ii = 1; ii <= i; ii++){
                        cout<<i;
                }
                cout<<endl;
        }
        for(int j = amplitude-1; j >= 1; j--){
                for(int jj = 1; jj<=j ; jj++){
                        cout<<j;
                }
                cout<<endl;
        }
}
 
int main ()
{
        int cases , amp , freq;
        cin>>cases;
        for(int i=0 ; i<cases ; i++){
                if(i>0) cout<<endl;
                cin>>amp>>freq;
                for(int j=0 ; j<freq; j++){
                        if(j>0)cout<<endl;
                        printWave(amp);
                }
        }
        return 0;
}
 * 
 * */
 