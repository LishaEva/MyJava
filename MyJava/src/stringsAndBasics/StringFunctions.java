package stringsAndBasics;

public class StringFunctions {
	
	public static void main(String[] args) {
		System.out.println(reverse("Hello"));
	}

	public static String reverse(String in) {
		// String in ="hello";
		StringBuilder out = new StringBuilder();
		char[] chars = in.toCharArray();
		for (int i = chars.length- 1; i >= 0; i--) {
			out.append(chars[i]);
		}
		return out.toString();
	}
}

