package Lab3;

import java.util.Arrays;

public class PositiveString {

	static boolean isAlphabaticOrder(String s) {
		// length of the string
		int n = s.length();

		char c[] = new char[n];

		// assign the string
		for (int i = 0; i < n; i++) {
			c[i] = s.charAt(i);
		}
		Arrays.sort(c);
		for (int i = 0; i < n; i++)
			if (c[i] != s.charAt(i))
				return false;

		return true;
	}

	public static void main(String args[]) {
		String s = "ant";

		if (isAlphabaticOrder(s))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
