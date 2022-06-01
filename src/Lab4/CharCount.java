package Lab4;

import java.util.HashMap;
import java.util.Iterator;

public class CharCount {

	public static HashMap m(int[] array)

	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int n : array) {
			// take n as 1 then n*n as 1*1 that can assign to map
			map.put(n, n * n);
		}
		return map;

	}

	public static void main(String[] args) {

		int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 11 };
		HashMap<Integer, Integer> map = m(array);
		Iterator<Integer> i = map.keySet().iterator();

		while (i.hasNext()) {
			Integer key = i.next();
			System.out.println(key + ":" + map.get(key));

		}
	}

}
