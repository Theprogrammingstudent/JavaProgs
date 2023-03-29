package PDS_WorkBook_03;

//Alex Mulkerrins - 3049679
/**3.	Binarysearch.java In Part3.java, change your earlier search approaches
 *		to build binarysearch(). Make a new file Your binarysearch() method should 
 *		implement the algorithm for Binary Search discussed in the lecture notes. 
 *		Note; make sure that the data is sorted beforehand! 
 *		You can either use one of the previous sorting techniques or you can generate 
 *		a sorted array to begin with.*/

import java.util.Arrays;

public class BinarySearch {

	// Data Field
	// Private int array with 8 elements,starting index 0.
	private static int[] bSArr = { 1, 4, 26, 45, 5, 16, 87, 18 };

	// Constructors
	// Build a public constructor.
	public BinarySearch() {

	}// LinearSearchConstructor.
	
	
	//Methods
	/**Sort Array
	 * Sort the array into ascending order by calling the sort function from
	 * the arrays class. This is necessary for binary search.*/
	public void sortArray() {
		System.out.println(toString());
		System.out.println("The array will now be sorted.");
		Arrays.sort(bSArr);
		System.out.println(toString() + "\n\n");
	}
	

	// toString method.
	/**
	 * The toString method (Overridden from the string class) will return the string "This is
	 * the array currently: " and concatenate Arrays.toString(bSArr). 
	 * This concatenated array toString is from the Array class to convert 
	 * the array to a string.
	 */
	public String toString() {

		return "This is the array currently: " + Arrays.toString(bSArr);
	}// toString

	/**Declare and initialise int variables, start, end, mid and loc.
	 * 
	 * Binary Search method. bSArr & valueToBeFound are passed in as parameters when
	 * invoked.
	 * Next, create a while loop, with conditions: start <= end && mid index of 
	 * bSArr is not valueToBeFound.
	 * Next, Selection Statement.
	 * if valueToBeFound is less than bSArr[mid] then end = mid - 1.
	 * Otherwise the valueToBeFound is in the upper half of the array
	 * so start = mid + 1.
	 * 
	 * If, bSArr[mid] == valueToBeFound then set the variable loc equal to mid.
	 * Otherwise loc is equal to -1.
	 * Return -1.
	 */
	public int bSearch(int[] bSArr, int valueToBeFound) {

		int start = 0;
		int end = (bSArr.length - 1);
		int mid = (start + end) / 2;
		int loc;
		
		System.out.println("We are now searching for the new valueToBeFound: " + valueToBeFound);

		while (start <= end && bSArr[mid] != valueToBeFound) {
			if (valueToBeFound < bSArr[mid]) {
				end = mid - 1;
			} 
			else {
				start = mid + 1;
			} // endIf
			mid = (start + end) / 2;
		} // endWhile

		
		if (bSArr[mid] == valueToBeFound) {
			loc = mid;
		}

		else {
			loc = -1;
		}

		return loc;
	}// search

	
	//Main method.
	/**bs is the object created of the BinarySearch class.
	 * 
	 * Invoke sortArray() to sort the bSArr array.
	 * 
	 * Create three print statements, invoking bs.sOSearch with a valueToBeFound.
	 */
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		
		
		bs.sortArray();

		System.out.println("The integer key is at the following index, "
				+ "if -1 then not found: Index " + bs.bSearch(bSArr, 45) + "\n\n");
		
		System.out.println("The integer key is at the following index, "
				+ "if -1 then not found: Index " + bs.bSearch(bSArr, 16) + "\n\n");
		
		System.out.println("The integer key is at the following index, "
				+ "if -1 then not found: Index " + bs.bSearch(bSArr, 100));

	}

}// BinarySearch Class close
