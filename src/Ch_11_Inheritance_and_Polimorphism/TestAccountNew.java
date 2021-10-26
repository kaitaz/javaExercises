package Ch_11_Inheritance_and_Polimorphism;

/*Write a test program that creates an Account with annual interest rate 1.5%,
balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
account and withdraw $5, $4, and $2 from the account. Print an account summary
that shows the account holder name, interest rate, balance, and all transactions.*/

public class TestAccountNew {

	public static void main(String[] args) {
		// 
		AccountNew account = new AccountNew("George", 1122, 1000);
			account.setAnnualInterestRate(1.5);
			
			account.deposit(30, "Deposit 30");
			account.withdraw(5, "Withdraw 5");
			account.withdraw(4, "Withdraw 4");
			account.deposit(40, "Deposit 40");
			account.deposit(50, "Deposit 50");
			account.withdraw(2, "Withdraw 2");
			
			account.display();

	}

}
