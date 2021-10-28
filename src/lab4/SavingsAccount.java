package lab4;

public class SavingsAccount {
final double minBalance = 500.0;
	
	public void withdraw()
	{
		
		if(minBalance<500.00)
		{
			System.out.println("minimum balance");
			throw new InvalidBalance("User can't withdraw");
			
		}
		else
		{
			System.out.println("User can withdraw money");
		}
	}
	
}


