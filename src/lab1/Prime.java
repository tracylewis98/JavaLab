package lab1;

import java.util.Scanner;

public class Prime {

	public static void main(String args[]) {
		int num, count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		sc.close();
		System.out.println("Prime numbers :-");
		for (int i = 2; i <= num; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
	}
}