package javaProject;

public class Account {
	private String accName;
	private int accNumber;
	public int balance;
	public Account(String accName, int accNumber, int balance) {
		super();
		this.accName = accName;
		this.accNumber = accNumber;
		this.balance = balance;
	}
	public void deposit(int amt) {
		balance=balance+amt;
		System.out.println(" balance amount:"+balance);
		
		
	}
	public void withdraw(int amt) {
		if(balance>=amt) {
			balance=balance-amt;
			System.out.println(" money sufficient "+balance);}
		else
			System.out.println(" money insufficient");
	}
	public void display() {
		System.out.println("account name :"+accName);
		System.out.println("account number:"+accNumber);
		System.out.println("  present balance :"+balance);
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
