package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class FibonaciiBottomUp {

	public static long fibonacci(int n) {
		if(n <= 1)
			return n==1?1:0;
		long dp[] = new long[n];
		Arrays.fill(dp,0);
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2;i < n; i++) {
			dp[i] = dp[i-1]+dp[i-2];
			
		}
		
		return dp[n-1];
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter last term of fibonacci = ");
		int n = sc.nextInt();
		System.out.println("\nFib = "+fibonacci(n));
		sc.close();

	}


}
