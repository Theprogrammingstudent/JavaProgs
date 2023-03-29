package Mulkerrins_Alex_3049679_Lab05_Eclipse;

//Alex Mulkerrins - 3049679

/** This is the Car Class, that "Implements" the 'TaxableInterface' interface.*/

public class Car implements TaxableInterface{

	//Data fields
	/* Declare two strings "make" & "model", and two ints "engineSize" & "Tax"*/
	public String make;
	public String model;
	public int engineSize;
	public int Tax;
	
	//Constructor
	/**Create a constructor that will intake: newMake, newModel & newEngineSize
	 * as parameters.
	 * 
	 * The constructor will then invoke the setter methods for the declared variables.
	 * using each parameter from the constructor.*/
	Car(String newMake, String newModel, int newEngineSize){
		
		setMake(newMake);
		setModel(newModel);
		setEngineSize(newEngineSize);
		
	}//constructor close
	
	
	//Getters'N'Setters
	/**Below are the getters & Setters needed for this Class.
	 * They will set (using "this." keyword) & return the variable when called.*/
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}
	public int getEngineSize() {
		return engineSize;
	}
	
	
	public void setMake(String newMake) {
		this.make = newMake;
	}
	public void setModel(String newModel) {
		this.model = newModel;
	}
	public void setEngineSize(int newEngineSize) {
		this.engineSize = newEngineSize;
	}
	
	
	/** This method is an "Overriden" abstract method from the TaxableInterface.
	 *  calculateTax is set to getEngineSize() passed through from the car object
	 *  and determine what the tax should be using selection statements.
	 *  
	 *  "If" the engine is less than 1000 then tax is €200.
	 *  "else if" tax is between 1 & 2 thousand, tax is €900.
	 *  "else if" tax is greater than 2000, tax is 1800.
	 *  
	 *  then returns tax*/
	@Override
	public double calculateTax() {
		
		if(getEngineSize() < 1000) {
			Tax = 200;
		}
		
		else if(getEngineSize() > 1000 && getEngineSize() < 2000) {
			Tax = 900;
		}
		
		else if(getEngineSize() > 2000) {
			Tax = 1800;
		}
		return Tax;
		
	}
	
	
	/**This method is an "Overriden" abstract method from the TaxableInterface.
	 * printTax is set to print to each attribute of the Car Class when the object
	 * is called in Lab05.java*/
	@Override
	public void printTax() {
		
		System.out.println("The Make of the car is: " + getMake());
		System.out.println("The model of the car is: " + getModel());
		System.out.println("The engineSize of the car is: " + getEngineSize()+"cc");
		System.out.println("The tax on your car is: €" + calculateTax());
		System.out.println();
		
	}
	
	
}
