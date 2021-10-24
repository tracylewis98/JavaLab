package lab2;

import java.util.Arrays;

public class Exercise2 {

	public static void main(String[] args) {

		String[] stringArray = { "white", "black", "cow", "siyona", "79", "mango", "dance" };
		sortString(stringArray);// method call
	}

	// method
	public static void sortString(String[] sArray) {
		Arrays.sort(sArray);// to get sorted array
		System.out.println(Arrays.toString(sArray));
	}
}