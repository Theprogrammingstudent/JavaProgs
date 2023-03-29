package Mulkerrins_Alex_3049679_Assignment01_Eclipse;

//Alex Mulkerrins - 3049679.

public class Lab1 {
	
	//Main method
	public static void main(String[] args) {
		
		/** Create 4 student objects from the student class, 
		 * The first two are passed into the four argument constructor 
		 * as there is first & last name, gender and age.
		 * 
		 * The third and fourth are passed into the three argument constructor
		 * as there is only first name, gender and age.
		 * */
		
		Student student1 = new Student("Susan", "Smith", 'F', 26);
		
		Student student2 = new Student("Johnny", "Smith", 'M', 23);
		
		Student student3 = new Student("Charlie", 'M', 15);
		
		Student student4 = new Student("Tommy", 'M', 10);
		
		
		/** Example of setting up an entry using the default constructor
		 *  we need to manually call all variables and methods from the student
		 *  class so we can initialise our student5 object.
		 * */
		Student student5 = new Student();
		student5.firstName = "Jimmy";
		student5.lastName = "Smith";
		student5.gender = 'M';
		student5.age = 50;
		student5.studentAgeGroup(student5.age);
		student5.display(student5.firstName, student5.lastName, student5.ageBracket, student5.gender, student5.age);

	}//Main Method close

}//Class Close
