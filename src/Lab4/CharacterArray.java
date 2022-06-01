package Lab4;

import java.util.HashMap;

public class CharacterArray {

	public static void main(String[] args) {

		String str = "Capgemini";
		HashMap<Character, Integer> charCount = new HashMap<>();

		for (int i = str.length() - 1; i >= 0; i--) {
			if (charCount.containsKey(str.charAt(i))) {
				int count = charCount.get(str.charAt(i));// update the count value in the hashmap
				charCount.put(str.charAt(i), ++count);
			}

			else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println(charCount);
	}

}
