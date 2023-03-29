package Mulkerrins_Alex_3049679_Lab06_Eclipse;

//Alex Mulkerrins - 3049679


public class Person{

	//Data fields for person class.
	//String Name & int phoneNumber as asked in question.
	String name;
	int phoneNumber;
	
	
	//Constructor
	/**The person constructor, takes in String newName, int newPhoneNumber
	 * as the parameters and invokes the setters. 
	 * 
	 */
	Person (String newName, int newPhoneNumber){
		setName(newName);
		setPhoneNumber(newPhoneNumber);
		
	}//ConstructorEnd.
	
	
	
	//Methods
	
	
	/**Name & Phone Numbers
	 * Getters & Setters
	 * 
	 * */
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	
	public void setPhoneNumber(int newPhoneNumber) {
		this.phoneNumber= newPhoneNumber;
	}
	
	/**
	 * Override the toString to return the details of this class i.e.
	 * What type of object it is, what the persons name is and what their phone Number is.
	 * */
	@Override
	public String toString() {
		String st = "This is a person object\nThis is the persons name: " + name + "\nThis is the persons phone number: " + phoneNumber;
		return st;
	}//toString End

	/** This is the overriden equals method. 
	 *  it takes in an object p in the parameters.
	 *  
	 *  First it checks this... if the object
	 *  not an 'instanceof' Person, it will return
	 *  false;
	 *  
	 *  Second, if the object is null it returns
	 *  false.
	 *  
	 *  Next it casts the object to person.
	 *  
	 *  And checks if the name calling itself 
	 *  and checks phoneNumber.
	 *  
	 *  If they are the same it returns true.
	 *  
	 *  Or else it returns false.
	 * 
	 * */
	@Override
	public boolean equals(Object p){ 
		if(!(p instanceof Person))
			return false;
		if(p == null)
			return false;
		Person per = (Person)p; 
		if(per.name.equals(name) && 
			per.phoneNumber == per.getPhoneNumber()){
			return true;}
		else
			return false;
	}//Equals end
	
}//Person Class End
