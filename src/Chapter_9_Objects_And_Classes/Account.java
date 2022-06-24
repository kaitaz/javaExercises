package Chapter_9_Objects_And_Classes;

import java.util.Date;

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

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public Account(int id, double balance, double annualInterestRate){

		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();	
	}
	
	public int getId() {
	return id;
	}
	
	public double getBalance() {
		return balance;
		}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
		}
	
	public Date getDateCreated() {
		return dateCreated;
		}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
		
	public double getMonthlyInterestRate(double annualInterestRate) {
		return annualInterestRate / 100 / 12;
	}
	
	public double getMonthlyInterest(double monthlyInterestRate) {
		return monthlyInterestRate * balance;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}

}
