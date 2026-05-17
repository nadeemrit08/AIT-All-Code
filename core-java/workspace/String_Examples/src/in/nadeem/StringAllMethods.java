package in.nadeem;

import java.util.Arrays;

public class StringAllMethods {

	public static void main(String[] args) {

		String str1 = "Nadeem";
		String str2 = " Ahmad";
		String str3 = new String("Nadeem");

		if (str1 == str2) {
			System.out.println("Both are equal...!!!");
		} else {
			System.out.println("Both are not equal...!!!");
		}

		// equals method to compare
		String str4 = str3.intern();
		System.out.println(str1 == str4);

		System.out.println("charAt method :: " + str1.charAt(2));

		System.out.println("length() method :: " + str1.length());

		System.out.println("concat() method :: " + str1.concat(str2));
		System.out.println("replace() method :: " + str1.replace('a', 'h'));

		System.out.println("indexOf() method :: " + str1.indexOf('d'));

		System.out.println("lastIndexOf() method :: " + str1.lastIndexOf('e'));

		System.out.println("subString() method :: " + str1.substring(2)); // method overloading
		System.out.println("subString() method :: " + str1.substring(1, 5));

		String sp = "hi@hello";
		String[] split = sp.split("@");
		System.out.println("split() method :: " + Arrays.toString(split));
	}
}
