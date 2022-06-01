package Lab7;

interface Intr4 {
	int highest(int a[]);

}

public class SecondHighest {
	public static void main(String[] args) {

		// declare the array
		int[] a = { 11, 29, 31, 45, 5 };

		// lambda expression
		Intr4 ref = (b) -> {
			// sort the array
			for (int i = 0; i <= a.length - 1; i++) {
				for (int j = i + 1; j <= a.length - 1; j++) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}

			// to return the second highest element
			return a[a.length - 2];
		};

		// to print the second highest element in array
		System.out.println("The second highest element is : " + ref.highest(a));

	}

}