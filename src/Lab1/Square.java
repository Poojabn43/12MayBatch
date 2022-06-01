package Lab1;

import java.util.Scanner;

public class Square {
	// Function to calculate sum
	public static int calculateDifference(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += (i * i);

		return sum;
	}

	// Driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter value of n: ");
		n = sc.nextInt();
		System.out.println(calculateDifference(n));
	}
}
