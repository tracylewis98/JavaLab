package lab6;

import java.util.Map;
import java.util.*;

public class Exercise4 {

	public static HashMap<String, String> getStudent(HashMap<String, Integer> stu) {
		HashMap<String, String> Medal = new HashMap<>();
		Set<String> set = stu.keySet();
		for (String s : set) {
			Integer marks = stu.get(s);
			if (marks >= 90) {
				Medal.put(s, "Gold");
			} else if (marks >= 80 && marks < 90) {
				Medal.put(s, "Silver");
			} else if (marks >= 70 && marks < 80) {
				Medal.put(s, "Bronze");
			}
		}
		return Medal;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> student = new HashMap<>();
		Exercise4 sc = new Exercise4();

		student.put("Student-1:", 96);
		student.put("Student-2:", 75);
		student.put("Student-3:", 85);
		student.put("Stuent-4:", 97);
		student.put("Student-5:", 81);
		System.out.println(sc.getStudent(student));
	}

}
