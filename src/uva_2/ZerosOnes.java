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
public class ZerosOnes {
//uva 10324
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = 1;
        while (true) {
            String line = input.nextLine();
            if (line.equals("")) {
                break;
            }
            int n = Integer.parseInt(input.nextLine());
            System.out.println("Case " + (caseCount++) + ":");
            while (n-- > 0) {
                String[] range = input.nextLine().split(" ");
                int a = Integer.parseInt(range[0]);
                int b = Integer.parseInt(range[1]);
                int start = Math.min(a, b);
                int end = Math.max(a, b);
                char ch = line.charAt(start);
                boolean same = true;
                for (int i = start; i <= end; i++) {
                    if (ch != line.charAt(i)) {
                        same = false;
                        break;
                    }

                }
                if (same) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }

        }
        // TODO code application logic here
    }
}
//TLE

/*
 * 
 * 
#include<stdio.h>
#include<string.h>

int main()
{
    char s[1000015];
    int t=1,n,p1,p2,i,c,tem;
    while(scanf("%s",s)==1)
    {
        if(strcmp(s,"\n")==0)
            break;
        scanf("%d",&n);

        printf("Case %d:\n",t++);
        while(n--)
        {
            bool same = true;
            scanf("%d%d",&p1,&p2);
            if(p1>p2)
            {
                tem=p1;
                p1=p2;
                p2=tem;
            }
            char ch = s[p1];
            for(i=p1; i<=p2; i++)
            {
                if(s[i]!=ch)
                {
                    same = false;
                    break;
                }
            }
            if(same==true)
                printf("Yes\n");
            else
                printf("No\n");
        }
    }
    return 0;
}

 * */
 