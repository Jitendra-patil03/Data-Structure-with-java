package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Kanapsack_0_1_BottomUp {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of arrays = ");
		int n = sc.nextInt();
		int profit[] = new int[n];
		int weight[] = new int[n];
		for(int i = 0;i < n; i++) {
			System.out.print("Enter profit = ");
			profit[i] = sc.nextInt();
			System.out.print("Enter weight = ");
			weight[i] = sc.nextInt();
		}
		System.out.print("Enter knapsack capicity = ");
		int capicity = sc.nextInt();
		System.out.println("Maximum profit = " + getMaxProfit(profit, weight, capicity));
		sc.close();
	}

	private static int getMaxProfit(int[] profit, int[] weight, int capicity) { // i = current index
		 
		int dp[] = new int[profit.length+1];
		Arrays.fill(dp, 0);
	
		int profit1 = 0;
		for(int i = dp.length-1;i >0 ;i--) {
			if(weight[i-1] <= capicity) {
				profit1 = profit[i-1] + dp[i-1];
				capicity -= weight[i-1];
			}
			int profit2 = dp[i-1];
			dp[i] = Integer.max(profit1, profit2);
			
				
		}
		return dp[1];
	}
}
