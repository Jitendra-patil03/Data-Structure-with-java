package DivideAndConquerAlgorithm;

import java.util.Scanner;
public class Fibonacci {
	static int a =0;
	public static long fibonacci(int n) {
		System.out.println(a++);
		if(n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n-2);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter last term of fibonacci = ");
		int n = sc.nextInt();
		System.out.println(fibonacci(n));
		sc.close();

	}

}
//2978306496