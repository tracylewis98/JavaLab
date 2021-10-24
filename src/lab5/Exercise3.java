package lab5;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary : ");
		int salary = sc.nextInt();

		try {
			if (salary < 3000)
				// User defined exception
				throw new EmployeeException("Salary of an employee is below than 3000");
		} catch (EmployeeException e) {
			System.out.println(e);
		}
	}
}