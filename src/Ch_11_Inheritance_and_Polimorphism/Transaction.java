package Ch_11_Inheritance_and_Polimorphism;

import java.util.Date;

/*

UML Transaction
- date: java.util.Date
- type: char
- amount: double
- balance: double
- description: String
--------------------------------------
+ Transaction(type: char,
amount: double, balance:
double, description: String) */

public class Transaction extends AccountNew{

	protected Date transactionDate ;
	protected char type;
	protected double amount;
	protected double balance;
	protected String description;
	
	public Transaction(char type, double amount, double balance, String description ) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		transactionDate = new Date();
		
	}
	
	public Date getTransactionDate() {
		return transactionDate;
	}
	
	public char getType() {
		return type;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
