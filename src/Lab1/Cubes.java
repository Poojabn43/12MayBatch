package Lab1;

public class Cubes {
	/* Returns the sum of series */
	public static int sumOfSeries(int n) {
		int x = (n * (n + 1) / 2);
		return x * x;
	}

	// Driver Function
	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumOfSeries(n));

	}
}
