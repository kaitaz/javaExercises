package Chapter_10_Object_Oriented_Thinking;

import java.util.Scanner;

import Chapter_9_Objects_And_Classes.Account;

/*(Game: ATM machine) Use the Account class created in Programming Exercise
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
			Account[] accounts = new Account[10];
			int id = 0;
			int choice = 0;
			for(int i = 0; i < accounts.length; i++)
				accounts[i] = new Account(i, 100, 0);
			
			do {
			
				id = userInput("Enter an id: \n");
				if (id < 0 || id > 9) {
					System.out.println("Invalid id. Try again");
					id = userInput("Enter an id: \n");
				}
				do  {
					System.out.println("Main menu\r\n"
							+ "1: check balance\r\n"
							+ "2: withdraw\r\n"
							+ "3: deposit\r\n"
							+ "4: exit");
					choice = userInput("Enter an choice: \n");
					if (choice < 1 || choice > 4) {
						System.out.println("Invalid choice. Try again");
						choice = userInput("Enter an choice: \n");}
					switch (choice) {
					case 1: System.out.println(accounts[id].getBalance());
						break;
					case 2: accounts[id].withdraw(userInput("Enter the amount of money to withdraw: "));
						break;
					case 3: accounts[id].deposit(userInput("Enter the amount of money to deposit: "));
					break;
					
					}
					
					
				} while(choice != 4);
					
			} while (id != 10);
			
		}
			
		private static int userInput(String option) {
			Scanner input = new Scanner(System.in);
			System.out.print(option);
			int userOption = input.nextInt();
			return userOption;
		}			

}
