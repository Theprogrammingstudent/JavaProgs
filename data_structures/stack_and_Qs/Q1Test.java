package PDS_WorkBook_02;

public class Q1Test {

	public static void main(String[] args) {

		// Create a new stack object from the stack class.
		Q1Stack newObject = new Q1Stack();

		/**
		 * Print out the current size of the stack, the top element and show the empty stack for
		 * reference.
		 */
		System.out.println("This is the current size of the stack: " + newObject.arrSize());
		System.out.println("The top element is " + newObject.top());
		newObject.printStack();
		
		
		/** Test isEmpty method, should return true. */
		System.out.println("Is the stack empty? " + newObject.isEmpty());
		System.out.println("\n");

		/** "push" 5 new elements onto the stack, filling the stack to be full,
		 *  testing isEmpty and isFull in between and testing the top method to
		 *  show it work correctly. */
		newObject.push(10);
		
		/** Test isEmpty method again , this time should return false, 
		 *  also test top, should be 10. */
		System.out.println("Is the stack empty? " + newObject.isEmpty());
		System.out.println("The top element is " + newObject.top());
		System.out.println("\n");
		
		newObject.push(20);
		newObject.push(30);
		newObject.push(40);
		
		/** Test isFull method, should return false, 
		 *  also test top, should be 40. */
		System.out.println("\nIs the stack Full? " + newObject.isFull());
		System.out.println("The top element is " + newObject.top());
		System.out.println("\n");
		
		newObject.push(50);

		// Showing the full stack.
		System.out.println("This is the Stack full.");
		newObject.printStack();

		/** Test isFull method again, should return true. */
		System.out.println("Is the stack Full? " + newObject.isFull());
		System.out.println("\n");

		/**
		 * Test a couple of pop methods, removing some elements from the stack, print
		 * the stack to show what it looks like at this stage.
		 */
		newObject.pop();
		newObject.pop();
		newObject.pop();
		newObject.printStack();

		/** Show the stack size now */
		System.out.println("This is the current size of the stack: " + newObject.arrSize());
	}
}
