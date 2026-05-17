package in.nadeem.string_coding_questions;

import java.util.Arrays;

/*Q-4) Write a java program to check given two strings are anagrams or not

		keep & peek => Anagrams
		race & care => Anagrams
		Ashok & kosha => Anagrams
		Book & bomb => Not Anagrams
		package in.nadeem.string_coding_questions;*/

public class CheckAnagrams {

	public static void checkAnagram(String str1, String str2) {

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println(str1 + " & " + str2 + " --> Not Anagram");
			return;
		}

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println(str1 + " & " + str2 + " are anagram");
		} else {
			System.out.println(str1 + " & " + str2 + " are not anagram");
		}

	}

	public static void main(String[] args) {
		checkAnagram("keep", "peek");
		checkAnagram("race", "care");
		checkAnagram("Ashok", "kosha");
		checkAnagram("Book", "bomb");
	}
}
