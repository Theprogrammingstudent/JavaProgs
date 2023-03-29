package Lab2_Mulkerrins_Alex_304967_Eclipse;

//Alex Mulkerrins - 3049679.
/**1. Redefine the Student class from your last assignment and create setters and getters 
 * for each attribute in the class. Create two student objects and call these setters and 
 * getters in order to test them.
 * 
 * 2. Add functionality to the setter methods to modify the input before storing it in a 
 * 	  member variable:
 * 	  a. The first name and last name attributes should begin with a capital letter and 
 * 	  all other letters should be lower case (see note)
 * 
 * 	  b. Store gender as an integer but have the setter method take in a string.
 * 			i. If the user enters ‘m’, ‘M’, ‘Male’ or ‘MALE’ then set the gender to be 0.
 * 			ii. If the user enters ‘f’, ‘F’, ‘Female’ or ‘FEMALE’ then set the gender to be 1.
 * 	
 * 	  c. If the user enters an age less than 0 or greater than 100 then set the age 
 * 		member variable to -1 and print out an error message.

 * */

public class Lab2Test {
	
	//Main method
	public static void main(String[] args) {
		
		//New object of the StudentLab2 class - student1.
		StudentLab2 student1 = new StudentLab2();
		
		
		/**We could also call the setStAG method here
		 * but we can use setAge method to invoke it,
		 * setting newAge as the parameter, this reduce our
		 * code here and the need to enter 20 twice.*/
		
		//Setters attributes
		student1.setFName("John");
		student1.setLName("Doe");
		student1.setGender("m");
		student1.setAge(20);
		
		//Getters attributes & print statements.
		System.out.println("This is the students first name: " + student1.getFName());
		System.out.println("This is the students last name: " + student1.getLName());
		System.out.println("This is the students gender: " + student1.getGender());
		System.out.println("This is the students age: " + student1.getAge());
		System.out.println("This is the students age group: " + student1.getStAG());
		
		
		System.out.println("\n");
		
		
		//New object of the StudentLab2 class - student2
		StudentLab2 student2 = new StudentLab2();
		
		//Setters attributes
		student2.setFName("Jane");
		student2.setLName("Doe");
		student2.setGender("F");
		student2.setAge(26);
		
		//Getters attributes & print statements.
		System.out.println("This is the students first name: " + student2.getFName());
		System.out.println("This is the students last name: " + student2.getLName());
		System.out.println("This is the students gender: " + student2.getGender());
		System.out.println("This is the students age: " + student2.getAge());
		System.out.println("This is the students age group: " + student2.getStAG());
		
		/**We have shown here how to call them from the main test class,
		 * we could also do this through a display method which would reduce 
		 * the amount of code in the main test class.*/
		
	}//Main Method close

}//Class Close
