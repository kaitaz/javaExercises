package ch_9_Object_and_Classes;

/*Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created.*/

public class TestAccount {

	public static void main(String[] args) {
		//Create object
		
		Account account = new Account (1122, 20000);
		
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("The balance is: " + account.getBalance() + " and the interest rate is: "
				+ account.getAnnualInterestRate() + "%. \nThe account was created on: " + account.getAccountDate().toString());
		
		

	}

}
