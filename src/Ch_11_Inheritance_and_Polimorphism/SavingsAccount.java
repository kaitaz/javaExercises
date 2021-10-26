package Ch_11_Inheritance_and_Polimorphism;


/*11.3 (Subclasses of Account) the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and withdraw
funds. Create two subclasses for checking and saving accounts. A checking
account has an overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and implement them. Write a test program
that creates objects of Account, SavingsAccount, and CheckingAccount and
invokes their toString() methods.*/

import java.util.Date;

import ch_9_Object_and_Classes.Account;

public class SavingsAccount extends Account{
	
	private int numberDeposits;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	@Override
	public void withdraw(double cash) {
		System.out.println("Saving account: Not possible to withdraw ");
	}
	
	@Override
	public void deposit(double Cash) {
		super.deposit(Cash); 
		numberDeposits++;
	}
	
	@Override
	public String toString() {
			
		return super.toString() + "\nNumber of Deposits: " + numberDeposits;
		}
	
}
