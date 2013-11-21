/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;
/*Here i used Linear search .. But better algorithm is used binary search ... But when two numbers have the same values .. You must choose the least index number*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Marb {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("");
        int cases=1;
        while(true) {
          String str[]=br.readLine().split(" ");
          int n=Integer.parseInt(str[0]);
          int q=Integer.parseInt(str[1]);
          if(n==0 && q==0)
              break;
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
             arr[i]=Integer.parseInt(br.readLine()); 
          }   
          Arrays.sort(arr);
          int num=0,index=-1;
          sb.append("CASE# ").append(cases).append(":").append("\n"); 
          for(int i=0;i<q;i++){
             num=Integer.parseInt(br.readLine()); 
             index=search(arr, num);
             if(index>-1){
               sb.append(num).append(" found at ").append((index+1)).append("\n"); 
             }else{
               sb.append(num).append(" not found").append("\n");  
             }
          } 
         cases++;
        }
        System.out.print(sb);
    }
  
    static int search(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
}
