package in.nadeem.string_coding_questions;

public class FindFirstOccurence {

	public static void main(String[] args) {
		String str = "Java";
		char ch = 'a';

		// approach-1
		char[] charArray = str.toCharArray();

		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a') {
				count++;
			}
		}
		System.out.println(count);

		// approach-2
		count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}
}
