package in.nadeem.string_coding_questions;

public class CountLengthOfWordInString {

	public static void main(String[] args) {

		String input = "I love                 java";
		String[] words = input.trim().split("\\s+");

		System.out.println(words.length);

		System.out.println();
		
		String input1 = "Hello Java World";
		String[] words1 = input1.split("\\s+");

		int count = 0;
		for (String word : words1) {
			if (!word.isEmpty()) {
				count++;
			}
		}
		System.out.println(count);
	}
}
