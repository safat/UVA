
package uva_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
//uva 11849
public class CD {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("");
        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            if(n==0 &&m==0){
                break;
            }
            HashSet<Integer> hs=new HashSet<Integer>();
            for(int i=0;i<n;i++){
                hs.add(Integer.parseInt(br.readLine()));
            }
            int counter=0;
            for(int i=0;i<m;i++){
                if(hs.contains(Integer.parseInt(br.readLine()))){
                    counter++;
                }
            }
            sb.append(counter).append("\n");
        }
        System.out.print(sb);
    }
}
