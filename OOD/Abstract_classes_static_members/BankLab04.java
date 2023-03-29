package Mulkerrins_Alex_3049679_Lab04_Eclipse;

//Alex Mulkerrins - 3049679

public class BankLab04 {

	public static void main(String[] args) {

		/**4 objects - 2 to test each sub class
		 * */

		/*The first object set (c1 & c2) is to create some current account objects from the CurrentAccount class.
		 * 
		 * Using the printAccountInfo abstract method, print the account details.
		 * The abstract method is declared in the AccountLab04 class. It is overriden
		 * and implemented in the CurrentAccountLab04 class.
		 *  
		 * Test depositing funds and print new balance of the current account.
		 * Test withdrawing funds and print new balance of the current account.
		 * Test withdrawing funds to test entering the overdraft function and print new balance of the current account.
		 * Test withdrawing funds once more to show the overdraft limit, print new balance of the current account.
		 * For the withdraw method it will be overridden from the abstract Account superclass to cater for the overdraft function.
		 * Use the print statements in the methods and toString method to print to console.
		 * 
		 * Call displayNumberOfAccounts() static method from the CurrentAccountLab04 class to show the current
		 * number of objects created.
		 * 
		 * repeat for the second object created.
		 */
		AccountLab04 c1 = new CurrentAccountLab04(1111);
		c1.depositFunds(1111, 1000);
		c1.withdrawFunds(1111, 500);		
		c1.withdrawFunds(1111, 600);		
		c1.withdrawFunds(1111, 101);
		c1.printAccountInfo();
		CurrentAccountLab04.displayNumberOfAccounts();
		
		System.out.println("\n\n");
		
		AccountLab04 c2 = new CurrentAccountLab04(2222);
		c2.depositFunds(2222, 2000);
		c2.withdrawFunds(2222, 1500);		
		c2.withdrawFunds(2222, 701);		
		c2.withdrawFunds(2222, 600);
		c2.printAccountInfo();
		CurrentAccountLab04.displayNumberOfAccounts();
		
		
		System.out.println("\n\n");
	
		/* The second object set (s1 & s1) is to create some savings account objects from the SavingsAccount class.
		 * 
		 * Using the printAccountInfo abstract method, print the account details.
		 * The abstract method is declared in the AccountLab04 class. It is overriden
		 * and implemented in the SavingsAccountLab04 class.
		 * 
		 * Test depositing funds and print new balance of the Savings account.
		 * Test applying Interest method and print new balance of the new Savings account.
		 * Test withdrawing funds and print new balance of the new Savings account.
		 * 
		 * Call displayNumberOfAccounts() static method from the SavingsAccountLab04 class to show the current
		 * number of objects created.
		 * 
		 * repeat for the second object created.
		 */
		AccountLab04 s1 = new SavingsAccountLab04(3333);
		
		s1.depositFunds(3333, 1000);	
		s1.applyInterest(3333);
		s1.withdrawFunds(3333, 150);
		s1.printAccountInfo();
		SavingsAccountLab04.displayNumberOfAccounts();
		
		System.out.println("\n\n");
		
		AccountLab04 s2 = new SavingsAccountLab04(4444);		
		
		s2.depositFunds(4444, 1000);	
		s2.applyInterest(4444);
		s2.withdrawFunds(4444, 150);
		s2.printAccountInfo();
		SavingsAccountLab04.displayNumberOfAccounts();
	
	}

}
