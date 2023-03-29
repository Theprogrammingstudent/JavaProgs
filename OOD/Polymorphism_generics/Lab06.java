package Mulkerrins_Alex_3049679_Lab06_Eclipse;

//Alex Mulkerrins - 3049679

import java.util.ArrayList;

public class Lab06 {

	public static void main(String[] args) {

		/**
		 * This is the ArrayList created to hold Person objects.
		 * 
		 * We are holding two Person objects and using polymorphism to hold two Employee
		 * objects in the ArrayList.
		 * 
		 * After these four object are created,
		 * we then invoke the printArrayList(al) as in Q5 part(d).
		 * 
		 * After this we follow q5 part (e), we create two Employees with the same
		 * PPS Number and slightly different names - Al & Alan.
		 * 
		 * These two employees are then compared using the '==' operator i.e. Comparing if the
		 * two objects have the same references. 
		 * 
		 * This shows false even though both of their PPS Numbers are the same.
		 * This is because they are not primitive types, they are objects.
		 * 
		 * So once more we compare them but this time using the overriden 'Equals' method.
		 * This time it returns true athe equals method compares them as objects.
		 * 		 */
		ArrayList<Person> al = new ArrayList<Person>();

		Person per1 = new Person("John Doe", 123456789);
		al.add(per1);

		Person per2 = new Person("Jane Doe", 987654321);
		al.add(per2);

		Person emp1 = new Employee("Jimmy Doe", 567891234, "11111G");
		al.add(emp1);

		Person emp2 = new Employee("Jess Doe", 123456789, "22222G");
		al.add(emp2);

		printArrayList(al);
		
		Person emp3 = new Employee("Al", 123456789, "33333G");
		al.add(emp3);

		Person emp4 = new Employee("Alan", 123456789, "33333G");
		al.add(emp4);
		
		System.out.println("Here we are using the '==' operator on emp3 & emp4, it shows false: " + (emp3 == emp4));
		System.out.println("Here we are invoking the overriden 'equals' methodon emp3 & emp4, it shows true: " + (emp3.equals(emp4)));

	}

	// Now we need to print this ArrayList.
	
	/**This is the generic method called printArrayList which takes a generic ArrayList as a parameter as in the question.
	 * This method will loop through the ArrayList and print it out using a for:each Loop and the print a space.*/

	public static void printArrayList(ArrayList<Person> al) {
		for (Person person : al) {
			System.out.println(person.toString()); // calls the 'toString' method on each Book object
			System.out.println("");
		}//forEnd

	}//printArrayListEnd

}//classEnd
