package DivideAndConquerAlgorithm;

import java.util.Scanner;

public class LoggestPalindromicSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string = ");
		String s1 = sc.next();
		System.out.println("Longgest palindromic subsequence length = "+getLPS(s1, 0,s1.length()-1));
		sc.close();

	}

	private static int getLPS(String s1, int i, int j) {
		if(i == j)
			return 1;
		if(i > j || i >= s1.length() || j < 0)
			return 0;
		int c1 = 0;
		if(s1.charAt(i) == s1.charAt(j))
			c1 = 2  + getLPS(s1, i+1, j-1);
		return Integer.max(c1, Integer.max(getLPS(s1, i+1, j), getLPS(s1, i, j-1)));
	}

}
