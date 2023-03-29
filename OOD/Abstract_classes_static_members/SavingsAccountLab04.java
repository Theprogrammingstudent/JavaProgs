package Mulkerrins_Alex_3049679_Lab04_Eclipse;

//Alex Mulkerrins - 3049679

public class SavingsAccountLab04 extends AccountLab04 {
	
	//Data Fields
	/**Declare a static int sObjectCounter to count each 
	 * object instance for a savings account.
	 */
	static int sObjectCounter;
	
	//Constructors
	/**  Create a one arg constructor
	 * - use 'super' to call the super class
	 *   one arg constructor in the Account class.
	 * - newAccNo is the parameter that feeds into the
	 *   parent class constructor where the account 
	 *   number and account balance setters are invoked.
	 *   
	 *   Increment the savings object counter to add a new object
	 *   instance.
	 *     */
	
	
	SavingsAccountLab04(int newAccNo) {
		super (newAccNo);
		sObjectCounter++;
	}
	
	//Methods
	
	/**In the account class I declared the abstract method printAccountInfo().
	 * Now in the SavingsAccountLab04 class I will Override this printAccountInfo()
	 * method to print the current account details to console. The particular details are
	 * associated with each object instance, called in the main method.
	 * The getter methods are invoked for account number and account balance.*/
	@Override
	public void printAccountInfo() {
		System.out.println();
		System.out.println("This is the status of your savings account: " );
		System.out.println("Your Savings account number is: " + getAccNo());
		System.out.println("Your Savings account balance is: " + getAccBal());
		System.out.println();
	}
	
	/**This is the static method that will count the number of savings account objects,
	 * and then display this to console when called in the main method.*/
	public static void displayNumberOfAccounts() {
		
		System.out.println("The number of savings account objects stands at: " + sObjectCounter);
	}
	
}//Class close
