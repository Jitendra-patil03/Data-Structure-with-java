package DivideAndConquerAlgorithm;

import java.util.Scanner;

public class ConvertOneStringToOther {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string = ");
		String s1 = sc.next();
		System.out.print("Enter second string = ");
		String s2 = sc.next();
		System.out.println("Number of operation required to change 2nd string into 1st = "+getMinOperation(s1,s2, 0,0));
		sc.close();
	}
	static int a=0;
	private static int getMinOperation(String s1, String s2, int i, int j) {
		//System.out.println(a++);
		if(i >= s1.length()) 
			return s2.length()-j;
		if(j >= s2.length())
			return s1.length()-i;
		if(s1.charAt(i) == s2.charAt(j))
			return getMinOperation(s1, s2, i+1, j+1);
		int insert = 1 + getMinOperation(s1, s2, i+1, j);//insert char
		int delete = 1 + getMinOperation(s1, s2, i, j+1);//delete char
		int replace = 1 + getMinOperation(s1, s2, i+1, j+1);//replace char
		return Integer.min(Integer.min(insert, delete), replace);
	}

}
