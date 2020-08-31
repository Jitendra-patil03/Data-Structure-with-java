package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class HouseThiefBottomup {
	public static void main(String[] args) {
		System.out.print("Enter size of Array = ");
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[scanner.nextInt()];
		System.out.println("enter each house max price ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Max steal money = "+getMaxMoney(arr));
		scanner.close();
	}
	private static int getMaxMoney(int[] arr) {
		if(1 == arr.length) {
			return arr[0];
		}
		int dp[] = new int[arr.length+2];
		Arrays.fill(dp,0);    
		for(int i = arr.length-1;i >=0 ;i--) {
			dp[i] = Integer.max((arr[i] + dp[i+2]), dp[i+1]);
		}
		return dp[0];
	}


}
