package Lab1;

import java.util.Scanner;

public class NaturalNum {
	public static void calculateSum(int n) {
		System.out.println("\n\nDivided by 3 & 5: ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.print(i + ", ");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter value of n: ");
		n = sc.nextInt();
		System.out.println();
	}
}
