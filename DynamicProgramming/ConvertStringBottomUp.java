package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertStringBottomUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string = ");
		String s1 = sc.next();
		System.out.print("Enter second string = ");
		String s2 = sc.next();
		System.out.println("Number of operation required to change 2nd string into 1st = "+getMinOperation(s1,s2));
		sc.close();
	}
	static int a =0;
	private static int getMinOperation(String s1, String s2) {
		System.out.println(a++);
		int dp[][] = new int[s1.length()+1][s2.length()+1];
		for(int i  =0; i < s1.length(); i++)
			dp[i][0] = i;
		for(int i  =0; i < s2.length(); i++)
			dp[0][i] = i;
		for(int i = 1; i <= s1.length(); i++) {
			for(int j = 1; j <= s2.length(); j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1))
					dp[i][j] = dp[i-1][j-1];
				else {
					dp[i][j] = Integer.min(Integer.min( 1 + dp[i-1][j], 1+dp[i][j-1]),1+dp[i-1][j-1] );
				}
			}
		}
	
			return dp[s1.length()][s2.length()];
	}

}
