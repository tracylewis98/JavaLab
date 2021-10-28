package lab4;

public class InvalidBalance extends RuntimeException {
	public InvalidBalance() {
		super();
	}
	public InvalidBalance(String msg) {
		super(msg);
		System.out.println("Minimum balance must be 500");
	}

}
