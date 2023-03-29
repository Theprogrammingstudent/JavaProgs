package Lab2_Mulkerrins_Alex_304967_Eclipse;

//Alex Mulkerrins - 3049679 

public class StudentLab2 {

	//Data Fields
	
	// Declare our data field variables.
	public String firstName;
	public String lastName;
	public String ageBracket;
	public String m = "m";
	public String male = "Male";
	public String f = "f";
	public String female = "Female";
	public int age;
	public int gender;
	
	//Constructors
	
	// The default constructor.
	 
	StudentLab2(){
	
	}
	
	
	//Methods for this program
	
	//get & set first name (FName).
	
	/**In setFName method use newFirstName.substring(0,1) to get select the first letter, .toUpperCase() will change the
	 * first letter to an upper case. Then concatenate newFirstName.substring(1) to select the rest
	 * of the string and use .toLowerCase() to change it to lower case. Set the variable to
	 * this.firstName meaning the declared variable in the data field of this class.*/
	
	//getFName simply returns the string variable firstName when called.
	public String getFName() {
		return firstName;
		
	}
	
	public void setFName(String newFirstName) {
		this.firstName = newFirstName.substring(0,1).toUpperCase() 
				+ newFirstName.substring(1).toLowerCase();
	}
	
	
	
	//get & set last name (LName).
	
	/**In setLName method use newLastName.substring(0,1) to get select the first letter, .toUpperCase() will change the
	 * first letter to an upper case. Then concatenate newLastName.substring(1) to select the rest
	 * of the string and use .toLowerCase() to change it to lower case. Set the variable to
	 * this.lastName meaning the declared variable in the data field of this class.*/
	
	//getFName simply returns the string variable firstName when called.
	public String getLName() {		
		return lastName;
	}
	
	public void setLName(String newLastName) {
		this.lastName = newLastName.substring(0,1).toUpperCase() 
				+ newLastName.substring(1).toLowerCase();
	}
	
	
	
	//get & set Age.
	
	//getAge simply returns the int variable age when called.
	public int getAge() {
		return age;
	}
	
	/**In the setAge method, a selection statement is set up. If newAge is < 0 or > 100
	 * we will print an error and return age as -1. "else" set this.age = newAge age being the data field variable
	 * in the data field of this class. Also we invoke setStAG (student age group) method to determine age group.*/
	public void setAge(int newAge) {
		if (newAge < 0 || newAge > 100) {
			System.out.println("Error the age is below 0 or above 100.");
			this.age = -1;
		}
		else {
			this.age = newAge;
			setStAG(newAge);
		}
		
	}
	

	//get & set Gender.
	//‘m’, ‘M’, ‘Male’ or ‘MALE’ = 0.
	//‘f’, ‘F’, ‘Female’ or ‘FEMALE’ = 1.
	
	/**In the setGender we need to cater to a couple of various strings in the comment above
	 * we can compare these using .equalsIgnoreCase(). so if we get any variation of "m" or (||)
	 * any variation of "male" we can set gender to = 0. The same goes for female. Using .equalsIgnoreCase()
	 * if we get any variation of "f" or (||) any variation of "female" we can set gender to = 1.
	 * this.gender refers to the declared int in the data field of this class.*/
	
	//getGender will simply return the value of the gender when called upon.
	public int getGender() {
		return gender;
	}
	
	public void setGender(String newGender) {
		
		if (newGender.equalsIgnoreCase(m) ||
		newGender.equalsIgnoreCase(male)){
			this.gender = 0;
		}
		
		else if (newGender.equalsIgnoreCase(f)||
		newGender.equalsIgnoreCase(female)) {
			this.gender = 1;	
		}
	}
	
	
	/*
	 * studentAgeGroup method sends "newAge" as the parameter for this method
	 * when called from setAge().
	 * 
	 * setStAG takes in newAge and compares its value in a set selection statements
	 * to determine what to set the value of "ageBracket" as.
	 * 
	 * getStAG will return the value of ageBracket set from setStAG. 
	 */
	
	public String getStAG() {
		return ageBracket;
	}
	
	public void setStAG(int newAge){
		
		if (newAge <= 12) {
			this.ageBracket = "Child";
		}
		else if (newAge >= 13 && newAge <= 19) {
			this.ageBracket = "Teenager";
		}
		else if (newAge >= 20 && newAge <= 25 ) {
			this.ageBracket = "Young Adult";
		}
		else {
			this.ageBracket = "Adult";
		}
	}
	
}//Class close

