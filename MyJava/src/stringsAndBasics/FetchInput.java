package stringsAndBasics;

import java.util.Scanner;

public class FetchInput {

	public static void main(String[] args) {

		fetchStringInput(); // when static can be called directly		
		FetchInput var = new FetchInput();
		var.fetchStringInputLines(); // When non static create an instance
		fetchIntegerInput();
	}

	public static void fetchStringInput() {
		Scanner in = new Scanner(System.in); // default statement for a scanner class
		System.out.println("Enter the String input here:");
		String fetchedInput = in.next();
		System.out.println("Entered Data  is: " + fetchedInput);
	}

	public static void fetchIntegerInput() {
		Scanner in = new Scanner(System.in); // default statement for a scanner class
		System.out.println("Enter the Integer input here:");
		int fetchedInput1 = in.nextInt();
		System.out.println("Enter the Integer input here:");
		int fetchedInput2 = in.nextInt();
		System.out.println("Enter the Integer input here:");
		int fetchedInput3 = in.nextInt();
		System.out.println("First Data  is: " + fetchedInput1);
		System.out.println("Second Data  is: " + fetchedInput2);
		System.out.println("Third Data  is: " + fetchedInput3);
	}

	public void  fetchStringInputLines() {
		Scanner in = new Scanner(System.in); // default statement for a scanner class
		System.out.println("Enter the String input here:");
		String fetchedInput = in.nextLine();
		System.out.println("Entered Data  is: " + fetchedInput);
		
	}

}
