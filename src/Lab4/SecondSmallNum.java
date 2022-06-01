package Lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondSmallNum {

	public int getSecondSmallest(int[] arr) {

		List<Integer> intList = new ArrayList<Integer>();

		for (int i : arr) {
			intList.add(i);

		}

		Collections.sort(intList);
		return intList.get(1);
	}

	public static void main(String[] args) {
		SecondSmallNum e = new SecondSmallNum();
		int arr[] = { 23, 43, 54, 24, 56, 75, 86, 45, 64, 34 };
		int i = e.getSecondSmallest(arr);
		System.out.println(i);

	}

}