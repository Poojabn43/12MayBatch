package com.cg.eis.exception;

import java.util.Scanner;

class Ex_3 extends Exception {
	public Ex_3(String str) {
		System.out.println(str);
	}
}

public class EmployeeException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur salary:");
		int sal = sc.nextInt();
		try {
			if (sal < 3000)

				throw new Ex_3("less salary");

			else

				System.out.println("good salary");
		} catch (Ex_3 e) {
			System.out.println(e);

		}
	}
}
