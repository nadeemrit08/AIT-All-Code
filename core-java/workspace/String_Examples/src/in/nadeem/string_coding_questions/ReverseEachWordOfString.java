package in.nadeem.string_coding_questions;

public class ReverseEachWordOfString {

	public static void main(String[] args) {

		// Approach-1
		String s = "Hello  My Friend";

		String[] str = s.split(" ");

		for (String word : str) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			System.out.print(sb + " ");
		}

		System.out.println();
		
		// Approach-2
		String input = "I Love Java";
		String[] words = input.split(" ");

		String result = "";

		for (String word : words) {
			String rev = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			result = result + rev + " ";
		}
		System.out.print(result);
	}
}
