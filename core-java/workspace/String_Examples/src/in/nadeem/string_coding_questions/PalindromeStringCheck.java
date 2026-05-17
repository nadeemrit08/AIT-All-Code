package in.nadeem.string_coding_questions;

public class PalindromeStringCheck {

	public static void main(String[] args) {

		// Approach-2
		String s = "liril";

		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}

		if (s.equals(s1)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not Palindrome");

		// Approach-2
		String str = "liril";
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
		String str1 = new String(charStr);
		if (str.equals(str1)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not Palindrome");
	}
}
