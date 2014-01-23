/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class SuperLongSum {
//uva 10013

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder("");
        while (cases-- > 0) {
            String dummy = br.readLine();
            int len = Integer.parseInt(br.readLine());
            int fNumber[] = new int[len];
            int sNumber[] = new int[len];
            StringBuilder str1 = new StringBuilder("");
            StringBuilder str2 = new StringBuilder("");
            char[] digits = new char[3];
            for (int i = 0; i < len; i++) {
                digits = br.readLine().toCharArray();
                fNumber[i] = digits[0] - '0';
                sNumber[i] = digits[2] - '0';
            }
            int result[] = new int[len + 1];
            int carry = 0;
            int tSum = 0;
            for (int j = len - 1; j >= 0; j--) {
                tSum = fNumber[j] + sNumber[j] + carry;
                result[j] = tSum % 10;
                carry = tSum / 10;
            }
            if (carry != 0) {
                output.append(carry);
            }
            for (int i = 0; i < len; i++) {
                output.append(result[i]);
            }
            output.append("\n");
            if (cases != 0) {
                output.append("\n");
            }
        }
        System.out.print(output);
    }
}
/*

#include <cstdio>
using namespace std;

int a[1000001], b[1000001], c[1000001];

int main()
{
 	int t, n, j, i, carry, sum;
 	scanf("%d",&t);
 	for(;t;t--)
 	{
	 	carry = 0;
	 	scanf("%d",&n);
	 	for(i=0;i<n;i++)
	 		scanf("%d%d",&a[i],&b[i]);
	 	for(i=n-1,j=0;i>=0;i--,j++)
	 	{
		 	sum = a[i] + b[i] + carry;
		 	carry = sum/10;
		 	c[j] = sum%10;
		}
		if(carry!=0)
			c[j++] = carry;
		for(i=j-1;i>=0;i--)
			printf("%d",c[i]);
		printf("\n");
		if(t!=1)
			printf("\n");
	}
 	return 0;
}
* 
* */