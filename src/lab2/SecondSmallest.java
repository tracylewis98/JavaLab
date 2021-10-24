package lab2;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {

		int[] a = { 3, 5, 1, 0, 7, 9 };// array initialization
		getSecondSmallest(a);// method call
		System.out.println("Assending Order Bubble Sort: " + Arrays.toString(a));
		System.out.println("Second smallest element is: " + a[1]);

	}

	// method to sort array using bubble sort
	static void getSecondSmallest(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
