package PDS_WorkBook_03;

//Alex Mulkerrins - 3049679
/** 1.	LinearSearch.java Create a class meeting the following specification
  * A public class with the same name as the java file. 
  *	An private integer array as member data
  * A public constructor with the same name as the java class. 
  *	A public method called toString which when called will create a string showing the private member data of the class.
  *	A public method called search with accepts a variable valueToBeFound as a parameter. It will search the integer array for the value and return either the location if it finds it or -1 if it does not. You may like to call the toString method to show how the private member data of the class is being updated.  
  * A public main method which 
  *	i. Creates an object of the class 
  * ii.	Calls the methods of the class on this object i.e. searches for a specified value in the array 
  * iii.	Prints out the changes made to the objects 
  *	Do part i and ii a few times.
  */

import java.util.Arrays;

public class LinearSearch {
	
	//Data Field
	//Private int array with 8 elements,starting index 0.
	private static int[] lSArr = { 10, 20, 30, 40, 50, 60, 70, 80};

	//Constructors
	//Build a public constructor.
	public LinearSearch() {

	}// LinearSearchConstructor.

	//Methods
	
	// toString method.
	/**The toString method (Overridden from the string class) will return 
	 * "This is the array currently " and concatenate Arrays.toString(lSArr). 
	 * This concatenated array toString is from the Array class to convert 
	 * the array to a string.
	 */
	
	@Override
	public String toString() {

		return "This is the array currently " + Arrays.toString(lSArr);
	}// toString

	
	/** LinearSearch method, lSArr array and valueToBeFound are the parameters
	  * to be passed into the method when invoked.
	  * The for loop will traverse through the array comparing each index
	  * to the value to be found, if there is a hit then the method will return
	  * index i to the main method where it was called, if it is not found 
	  * then -1 is returned.
	  */
	  
	public int search(int[] lSArr, int valueToBeFound) {

		for (int i = 0; i < lSArr.length; i++) {
			if (valueToBeFound == lSArr[i])
				return i;
		}
		return -1;
	}// search

	// Main method

	/**
	 * ls is my object of the LinearSearch class.
	 * 
	 * Print statements calling LinearSearch class methods
	 * will then print out the index returned or -1 if not found.
	 * 
	 * I called toString method only at the start and end as the 
	 * the array does not change in the meantime while being searched.
	 */
	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		
		System.out.println(ls.toString() + "\n");
		
		System.out.println(
				"The integer key is at the following index, if -1 then not found: index " + ls.search(lSArr, 30)+ "\n");

		System.out.println(
				"The integer key is at the following index, if -1 then not found: index " + ls.search(lSArr, 80)+ "\n");
		
		System.out.println(
				"The integer key is at the following index, if -1 then not found: index " + ls.search(lSArr, 100)+ "\n");
		
		System.out.println(
				"The integer key is at the following index, if -1 then not found: index " + ls.search(lSArr, 50)+ "\n");

		System.out.println(ls.toString());

	}

}// LinearSearch Class close
