package Lab2;

public class SmallestElement {

	public static int getSecondSmallest(int[] arr, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
	}

	public static void main(String args[]) {
		int a[] = { 100, 500, 300, 400, 200, 600 };
		System.out.println("Second smallest element is: " + getSecondSmallest(a, 6));
	}
}
