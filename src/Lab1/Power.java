package Lab1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// Local Declaration
		boolean ispoweroftwo = false;
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		n = input.nextInt();
		ispoweroftwo = checkNumber(n);
		System.out.println(ispoweroftwo);
	}

	public static boolean checkNumber(int n) {
		// Function declaration
		boolean ispoweroftwo = false;
		// if not divisible by 2, means isnotpoweroftwo
		if (n % 2 != 0) {
			ispoweroftwo = false;
			return ispoweroftwo;
		} else {
			for (int power = 1; power > 0; power = power << 1) {
				if (power == n) {
					return true;
				} else if (power > n) {
					return false;
				}
			}
		}
		return ispoweroftwo;
	}
}