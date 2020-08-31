package DivideAndConquerAlgorithm;


import java.util.Scanner;

public class NumberFactor {
	// for (1,3,4)
	public static int wayToGetN(int n) {
		if(n < 0) 
			return 0;
		if(n==1 || n==2 || n==0)
			return 1;
		int subtract1 = wayToGetN(n-1);
		int subtract3 = wayToGetN(n-3);
		int subtract4 = wayToGetN(n-4);
		return subtract1 + subtract3 + subtract4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter number to get ways to crate n by using 1,3,and 4 = ");
		int n = sc.nextInt();
		System.out.println(wayToGetN(n));
		sc.close();

	}


}
