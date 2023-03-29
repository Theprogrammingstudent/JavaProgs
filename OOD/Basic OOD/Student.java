package Mulkerrins_Alex_3049679_Assignment01_Eclipse;

//Alex Mulkerrins - 3049679 

public class Student {

	//Data Fields
	// Declare our data field variables, we do not need to initialise them yet.
	public String firstName;
	public String lastName;
	public String ageBracket;
	public char gender;
	public int age;
	
	//Constructors
	/* The first constructor is a default constructor, the second is the three arg constructor
	 * and the third is the four argument constructor requested.
	 */
	Student(){
	
	}
	
	//threeArg constructor
	Student(String newFirstName, char newGender, int newAge){
		
		//Initialising our variables from the invocation in Lab1.java in each student instance.
		firstName = newFirstName;
		lastName = ("");
		gender = newGender; 
		age = newAge;
		
		/*
		 * Call these methods to return the students age bracket,
		 * then print the results to the output.
		 */
		studentAgeGroup(age);
		display(firstName, lastName, ageBracket, gender, age);
		
	}
	
	//fourArg constructor
	Student(String newFirstName, String newLastName, char newGender, int newAge){
		
		//Initialising our variables from the invocation in Lab1.java in each student instance.
		firstName = newFirstName;
		lastName = newLastName;
		gender = newGender; 
		age = newAge;
		
		/*
		 * Call these methods to return the students age bracket,
		 * then print the results to the output.
		 */
		studentAgeGroup(age);
		display(firstName, lastName, ageBracket, gender, age);
	}
	
	//Methods for this program
	
	/*
	 * studentAgeGroup method sends "age" as the parameter for this method
	 * when called from the constructors.
	 * "String" indicates a string must be returned this is our "ageBracket".
	 * This "ageBracket" will be then passed into display method. 
	 */
	public String studentAgeGroup(int age){
		
		if (age <= 12) {
			return ageBracket = "Child";
		}
		else if (age >= 13 && age <= 19) {
			return ageBracket = "Teenager";
		}
		else if (age >= 20 && age <= 25 ) {
			return ageBracket = "Young Adult";
		}
		else {
			return ageBracket = "Adult";
		}
	}
	
	/*
	 * The final part of the program is the display method.
	 * It is set to display the details (attributes) of each student (object).
	 * Just using simple println().
	 */
	
	 void display(String firstName, String lastName, String ageBracket, char gender, int age) {
		System.out.println("The student's first name is: " + firstName);
		System.out.println("The students last name is: " + lastName);
		System.out.println("The students age is: " + gender);
		System.out.println("The students age is: " + age);
		System.out.println("The students age bracket is: " + ageBracket);
		System.out.println("\n");
	
	}
	
}//Class close
