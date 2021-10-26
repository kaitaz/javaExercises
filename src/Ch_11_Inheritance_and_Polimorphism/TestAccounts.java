package Ch_11_Inheritance_and_Polimorphism;

import ch_9_Object_and_Classes.Account;

public class TestAccounts {

	public static void main(String[] args) {

		// Create an Account object
		Account account = new Account (1122, 20000);
		
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println(account.toString());
		System.out.println();
		
		// Create an CheckingAccount object
		CheckingAccount checkingAccount = new CheckingAccount (1122, 20000);
		
		checkingAccount.setAnnualInterestRate(2.5);
		checkingAccount.withdraw(2500);
		checkingAccount.deposit(3000);
		
		System.out.println(checkingAccount.toString());
		System.out.println();
		
		// Create an SavingsAccount object
		SavingsAccount savingAccount = new SavingsAccount (1122, 20000);
		
		savingAccount.setAnnualInterestRate(6.5);
		savingAccount.withdraw(2500);
		savingAccount.deposit(3000);
		
		System.out.println(savingAccount.toString());

	}

}
