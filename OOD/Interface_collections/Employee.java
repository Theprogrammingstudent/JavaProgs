package Mulkerrins_Alex_3049679_Lab05_Eclipse;

//Alex Mulkerrins - 3049679

/**The Employee class is set to implement both the Taxable interface and the PRSI interface*/
public class Employee implements TaxableInterface, PRSIInterface {

	//Data fields
	/* Declare one String name, one int PPSNumber
	 * & three doubles annualSalary, prsi & tax.
	 * 
	 */
	public String name;
	public int PPSNumber;
	public double annualSalary;
	public double prsi;
	public double tax;
	
	//Constructor
	/**Create a constructor that will intake: newName, newPPSNumber & newAnnualSalary
	 * as parameters.
	 * 
	 * The constructor will then invoke the set methods for the declared variables.
	 * using each parameter from the constructor.*/
	Employee(String newName,int newPPSNumber, double newAnnualSalary){
		
		setName(newName);
		setPPSNumber(newPPSNumber);
		setAnnualSalary(newAnnualSalary);
	}
	
	//Getters'N'Setters
	/**Below are the getters & Setters needed for this Class.
	 * They will set (using "this." keyword) & return the variable when called.*/
	
	public String getName() {
		return name;
	}
	public int getPPSNumber() {
		return PPSNumber;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	
	public void setName(String newName) {
		this.name = newName;
	}
	public void setPPSNumber(int newPPSNumber) {
		this.PPSNumber = newPPSNumber;
	}
	public void setAnnualSalary(double newAnnualSalary) {
		this.annualSalary = newAnnualSalary;
	}
	
	
	/** This method is an "Overriden" abstract method from the PRSIInterface.
	 *  calculatePRSI is set to getAnnualSalary() passed through from the Employee object,
	 *  and determine what the PRSI should be for the employee using selection statements.
	 *  
	 *  If the annual salary / 52 (ie. salary per week) is less than €352,
	 *  prsi = 0.
	 *  "else" multiply the annual salary by the static variable give in the PRSIInterface
	 *  interface.
	 *  
	 *  return prsi.
	 */
	@Override
	public double calculatePRSI() {
		
		if (getAnnualSalary()/52 < 352) {
			this.prsi = 0;
		}
		
		else {
			this.prsi = getAnnualSalary()*rate;
		}
		return prsi;
	}

	/**This method is an "Overriden" abstract method from the TaxableInterface.
	 *  calculateTax is set to getAnnualSalary() passed through from the Employee object,
	 *  and determine what the tax should be using selection statements.
	 *  
	 *  "If" the annual salary is less than 33,800 then the Annual Salary is
	 *  taxed at 20%.
	 *  
	 *   "Else if" the tax is greater than 33,800 then:
	 *   higherBand is equal to annual salary - 33,800.
	 *   higherBand is taxed at 40%.
	 *   
	 *   lowerBand is equal to 33,800
	 *   lowerBand is taxed at 20%
	 *   
	 *   Add both bands together to get the total tax 
	 *   and return tax.
	 */
	
	@Override
	public double calculateTax() {
		if(getAnnualSalary() <= 33800) {
			tax = (getAnnualSalary()*0.2);
		}
		else if(getAnnualSalary() >= 33800) {
			double higherBand = getAnnualSalary() - 33800;
			tax = (higherBand*0.4);
			double LowererBand = 33800;
			tax += (LowererBand*0.2);
			
		}
		return tax;
	}

	/**This method is an "Overriden" abstract method from the TaxableInterface.
	 * printTax is set to print to each attribute of the Employee Class when the object
	 * is called in Lab05.java*/
	
	@Override
	public void printTax() {
	System.out.println("The employee's name is: " + getName());
	System.out.println("The employees PPS Number is: " + getPPSNumber());
	System.out.println("The employees annual salary is: " + getAnnualSalary());
	System.out.println("The employees PRSI is: €" + calculatePRSI());
	System.out.println("The employees Tax is: €" + calculateTax());
	System.out.println();
		
	}
	
}
