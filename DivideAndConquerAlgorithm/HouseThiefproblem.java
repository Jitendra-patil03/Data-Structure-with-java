package DivideAndConquerAlgorithm;

import java.util.Scanner;

public class HouseThiefproblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array = ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("enter each house max price ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Max steal money = "+getMaxMoney(arr,0));
		sc.close();
	}
	static int a = 0;
	private static int getMaxMoney(int[] arr, int i) {
		System.out.println(a++);
		if(i >= arr.length) {
			return 0;
		}
		int maxWithCurrent = arr[i] + getMaxMoney(arr, i + 2);
		int maxWithskipCurrent = getMaxMoney(arr, i + 1);
		return Integer.max(maxWithCurrent, maxWithskipCurrent);
	}

}
