package Mulkerrins_Alex_3049679_Lab04_Eclipse;

//Alex Mulkerrins - 3049679

//Change the Account Class to an abstract using abstract keyword.
//Abstract method declaration at the bottom.
abstract class AccountLab04 {

	//Data Fields
	//Account number and account balance - integers.
	//Declare and initialise interest at 20%.
	double interest = 1.2;
	int accNo;
	int accBal;
	
	/**One argument constructor.
	 * Use 'newAccNo' as the parameter, then invoke both methods in the constructor
	 * to 'set' account balance to 0 and account number to the parameter input.*/	
	
	public AccountLab04(int newAccNo){
		
	//Create an account with balance 0, through invoking setters and getters.
	setAccBal();
	setAccNo(newAccNo);
		
	}
	
	
	//Methods
	
	/**Account Balance & Account Numbers
	 * Getters & Setters*/
	public int getAccBal() {
		return accBal;
	}
	
	public void setAccBal() {
		this.accBal = 0;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	
	public void setAccNo(int newAccNo) {
		this.accNo= newAccNo;
	}
	
	
	/**Method to deposit funds into the new account.
	 * newAccNo and depositAmount are the parameters.
	 * newAccNo must be equal to accNo.
	 * depositAmount must be greater than 0.
	 * accBal is then set to deposit amount.*/
	public void depositFunds(int newAccNo, int depositAmount) {
		
		if(newAccNo != accNo) {
			System.out.println("Error! Wrong account number.");
		}
		
		else if(depositAmount <= 0) {
			System.out.println("Error! Deposit must be greater than 0.");
		}
		
		else {
		this.accBal = depositAmount;
		System.out.println("You depositted €" + depositAmount + " into" + toString());
		}
	}//Deposit funds close
	
	/**Method to withdraw funds from the new account.
	 * - newAccNo and withdrawAmount are the parameters.
	 * - newAccNo must be equal to accNo.
	 * - withdrawAmount must be greater than 0.
	 * - The withdraw amount must be less than the account balance.
	 * - The withdraw amount is then taken away from the account balance
	 *   leave the new balance remaining.
	 *   */
	
	public void withdrawFunds(int newAccNo, int withdrawAmount ) {
		
		if(newAccNo != accNo) {
			System.out.println("Error! Wrong account number.");
		}
		
		else if(withdrawAmount <= 0) {
			System.out.println("Error! Must withdraw an amount greater than 0.");
		}
		
		else if(withdrawAmount >= accBal) {
			System.out.println("Error! withdraw amount must be less than account balance.");
		}
		
		else {
			accBal -= withdrawAmount;
			System.out.println("You withdrew €" + withdrawAmount + " from" + toString());
		}
	}//WithdrawFunds close
	
	/**Apply Interest method
	 * - newAccNo must equal accNo
	 * - 'this.accBal' is then multiplied by the 
	 *   interest rate.*/
	
	public void applyInterest(int newAccNo) {
		if(newAccNo != accNo) {
			System.out.println("Error!");
		}
		
		else {
			this.accBal *= interest;
			System.out.println("After applying interest to " + toString());
		}
	}//applyInterest close
	
	/**My toString method, this will return a string stating the account number a balance.*/
	
	@Override
	public String toString() {
		return " your \"" + getAccNo() + "\" account. Your account balance is now €" + getAccBal() + ".";
	}
	
	
	/**This is my abstract method printAccountInfo(), which I have declared in my
	 * abstract class AccountLab04. I will implement this method in my Current Account 
	 * and Saving Account classes.
	 */
	
	public abstract void printAccountInfo();
	
}//Class end.
