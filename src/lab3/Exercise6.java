package lab3;

public class Exercise6 {
	// method
	public static boolean positiveString(String n) {
		String check = String.valueOf(n);
		int length = check.length();
		for (int i = 0; i < length - 1; i++) {
			if (check.charAt(i) <= check.charAt(i + 1)) {
				continue;
			} else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "act";
		System.out.println(positiveString(str));// method call

	}

}