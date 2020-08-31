package DivideAndConquerAlgorithm;

import java.util.Scanner;

public class NumberPathToReach {
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
		System.out.print("enter cost = ");
		int givenCost = sc.nextInt();
		int path = getNumberPath(graph,n-1,n-1,givenCost);
		System.out.println("Number of path to reach top left to bottom right is = "+path);
		sc.close();
	}

	private static int getNumberPath(int[][] graph, int i, int j, int givenCost) {
		if(givenCost < 0 )
			return 0;
		if(i == 0 && j == 0)
			return (givenCost-graph[i][j])==0 ? 1 : 0;
		if(i == 0)
			return getNumberPath(graph, i, j-1, givenCost-graph[i][j]);
		if(j == 0)
			return getNumberPath(graph, i-1, j, givenCost-graph[i][j]);
		
		return  (getNumberPath(graph, i-1, j, givenCost - graph[i][j]) + getNumberPath(graph, i, j-1,givenCost-graph[i][j]));
	}
}
