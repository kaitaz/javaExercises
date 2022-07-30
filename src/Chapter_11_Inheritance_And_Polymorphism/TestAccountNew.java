package Chapter_11_Inheritance_And_Polymorphism;

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

public class TestAccountNew {

	public static void main(String[] args) {

		// Create an AccountNew
		AccountNew account = new AccountNew("George", 1122,  1000) ;
		account.setAnnualInterestRate(1.5);
		int[] deposits = {30, 40, 50};
		int[] withdraws = {5, 4, 2};
		for(int i = 0; i < deposits.length; i++)
			account.deposit(new Transaction('D', deposits[i], account.getBalance(), " Deposit " + deposits[i] + " MDL"));
		for(int i = 0; i < withdraws.length; i++)
			account.withdraw(new Transaction('W', withdraws[i], account.getBalance(), " Withdraw " + withdraws[i] + " MDL"));
		
		System.out.println("Account holder: " + account.getName() + "\nInterest Rate: "
				+ account.getAnnualInterestRate() + "\nBalance: " + account.getBalance());
		
		for (Transaction number: account.transactions)
			System.out.println(number.toString());
			
	}

}
