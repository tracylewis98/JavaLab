package lab2;

import java.util.Arrays;

public class RevserseSort {
	public static void main(String[] args) {
		int[] a = { 2, 29, 2, 98, 47, 4 };
		getSorted(a);

	}

	// method to sort array in reverse order
	static void getSorted(int a[]) {
		int temp;
		System.out.println("Original array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		System.out.println("Reverse array: ");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// printing reverse sorted array
		System.out.println("Sorted in ascending order: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}