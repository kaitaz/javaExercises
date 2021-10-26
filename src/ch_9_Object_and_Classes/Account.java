package ch_9_Object_and_Classes;

import java.util.Date;

/*9.7 (The Account class) Design a class named Account
 * Draw the UML diagram for the class then implement the class.
 	UML
 - id : int
 - balance: double
 - annualInterestRate: double
 - date : Date
 --------------------
 + Account ()
 + Account (id: int, balance: double)
 + getId(): int
 + getBalance(): double
 + getAnnualInterestRate(): double
 + getDate(): Date
 + setId(id : int): void
 + setBalance(balance: double): void
 + setAnnualInterestRate(annualInterestRate: double): void
 + getMonthlyInterestRate(): double
 + getMonthlyInterest(): double
 + withdraw(balance: double): double
 + deposit(balance: double): double

 */

public class Account {
	
	protected int id;
	protected double balance;
	protected double annualInterestRate;
	protected Date accountDate ;
	
	
	public Account() {
		
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		accountDate = new Date();
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
	
	public Date getAccountDate() {
		return accountDate;
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
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100)  / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate() ;
	}
	
	public void withdraw(double cash) {
		if (cash > balance && balance > 0 ) {
			System.out.println("Insuficient funds ");}
		else{
			balance -= cash ;
		}
	}
	
	public void deposit(double cash) {
		balance += cash ;
		
	}
	
	public String toString() {
		
		return "The balance is: " + balance + " and the interest rate is: "
				+ annualInterestRate + "%. \nThe account was created on: " + accountDate;
		}
	
	
	
	
	
	
	
}
