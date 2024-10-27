package javaProject;

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account(" Ramu ", 111, 9000);
		acc.display();
		String name=acc.getAccName();
		System.out.println(name);
		acc.deposit(1000);
		acc.withdraw(500);
		System.out.println(" ******** ");
		SavingsAccount s=new SavingsAccount("Ramu", 222, 10000, 5);
		s.display();
		s.deposit(5000);
		s.withdraw(2000);
		s.addintrest();
		System.out.println(" ******** ");
		CurrentAccount c=new CurrentAccount(" Raghu", 333, 3000, 1000);
	    c.display();
		c.deposit(1000);
		c.withdraw(500);
		c.overdraft(5000);
		

	}

}
