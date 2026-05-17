package in.nadeem.string_coding_questions;

public class ReverseString {

	public static void main(String[] args) {

		/*
		 * String str = "nadeem"; // Approach-1 String rev = ""; for (int i =
		 * str.length() - 1; i >= 0; i--) { String reverse = rev + str.charAt(i);
		 * System.out.print(reverse); }
		 */

		/*
		 * // Approach-2
		 * 
		 * char[] array = str.toCharArray();
		 * 
		 * String s1 = "";
		 * 
		 * for (int i = array.length - 1; i >= 0; i--) { s1 = s1 + array[i]; }
		 * System.out.print(s1);
		 */

		// Approach-3
		String str = "Java";
		char[] charStr = str.toCharArray();

		int start = 0;
		int end = charStr.length - 1;

		while (start < end) {
			char temp = charStr[start];
			charStr[start] = charStr[end];
			charStr[end] = temp;

			start++;
			end--;
		}
		System.out.println(new String(charStr));

	}
}
