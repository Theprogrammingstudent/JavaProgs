package Mulkerrins_Alex_3049679_Lab05_Eclipse;

//Alex Mulkerrins - 3049679

/** Lab05 Class
 *  Where the main method is located.
 *  
 *  Declare and initialse an Array List that will
 *  hold the objects that will be declared and initialised for this class.
 *  
 *  Objects is also the name of the array list.
 *  
 *  The objects at index 0 & index 2 are declaring Car objects.
 *  In the parameter the make and model are initialised with a string and the
 *  engine size is initialised with an int. 
 *  
 *  The same goes for the objects at index 1 & index 3, but they are declared
 *  as Employee objects.
 *  In the parameter the name is initialised with a string, the
 *  PPS Number with an int and annual salary as a double.
 *  
 *  
 *  Create a for loop.
 *  As i iterates through the objects array.
 *  
 *  'if' there is an "instanceof" Car, then the car class is called
 *  and printTax invokes all other methods in the class to determine the
 *  output to console.
 *  
 *  'if' there is an "instanceof" Employee, then the Employee class is called
 *  and printTax invokes all other methods in the class to determine the
 *  output to console.*/

public class Lab05 {

	public static void main(String[] args) {

		Object[] objects = { new Car("BMW", "3-series", 2998), new Employee("John Doe", 123456, 30000),
				new Car("VW", "Golf", 1984), new Employee("Jane Doe", 654321, 50000) };
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof Car)
				((Car) objects[i]).printTax();

			if (objects[i] instanceof Employee) {
				((Employee) objects[i]).printTax();
			}
		}
	}
}
