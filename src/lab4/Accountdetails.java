package lab4;

public class Accountdetails {

	public static void main(String[] args) {
		Account account1=new Account();
		account1.setAccNum(547623);
		Person person1 = new Person();
		person1.setName("Smith");
		person1.setAge(35);
		account1.setAccHolder(person1);
		
		System.out.println(person1.getName()+" details: ");
		System.out.println("Account Num: "+account1.getAccNum());
		System.out.println("Available Balance: "+account1.getBalance());
		System.out.println("Age: "+person1.getAge());
		System.out.println("Account holder: "+account1.getAccHolder());
			
		//account2
		Account account2=new Account();
		account2.setAccNum(687698);
		account2.setBalance(3000.00);
		
		Person person2 = new Person();
		person2.setName("Karthy");
		person2.setAge(29);
		account2.setAccHolder(person2);
		
		System.out.println();
		System.out.println(person2.getName()+" details: ");
		System.out.println("Account Num: "+account2.getAccNum());
		System.out.println("Available Balance: "+account2.getBalance());
		System.out.println("Age: "+person2.getAge());
		System.out.println("Account holder: "+account2.getAccHolder());
		
		//changes
		System.out.println();
		System.out.println("after updating");
		double x=account1.getBalance();
		account1.setBalance(4000);
		account2.setBalance(1000);
		
		System.out.println();
		System.out.println("available balance");
		System.out.print("smith account available balance: "+account1.getBalance());
		System.out.print("kathy accountavailable balance : "+account2.getBalance());
		
		
		System.out.println();
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.withdraw();
		System.out.println();
		CurrentAccount currentAccount = new CurrentAccount();
		//currentAccount.withdraw();
	}



	}


