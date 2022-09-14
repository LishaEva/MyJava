package java8Specials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();

		// Adding Products
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));

		Stream<Product> filteredList = list.stream().filter(p -> p.price < 300f);
		filteredList.forEach(pr -> {
			System.out.println(pr.id + "," + pr.name);
		});

		Multiplesof2();
		printNumbers();
		System.out.println(removeDuplicates("Hello this word is  is not repeated is again is !"));
		countTheRepeat();
		
	}

	public static void printNumbers() {
		Stream.iterate(0, n -> n + 1).limit(10).forEach(System.out::println);
	}

	public static String removeDuplicates(String oldString) {
		String NewString = Arrays.stream(oldString.split("\\s")).distinct().collect(Collectors.joining(" "));
		return NewString;
	}

	public static void Multiplesof2() {
		// Multiples of 2
		Stream.iterate(2, n -> n + 2).filter(x -> x % 2 == 0).limit(20).forEach(System.out::println);
		// in the above statement limit is 20, which means 20 such results NOT TILL 20--
		// 2,4,...40
	}
	
 public static void countTheRepeat() {
	 String input = "Remove the repeated words and duplicated words words in the given sentence remove and remove";
	 Long total =Arrays.stream(input.split("\\s")).collect(Collectors.counting());
	 Long unique = Arrays.stream(input.split("\\s")).distinct().collect(Collectors.counting());
	 System.out.println("total words in teh given sentence:"+total); 
	 System.out.println("total UNIQUE words in the  given sentence:"+unique);// gives the count of unique words
	  
 }
	
	 //Collections sort and Compare to without lambda expression
	public static void sort(List list) {
	 Collections.sort(list);
	}
}
