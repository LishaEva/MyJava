package stringsAndBasics;

import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		//System.out.println(reverse("Hello"));
		//System.out.println(reverseNumber());
		//swap(100,200);
		System.out.println(IsVowel("APPLE"));
	}

	public static String reverse(String in) {
		// String in ="hello";
		StringBuilder out = new StringBuilder();
		char[] chars = in.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			out.append(chars[i]);
		}
		return out.toString();
	}

	public static int reverseNumber() {
		Scanner out = new Scanner(System.in);
		System.out.println("enter the input number:");
		int n = out.nextInt();
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum * 10 + r;
			// System.out.println("Sum"+sum);
			n = n / 10;
		}
		return sum;

	}
	
	public static void swap(int a, int b) {
		System.out.println("A value:"+a);
		System.out.println("B value:"+b);
		b = b+a;
		a= b-a;
		b= b-a;
		
		System.out.println("A value:"+a);
		System.out.println("B value:"+b);	
		}
	
 public static boolean IsVowel( String input) {
	//return input.toLowerCase().matches(".*[a,e,i,o,u].*"); // both are valid with and without commas
	return input.toLowerCase().matches(".*[aeiou].*");	 
 }
}
