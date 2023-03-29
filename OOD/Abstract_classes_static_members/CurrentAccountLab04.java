package Mulkerrins_Alex_3049679_Lab04_Eclipse;

//Alex Mulkerrins - 3049679

public class CurrentAccountLab04 extends AccountLab04{

	//Data fields
	//Overdraft limit variable for an account overdraft.
	/**Declare a static int cObjectCounter to count each 
	 * object instance for a current account.
	 */
	int overdraft = -200;
	static int cObjectCounter;
	
	
	//Constructors
	/**Create a one arg constructor.
	 * - use 'super' to call the super class
	 *   one arg constructor in the Account class.
	 * - newAccNo is the parameter that feeds into the
	 *   parent class constructor where the account 
	 *   number and account balance setters are invoked.
	 *   
	 *   Increment the current object counter to add a new object
	 *   instance.
	 **/
	CurrentAccountLab04(int newAccNo) {
		super (newAccNo);
		cObjectCounter++;
		
	}
	
	//Methods
	
	/** Override withdrawFunds method from the Account class
	 * - newAccNo should equal accNo.
	 * - withdrawAmount should be greater than 0.
	 * 
	 * - selection statement - 'if' the withdrawAmount is greater than the 
	 *   account balance then we introduce the overdraft = -200.
	 * - if the account balance then reaches -201, 'Insufficient
	 *   funds' is printed as it has passed the limit.
	 * - if the account balance is greater than the overdraft (>= -200), then the cancel
	 *   amount is applied.  
	 *   
	 *   Otherwise, take the withdraw amount from the account balance as in the Account class. 
	 *   */
	
	@Override
	public void withdrawFunds(int newAccNo, int withdrawAmount ) {
		if(newAccNo != accNo || withdrawAmount <= 0) {
			System.out.println("Error!");
		}
		
		
		else if(withdrawAmount >= accBal) {
			
			accBal -= withdrawAmount;
			
			if( accBal <= overdraft) {
				accBal += withdrawAmount;
			System.out.println("Insufficient funds, you have exceeded your overdraft limit! Your account balance is still €" + accBal + ".");
			}
			
			else {
				System.out.println("You have entered the overdraft on your \"" + getAccNo() + "\" account. You withdrew €"
						+ withdrawAmount + " from you account. Your account balance is now €" + accBal +".");	
			}
		}
			
		
		else {
			accBal -= withdrawAmount;
			System.out.println("You withdrew €" + withdrawAmount + " from" + toString());
		}
			

	}//WithdrawFunds close

	/**In the account class I declared the abstract method printAccountInfo().
	 * Now in the CurrentAccountLab04 class I will Override this printAccountInfo()
	 * to print the current account details to console. The particular details are
	 * associated with each object instance, called in the main method.
	 * The getter methods are invoked for account number and account balance.*/
	@Override
	public void printAccountInfo() {
		System.out.println();
		System.out.println("This is the status of your current account: " );
		System.out.println("Your Current account number is: " + getAccNo());
		System.out.println("Your Current account balance is: €" + getAccBal());
		System.out.println();
	}
	
	/**This is the static method that will count the number of current account objects.
	 * and then display this to console when called from the main method.*/
	public static void displayNumberOfAccounts() {
		System.out.println("The number of current account objects stands at: " + cObjectCounter);
	}
	
}//Current Account Class close
