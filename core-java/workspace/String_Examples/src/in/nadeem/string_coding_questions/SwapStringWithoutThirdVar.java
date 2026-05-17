package in.nadeem.string_coding_questions;

public class SwapStringWithoutThirdVar {

	public static void main(String[] args) {

		String a = "java";
		String b = "program";

		System.out.println("Before swapping a is " + a);
		System.out.println("Before swapping b is " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("After swapping a is " + a);
		System.out.println("After swapping b is " + b);
	}
}
