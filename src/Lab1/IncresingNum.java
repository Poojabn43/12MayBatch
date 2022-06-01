package Lab1;

import java.util.Scanner;

public class IncresingNum {
	boolean checkNumber(int number) {
		String s = Integer.toString(number);
		char ch;
		int f = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			ch = s.charAt(i);
			if (ch > s.charAt(i + 1))// If any digit is more than next digit
										// then we have to stop checking
			{
				f = 1;
				break;
			}
		}
		if (f == 1)
			return false;
		else
			return true;
	}

	void isIncreasing(int number) {
		if (checkNumber(number) == true)
			System.out.println("The number " + number + " is Increasing");
		else
			System.out.println("The number " + number + "is not Increasing ");
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		IncresingNum bn = new IncresingNum();
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		bn.isIncreasing(number);
	}
}
