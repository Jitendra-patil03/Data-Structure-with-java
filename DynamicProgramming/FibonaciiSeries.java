package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class FibonaciiSeries {
	//top down approch
	static int a = 0;
	public static int fibonacci(int n, int dp[]) {
		System.out.println(a++); 
		if(n <= 1)
			return dp[n];
		if(dp[n] == 0)
			dp[n] = fibonacci(n - 1, dp) + fibonacci(n-2,dp);
		return dp[n];
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter last term of fibonacci = ");
		int n = sc.nextInt();
		int dp[] = new int[n];
		Arrays.fill(dp, 2, n, 0);
		dp[0] = 0;
		dp[1] = 1;
		System.out.println("Fib = "+fibonacci(n-1,dp));
		dp = null;
		sc.close();

	}

}
