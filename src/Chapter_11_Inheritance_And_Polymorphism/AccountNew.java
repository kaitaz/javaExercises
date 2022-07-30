package Chapter_11_Inheritance_And_Polymorphism;

import java.util.ArrayList;
import java.util.Date;

/*
(New Account class) An Account class was specified in Programming Exercise 9.7.
Design a new Account class as follows:
	Add a new data field name of the String type to store the name of the
customer.
	Add a new constructor that constructs an account with the specified name, id,
and balance.
	Add a new data field named transactions whose type is ArrayList that
stores the transaction for the accounts. Each transaction is an instance of the
Transaction class
	Modify the withdraw and deposit methods to add a transaction to the
transactions array list.
	All other properties and methods are the same as in Programming Exercise 9.7.
Programming Exercises 449
Write a test program that creates an Account with annual interest rate 1.5%,
balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
account and withdraw $5, $4, and $2 from the account. Print an account summary
that shows the account holder name, interest rate, balance, and all transactions.*/

/*
 	AccountNew
 -----------------
 - name: String
 - id: int
 - balance: double
 - annualInterestRate: double
 - transactions: ArrayList<Transaction>
 - dateCreated: Date
 
 + AccountNew()
 + AccountNew(id: int, balance: double)
 + AccountNew(name: String, in: int, balance: double)
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
 
Transaction
-----------
- date: java.util.Date
- type: char
- amount: double
- balance: double
- description: String

+ Transaction(type: char, amount: double, balance: double, description: String)


account: AccountNew
--------------------
annualInterestRate = 1.5
balance = 10000
id = 1122
name = "George"
 
  */

public class AccountNew {
	private String name;
	private int id;
	private double balance;
	private double annualInterestRate;
	ArrayList<Transaction> transactions = new ArrayList<>();
	private Date dateCreated;
	
	AccountNew(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public AccountNew(int id, double balance, double annualInterestRate) {

		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();	
	}
	
	public AccountNew(String name, int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
		
		dateCreated = new Date();	
	}

	public String getName() {
		return name;
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
	
	public void setNmae(String name) {
		this.name = name;
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
	
	public void withdraw(Transaction transaction) {
		transaction.balance -= transaction.amount;
		this.balance = transaction.balance;
		transactions.add(transaction);
	}
	
	public void deposit(Transaction transaction) {
		transaction.balance += transaction.amount;
		this.balance = transaction.balance;
		transactions.add(transaction);
	}

	

	

}
