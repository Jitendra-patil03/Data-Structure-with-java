package DivideAndConquerAlgorithm;

import java.util.Scanner;

public class MinCostToReachLast {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter graph length =");
		int n = sc.nextInt();
		int []graph[] = new int[n][n];
		System.out.print("Enter graph data\n");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		int minPathCost = getMinPathCost(graph,n-1,n-1);
		System.out.println("Min cost to reach top left to bottom right is = "+minPathCost);
		sc.close();
	}

	private static int getMinPathCost(int[][] graph, int i, int j) {
		if(i < 0 || j <0)
			return Integer.MAX_VALUE;
		if(i == 0 && j == 0)
			return graph[i][j];
		return graph[i][j] + Integer.min(getMinPathCost(graph, i-1, j), getMinPathCost(graph, i, j-1));
	}
}
