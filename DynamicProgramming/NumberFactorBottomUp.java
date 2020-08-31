package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class NumberFactorBottomUp {
	public static int wayToGetN(int n) {

		if(n < 0) 
			return 0;
		if(n==0)
			return 1;
		int dp[] = new int[n+1]; 
		Arrays.fill(dp,0);
		dp[0] = dp[1] = dp[2] = 1;
		dp[3] = 2;
		for(int i = 4; i <= n;i++) {
			dp[i] = dp[i-1]+ dp[i-3]+ dp[i-4];
		}
		return dp[n];
	}
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter number to get ways to crate n by using 1,3,and 4 = ");
		int n = sc.nextInt();
		System.out.println(wayToGetN(n));
		sc.close();

	}

}
