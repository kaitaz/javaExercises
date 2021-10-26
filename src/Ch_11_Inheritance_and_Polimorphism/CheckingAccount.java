package Ch_11_Inheritance_and_Polimorphism;

/*11.3 (Subclasses of Account) the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and withdraw
funds. Create two subclasses for checking and saving accounts. A checking
account has an overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and implement them. Write a test program
that creates objects of Account, SavingsAccount, and CheckingAccount and
invokes their toString() methods.*/

import ch_9_Object_and_Classes.Account;

public class CheckingAccount extends Account {
	
	private int numberDeposits;
	private int numberWithdraws;
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}

	@Override
	public void withdraw(double cash) {
		if (balance - cash < 0  && balance > -500 ) {
			System.out.println("Warning: Overdraft ");}
		
		if (cash > balance && balance > -500 ) {
			System.out.println("Insuficient funds ");}
		else{
			balance -= cash ;
			numberWithdraws++;
		}
	}
	
	@Override
	public void deposit(double Cash) {
		super.deposit(Cash); 
		numberDeposits++;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nNumber of Deposits: " + numberDeposits + "\nNumber of Withdraws: " + numberWithdraws;
		}
	

}
