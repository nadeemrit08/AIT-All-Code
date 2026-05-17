package in.nadeem.staticVar;

// lecture-33
import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {

		Methods m = new Methods();
		int[] ar = { 1, 2, 3 };
		m.print(ar);

		m.fullName("nadeem", "IT");
	}

	public void fullName(String fname, String lname) {
		String name = fname + lname;
		System.out.println(name);
	}

	public void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
