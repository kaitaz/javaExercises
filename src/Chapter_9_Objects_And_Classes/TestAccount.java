package Chapter_9_Objects_And_Classes;

/*
(The Account class) Design a class named Account that contains:
	A private int data field named id for the account (default 0).
	A private double data field named balance for the account (default 0).
364 Chapter 9 Objects and Classes
	A private double data field named annualInterestRate that stores the current
interest rate (default 0). Assume that all accounts have the same interest rate.
	A private Date data field named dateCreated that stores the date when the
account was created.
	A no-arg constructor that creates a default account.
	A constructor that creates an account with the specified id and initial balance.
	The accessor and mutator methods for id, balance, and annualInterestRate.
	The accessor method for dateCreated.
	A method named getMonthlyInterestRate() that returns the monthly
interest rate.
	A method named getMonthlyInterest() that returns the monthly interest.
	A method named withdraw that withdraws a specified amount from the
account.
	A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class then implement the class. (
Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created.*/

/*
 	Account
 -----------------
 - id: int
 - balance: double
 - annualInterestRate: double
 - dateCreated: Date
 
 + Account()
 + Account(id: int, balance: double)
 + getId(): int
 + getBalance(): double
 + getAnnualInterestRate(): double
 + getDateCreated(): Date
 + setId(id: int): void
 + setBalance(balance: double): void
 + setAnnualInterestRate(annualInterestRate: double): void
 + getMonthlyInterestRate(double annualInterestRate): double
 + getMonthlyInterest() double
 + withdraw(amount: double): void
 + deposit(amount: double): void
 
 account: Account
 ----------------
 id = 1122
 balance = 20000
 annualInterestRate = 4.5
 
  */

public class TestAccount {

	public static void main(String[] args) {
		//Create an account
		Account account = new Account(1122, 20000, 4.5);
		
		//Withdraw 2500
		account.withdraw(2500);
		System.out.println("The current balance is: $" + account.getBalance());

		//Deposit 2500
		account.deposit(3000);
		System.out.println("The current balance is: $" + account.getBalance());
		
		System.out.println("The current balance is $" + account.getBalance() + " and monthly interest is $" +
				account.getMonthlyInterest(account.getMonthlyInterestRate(account.getAnnualInterestRate())) +
				", created on " + account.getDateCreated());

	}

}
