package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class HouseThiefTopDown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array = ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("enter each house max price ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int dp[] = new int[arr.length+2];
		Arrays.fill(dp,0);
		
		System.out.println("Max steal money = "+getMaxMoney(arr,0,dp));
		sc.close();
	}
	private static int getMaxMoney(int[] arr, int i, int dp[]) {
		if(i >= arr.length) {
			return dp[i];
		}	
		int maxWithCurrent = 0;
		if(dp[i] == 0) {
			maxWithCurrent = arr[i] + getMaxMoney(arr, i + 2,dp);
		}
		int maxWithskipCurrent = getMaxMoney(arr, i + 1,dp);
		return dp[i]=Integer.max(maxWithCurrent, maxWithskipCurrent);
	}

}
