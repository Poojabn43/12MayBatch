package Lab4;

import java.util.HashMap;
import java.util.Set;

public class SchoolOffer {
	public HashMap<String, String> getStudent(HashMap<String, Integer> stu) {
		HashMap<String, String> medal = new HashMap<>();
		Set<String> set = stu.keySet();
		for (String s : set) {
			Integer marks = stu.get(s);
			if (marks >= 90) {
				medal.put(s, "Gold");

			} else if (marks >= 80) {
				medal.put(s, "Silver");

			} else if (marks >= 70) {
				medal.put(s, "Bronze");
			}
		}
		return medal;

	}

	public static void main(String[] args) {
		HashMap<String, Integer> stu = new HashMap<>();
		SchoolOffer ex = new SchoolOffer();
		stu.put("R1", 12);
		stu.put("R2", 13);
		stu.put("R3", 14);
		stu.put("R4", 15);
		stu.put("R5", 16);
		System.out.println(ex.getStudent(stu));

	}

}