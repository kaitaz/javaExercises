package Ch_11_Inheritance_and_Polimorphism;

import java.util.ArrayList;
import java.util.Date;

/*11.8 (New Account class) An Account class was specified in Programming Exercise 9.7.
Design a new Account class as follows:
	Add a new data field name of the String type to store the name of the
customer.
	Add a new constructor that constructs an account with the specified name, id,
and balance.
	Add a new data field named transactions whose type is ArrayList that
stores the transaction for the accounts. Each transaction is an Each transaction is an instance of the
Transaction class.
	Modify the withdraw and deposit methods to add a transaction to the
transactions array list.
	All other properties and methods are the same as in Programming Exercise 9.7.

 	UML
 - name : String
 - id : int
 - balance: double
 - annualInterestRate: double
 - date : Date
 - transactions[]: ArrayList <Transactions>
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

public class AccountNew {
	
	protected String name;
	protected int id;
	protected double balance;
	protected double annualInterestRate;
	protected Date accountDate ;
	protected ArrayList <Transaction> transactions = new ArrayList<>();
	
	public AccountNew() {
		
	}
	
	public AccountNew(int id, double balance) {
		this.id = id;
		this.balance = balance;
		accountDate = new Date();
		}
	
	public AccountNew(String name, int id, double balance) {
		this.name = name;
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
	
	public void withdraw(double cash, String description) {
		if (cash > balance && balance > 0 ) {
			System.out.println("Insuficient funds ");}
		else{
			balance -= cash ;
			transactions.add(new Transaction ('W', cash, balance, description ));
		}
	}
	
	public void deposit(double cash, String description) {
		balance += cash ;
		transactions.add(new Transaction ('D', cash, balance, description ));
		
	}
	
	public void display() {
		 System.out.println("The account holder: " + name + "\nBalance: " + balance + "\nInterest rate: "
				+ annualInterestRate + "%.\n");
		
		for (int i = 0; i < transactions.size(); i++) {
			System.out.println(transactions.get(i).type + "\t" + transactions.get(i).amount + "\t" + transactions.get(i).balance + "\t" +
					transactions.get(i).transactionDate.toString() + "\t" + transactions.get(i).description);
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
}
