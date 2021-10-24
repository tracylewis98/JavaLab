package lab1;

import java.util.Scanner;

public class TwoPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int n = sc.nextInt();
		boolean rs = isPower2(n);// method call
		if (rs == true)
			System.out.println(n + " is the power of 2");
		else
			System.out.println(n + " is not the power of 2");
	}

	static boolean isPower2(int n) {
		if (n == 0)
			return false;
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}
}