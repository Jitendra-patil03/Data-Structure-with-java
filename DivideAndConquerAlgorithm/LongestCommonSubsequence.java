package DivideAndConquerAlgorithm;

import java.util.Scanner;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string = ");
		String s1 = sc.next();
		System.out.print("Enter second string = ");
		String s2 = sc.next();
		System.out.println("Logest subsequence have length = "+getLCS(s1,s2, 0,0));
		sc.close();

	}

	private static int getLCS(String s1, String s2, int i, int j) {
		if(i >= s1.length() || j >= s2.length())
			return 0;	
		int c1 = 0;
		if(s1.charAt(i) == s2.charAt(j))
			c1 = 1 + getLCS(s1, s2, i+1, j+1);
		int c2 = Integer.max(getLCS(s1, s2, i+1, j), getLCS(s1, s2, i, j+1));
		return Integer.max(c1, c2);
	}

}
