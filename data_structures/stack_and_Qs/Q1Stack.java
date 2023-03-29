package PDS_WorkBook_02;

/**
 * Alex Mulkerrins - 3049679
 * 
 * 1. Stack.java Implement a Stack in Java. Use an array. Your stack should have
 * push, pop, isFull and isEmpty and top methods. You can choose what the
 * parameters & return type of these functions are. In your main method use each
 * of the methods, and test out your Stack. The Stack should be able to store
 * integers. N.B. What should the difference between pop and top be?
 * 
 * Note - The difference between pop and top is that pop removes the last element
 * 		  from the stack using LIFO, where as the top method merely returns the last 
 * 		  element to be viewed by the user.
 */

public class Q1Stack {

	// Data Fields
	int size = 0;
	int[] numArray = new int[5];
	int x;

	// Constructor
	
	//Build a default constructor.
	Q1Stack() {

	}

	// Methods
	
	//Size method - shows the size of the numArray at any given stage.
	public int arrSize() {
		return size;
	}

	
	/*	Push Method	- Used for adding elements to the stack, putting on the plates
	 * 				  using the cafeteria plate stacker analogy. If isFull it
	 * 				  will return overflow. 
	 */
	
	public void push(int x) {
		if (isFull()) {
			System.out.println("Overflow");
		} 
		
		else {
			System.out.println("Inserting " + x + " into the array.");
			numArray[size] = x;
			size++;
			printStack();
			System.out.println("\n");
		}
	}

	
	/* Pop Method 
	 * Used for removing the element that was added 
	 * last to the stack. If isEmpty it will return underflow.	
	 */
	public void pop() {
		
		if (isEmpty()) {
			System.out.println("underflow");
		}
		
		else {
			x = numArray[size-1];
			numArray[size-1]= 0 ;
			size--;
			
		}
	}

	/* isFull Method - tests to see if the stack is full i.e.
	 * has the "size" variable reached 5 (the give size of numArray.)
	 */
	
	public boolean isFull() {
		if (size == numArray.length) {
			return true;
		} 
		else {
			return false;
		}

	}

	/* isEmpty Method - tests the opposite, is numArray fully empty?
	 * Is "size" variable currently at 0.
	 */
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		else {
			return false;
		}

	}

	/* Top Method - as mentioned earlier the top method only returns
	 * 				the item last into the stack or the top element.
	 */
	
	public int top() {
		if (isEmpty()) {
			System.out.println("There are no elements on top, underflow");
			return 0;
		}
		else {
			return numArray[size-1];
		}
		
	}

	// Display Method used to display the stack array when requested.
	public void printStack() {
		System.out.print("[ ");

		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println("]");
	}
}
