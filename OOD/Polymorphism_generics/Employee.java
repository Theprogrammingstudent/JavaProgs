package Mulkerrins_Alex_3049679_Lab06_Eclipse;

//Alex Mulkerrins - 3049679

public class Employee extends Person {

	// Data field
	//String PPS Number as requested in the questoin.
	String pPSNumber;

	// Constructor
	/**The Employee constructor, takes in String newName, 
	 * int newPhoneNumber and String newPPSNumber
	 * as the parameters of the constructor.
	 * IT uses the 'super' keyword to call the superclass constructor and invokes
	 * the setPPSNumber() setter. 
	 * 
	 **/
	Employee(String newName, int newPhoneNumber,String newPPSNumber) {
		super(newName, newPhoneNumber);
		setPPSNumber(newPPSNumber);
	}//Constructor close.

	// Methods

	/**
	 * PPS Number Getters & Setters.
	 */
	public String getPPSNumber() {
		return pPSNumber;
	}

	public void setPPSNumber(String newPPSNumber) {
		this.pPSNumber = newPPSNumber;
	}

	
	/**Override the toString to return the details of the Employee class i.e.
	 * What type of object it is, what the persons name is, what their phone Number is
	 * and what their PPS Number is.
	 * 
	 * Then return the String.
	 * */
	@Override
	public String toString() {
		String st = "This is an Employee object\nThis is the Employees name: " + name + "\nThis is the Employees phone number: " + phoneNumber
				+ "\nThis is the Employees pps number: " + pPSNumber;
		return st;
	}//toString End
	
	/** This is the overriden equals method. 
	 *  it takes in an object emp into the parameters.
	 *  
	 *  First it checks this... if the object is
	 *  not an 'instanceof' Employee, it will return
	 *  false;
	 *  
	 *  Second, if the object is null it returns
	 *  false.
	 *  
	 *  Next it casts the object to Employee.
	 *  
	 *  And checks if the PPS Number by calling itself.
	 *  
	 *  If they are the same it returns true.
	 *  
	 *  Or else it returns false.
	 * 
	 * */

	@Override
	public boolean equals(Object emp) {
		if (!(emp instanceof Employee))
			return false;
		Employee e = (Employee) emp;
		if (e.pPSNumber.equals(pPSNumber)) {
			return true;
		} else
			return false;
	}//equalsEnd

}//Employee Class End
