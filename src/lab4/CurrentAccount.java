package lab4;

public class CurrentAccount {
	double overdraftLimit;
	public boolean withdraw()
	{
		if(overdraftLimit>50000) {
			throw new InvalidBalance("User exceeded the limit");
		}
		else 
			System.out.println("User can withdraw");
		
		return true;
	}

}
