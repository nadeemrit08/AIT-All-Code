package in.nadeem.staticVar;

import java.util.Arrays;

public class Methods1 {

	void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		Methods1 m = new Methods1();
		int arr[] = { 1, 2, 3, 4, 5 };
		m.print(arr);
	}
}
