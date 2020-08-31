package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;
//knapsack not solve usinmg dynamic
public class Knapsack0_1_TopDown {
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
		int dp[] = new int[n];
		Arrays.fill(dp, 0);
		System.out.println("Maximum profit = " + getMaxProfit(profit, weight, capicity, 0, dp));
		sc.close();
	}
	static int a=0;
	private static int getMaxProfit(int[] profit, int[] weight, int capicity, int i, int dp[]) { // i = current index
		System.out.println(a++);
		if(i >= profit.length || capicity <= 0 || i < 0) {
			return 0;
		}
		int profit1 = 0;
		if(dp[i] == 0) {
			if(weight[i] <= capicity) {
				profit1 = profit[i] + getMaxProfit(profit, weight, capicity - weight[i], i+1,dp);
			}
		}
		int profit2 = getMaxProfit(profit, weight, capicity, i+1, dp);
		dp[i] = Integer.max(profit1, profit2);
		return dp[i];
	}
}
