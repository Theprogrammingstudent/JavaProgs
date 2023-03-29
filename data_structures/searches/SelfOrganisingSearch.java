package PDS_WorkBook_03;

//Alex Mulkerrins - 3049679

/**2.	SelfOrganisingSearch.java Let’s implement an example of Self Organising Search. 
 * Rewrite your search() method, but this time, each time an item is found, 
 * move it to the first position in the list (and move everything else back one space to make room). 
 * Test your search algorithm by printing the contents of the array every time you do a search to see 
 * how it changes. Your array should print horizontally like follows using a toString method which you 
 * will write.
 * A = 1 2 3 4 5		(rather than in vertically)
*/

import java.util.Arrays;

public class SelfOrganisingSearch {

	// Data Field
	// Private int array with 8 elements,starting index 0.
	private static int[] sOSArr = { 10, 20, 30, 40, 50, 60, 70, 80};
	int loc;

	// Constructors
	// Build a public constructor.
	public SelfOrganisingSearch() {

	}// LinearSearchConstructor.

	// Methods

	// toString method.
	/**
	 * The toString method (Overridden from the string class) will return "This is
	 * the array currently: " and concatenate Arrays.toString(sOSArr). This concatenated
	 * array toString is from the Array class to convert the array to a string.
	 */
	@Override
	public String toString() {

		return "This is the array currently: " + Arrays.toString(sOSArr);
	}// toString

	
	/**Self organising search method, sOSArr & valueToBeFound
	 * are the parameters passed into the method.
	 *  
	 * First set loc to 0. 
	 * Create while loop to traverse array as long as the element is not found.
	 * 
	 * Selection statements
	 * 'If' the element is not found, return -1.
	 * 'else if' the location is not 0, we reorganise the array.
	 * 
	 *  Set an int temp = sOSArr[loc], so we don't overwrite the element.
	 *  Then, create a for loop to traverse the array.
	 *  i = loc, as long as i is greater than 0, shift each element one space right.
	 *  Then, slot temp (originally sOSArr[loc]) into index 0.
	 *  return the loc to the the call in the main method.*/
	public int sOSearch(int[] sOSArr, int valueToBeFound) {
		System.out.println("We are now searching for the new valueToBeFound: " + valueToBeFound);
		System.out.println(toString());

		 loc = 0;

		while (loc < sOSArr.length && sOSArr[loc] != valueToBeFound) {
			loc = loc + 1;
		} // endWhile

		if (loc == sOSArr.length) {
			System.out.println("\nThe element was not found. \n");
			loc = -1;
			return loc;
		} // endIf

		else if (loc != 0) {

			System.out.println("\nThe element was found. We will now organise the array \n"
					+ "and move the element to index 0.\n");

			int temp = sOSArr[loc];

			for (int i = loc; i > 0; i--) {
				System.out.println(toString());
				sOSArr[i] = sOSArr[i - 1];
			} // endFor

			sOSArr[0] = temp;
		} // end ElseIf

		System.out.println(toString());
		return loc;
	}// search

	
	//Main method.
	/**sos is the object created of the SelfOrganisingSearch class.
	 * Create three print statements, invoking sos.sOSearch with a valueToBeFound.
	 * We can notice that in the second invocation 40 is at index 0 from the previous
	 * search and moved to index 1.
	 * The third invocation will return -1.*/
	public static void main(String[] args) {
		SelfOrganisingSearch sos = new SelfOrganisingSearch();

		System.out.println("\nThis is the index location of the value to be found,\n"
				+ "if -1 then not found: Index " + sos.sOSearch(sOSArr, 40) + ".\n\n\n");

		System.out.println("\nThis is the index location of the value to be found,\n"
				+ "if -1 then not found: Index " + sos.sOSearch(sOSArr, 60)+ ".\n\n\n");
		
		System.out.println("\nThis is the index location of the value to be found,\n"
				+ "if -1 then not found: Index " + sos.sOSearch(sOSArr, 100)+ ".");
		
	}

}// SelfOrganisingSearch Class close
