package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertStringTopDown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string = ");
		String s1 = sc.next();
		System.out.print("Enter second string = ");
		String s2 = sc.next();
		int dp[][] = new int[s1.length()+1][s2.length()+1];
		Arrays.fill(dp[0], 0);
		for(int i  =0; i < s1.length(); i++)
			dp[i][0] = 0;
		System.out.println("Number of operation required to change 2nd string into 1st = "+getMinOperation(s1,s2, 0,0,dp));
		sc.close();
	}
	static int a =0;
	private static int getMinOperation(String s1, String s2, int i, int j, int dp[][]) {
		System.out.println(a++);
		if(i >= s1.length()) 
			dp[i][j]= s2.length()-j;
		else if(j >= s2.length())
			dp[i][j]= s1.length()-i;
		else if(s1.charAt(i) == s2.charAt(j))
			dp[i][j] = getMinOperation(s1, s2, i+1, j+1,dp);
		else if(dp[i][j] == 0) {
			int insert = 1 + getMinOperation(s1, s2, i+1, j,dp);//insert char
			int delete = 1 + getMinOperation(s1, s2, i, j+1,dp);//delete char
			int replace = 1 + getMinOperation(s1, s2, i+1, j+1,dp);//replace char
			dp[i][j] = Integer.min(Integer.min(insert, delete), replace);
		}
		return dp[i][j];
	}

}
