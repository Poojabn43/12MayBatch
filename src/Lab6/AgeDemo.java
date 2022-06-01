package Lab6;

import java.util.Scanner;

class Age extends Exception {
	public Age(String str) {
		System.out.println(str);
	}
}

public class AgeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur age:");
		int age = sc.nextInt();
		try {
			if (age < 15)

				throw new Age("invalid age");

			else

				System.out.println("valid age");
		} catch (Age a) {
			System.out.println(a);

		}
	}
}
