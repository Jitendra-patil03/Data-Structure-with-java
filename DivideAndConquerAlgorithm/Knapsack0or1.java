package DivideAndConquerAlgorithm;

import java.util.Scanner;

public class Knapsack0or1 {
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
			System.out.println("Maximum profit = " + getMaxProfit(profit, weight, capicity, 0));
			sc.close();
		}
		static int a =0;
		private static int getMaxProfit(int[] profit, int[] weight, int capicity, int i) { // i = current index
			System.out.println(a++);
			if(i >= profit.length || capicity <= 0 || i < 0) {
				return 0;
			}
			int profit1 = 0;
			if(weight[i] <= capicity) {
				profit1 = profit[i] + getMaxProfit(profit, weight, capicity - weight[i], i+1);
			}
			int profit2 = getMaxProfit(profit, weight, capicity, i+1);
			return Integer.max(profit1, profit2);
		}
}
