package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class NumberFactorTopDown {

	// for (1,3,4)
	public static int wayToGetN(int n, int dp[]) {
		if(n < 0) 
			return 0;
		if(n==1 || n==2 || n==0)
			return 1;
		if(n == 3)
			return 2;
		if(dp[n] == 0) {
			dp[n] = wayToGetN(n-1,dp) + wayToGetN(n-3,dp) + wayToGetN(n-4,dp); 
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter number to get ways to crate n by using 1,3,and 4 = ");
		int n = sc.nextInt();
		int dp[] = new int[n+1];
		Arrays.fill(dp, 0);
		System.out.println(wayToGetN(n,dp));
		sc.close();

	}

}
