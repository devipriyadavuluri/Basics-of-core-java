package javaProject;

public class SavingsAccount extends Account {
	private int intrestrate;
	public SavingsAccount(String accName, int accNumber, int balance,int intrestrate) {
		super(accName, accNumber, balance);
		this.intrestrate=intrestrate;
		
	}
	public void addintrest() {
		int total_intrestamt=0;
		 balance=balance+balance+intrestrate;
		total_intrestamt=balance/100;
		System.out.println(" intrest with amount added :"+total_intrestamt);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println(" interest rate"+intrestrate+ "%");
	}
	

	
	

}
