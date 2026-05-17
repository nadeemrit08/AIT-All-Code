package in.nadeem.string_coding_questions;

public class Test {

	public static void main(String[] args) {

		String input = "I love my India";
		String output = input.replaceAll("[AEIOUaeiou]", "");

		System.out.println("Input :: " + input);
		System.out.println("Output :: " + output);

	}
}
