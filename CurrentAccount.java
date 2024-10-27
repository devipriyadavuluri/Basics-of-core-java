package javaProject;

public class CurrentAccount extends Account {
	private int overdraft;
	public CurrentAccount(String accName, int accNumber, int balance, int overdraft) {
		super(accName, accNumber, balance);
		// TODO Auto-generated constructor stub
		this.overdraft=overdraft;
	}
	public void overdraft(int amount) {
		if(balance+overdraft>=amount) {
			balance=balance-amount;
			System.out.println(" withdraw :"+amount);
		}
		else
			System.out.println(" trnscation is exceed");
				
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println(" overdraft :"+overdraft);
	}
	

	
	

}
