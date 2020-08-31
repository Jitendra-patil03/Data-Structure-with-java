package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size = ");
		int n = sc.nextInt();
		ProfitAndWeight arr[] = new ProfitAndWeight[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ProfitAndWeight();
			System.out.print("Enter profit = ");
			arr[i].profit = sc.nextInt();
			System.out.print("Enter weight = ");
			arr[i].weight = sc.nextInt();
			arr[i].fraction = ((float)arr[i].profit / arr[i].weight);
		}
		System.out.print("Enter knapsack capicity = ");
		int capicity = sc.nextInt();
		float maxProfit = getMaximumProfit(arr, capicity);
		System.out.println("Max profit = "+maxProfit);
		sc.close();
	}

	private static float getMaximumProfit(ProfitAndWeight[] arr, int capicity) {
		Arrays.parallelSort(arr, new MyCaparatorKnapsack());
		int weight = 0;
		float totalProfit = 0f;
		for(int i = 0; i < arr.length; i++) {
			if(capicity <= 0)
				break;
			if(capicity - arr[i].weight >= 0) {
				capicity -= arr[i].weight;
				totalProfit += arr[i].profit;
			}
			else {
				totalProfit += (arr[i].fraction * capicity);
				capicity -= capicity;
			}
			
			
			
		}
		
		return totalProfit;
	}
	

}

class ProfitAndWeight { 
	int profit;
	@Override
	public String toString() {
		return "ProfitAndWeight [profit=" + profit + ", weight=" + weight + "]";
	}
	int weight;
	float fraction;
}

class MyCaparatorKnapsack implements Comparator<ProfitAndWeight>{

	@Override
	public int compare(ProfitAndWeight arg0, ProfitAndWeight arg1) {
		if(arg0.fraction ==  arg1.fraction)
			return 0;
		else if(arg0.fraction < arg1.fraction)
			return 1;
		else
			return -1; 
	}
	
}