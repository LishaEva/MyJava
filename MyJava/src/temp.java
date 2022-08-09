import java.text.SimpleDateFormat;

public class temp {

	public static void main(String[] args) {
		String[] arr = { "one", "two", "one", "three" };

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("one")) {
				counter++;
				// System.out.println();
			}
		}
		System.out.println("counter value:" + counter);

	}
	
	
	

}

