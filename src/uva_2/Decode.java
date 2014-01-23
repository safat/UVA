/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
//uva 458
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;


public class Decode{
    
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(System.out);
        int h = 0;
        while ((h = in.read()) != -1) {
            out.write((Character.isSpace((char) h) ? 
                    h : (h - 7)));
        }
       // System.out.println(out);
    }
}
/*
 * #include <cstdio>
using namespace std;

int main() {
        char c;
        while(scanf("%c",&c) != EOF){
                if(c!='\n')printf("%c",c-7);
                else printf("\n");
        }

        return 0;
}
 */