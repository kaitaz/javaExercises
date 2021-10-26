package ch_10_Object_Oriented_Thinking;

import java.util.Scanner;
import ch_9_Object_and_Classes.Account;

/*10.7 (Game: ATM machine) Use the Account class created in Programming Exercise
9.7 to simulate an ATM machine. Create 10 accounts in an array with id
0, 1, . . . , 9, and an initial balance of $100. The system prompts the user to
enter an id. If the id is entered incorrectly, ask the user to enter a correct id.
Once an id is accepted, the main menu is displayed as shown in the sample
run. You can enter choice 1 for viewing the current balance, 2 for withdrawing
money, 3 for depositing money, and 4 for exiting the main menu. Once
you exit, the system will prompt for an id again. Thus, once the system starts,
it will not stop.*/

public class ATMMachine {

	public static void main(String[] args) {
		// Create 10 accounts
		
		Account [] accounts = createAccounts();
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an Id: ");
		int id = input.nextInt();
		
		while (id > 9) {
			System.out.print("Enter an valid Id: ");
			id = input.nextInt();
		}
		int choice = 0;
		while (choice != 4) {
			System.out.println("\nMain Menu");
			System.out.println("1: Check Balance \n2: withdraw \n3: deposit \n4: exit\n");
			System.out.print("Enter a choice : ");
			choice  = input.nextInt();
			
			while (choice < 1 || choice > 4) {
				System.out.print("Enter an valid Choice: ");
				choice = input.nextInt();
			}
			choice(id, choice, accounts);
		}
		
		if (choice == 4) {
			System.out.print("Enter an Id: ");
			id = input.nextInt();
			System.exit(1);
		}
		
	
			
	}
	
	public static  Account [] createAccounts() {
		Account [] accounts = new Account[10];
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
		return accounts;
	}
	
	public static void choice (int id, int choice, Account[] accounts) {
		
		Scanner input = new Scanner (System.in);
		switch (choice) {
		case 1: System.out.println("$" + accounts[id].getBalance());
			break;
		case 2: System.out.print("Enter an amount to withdraw: ");
			double amountWithdraw = input.nextDouble();
			accounts[id].withdraw(amountWithdraw);
			break;
		case 3: System.out.print("Enter an amount to deposit: ");
		double amountDeposit = input.nextDouble();
		accounts[id].deposit(amountDeposit);
			break;
	
		}
	}

}
