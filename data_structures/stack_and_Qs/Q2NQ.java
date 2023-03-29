package PDS_WorkBook_02;

/*		Alex Mulkerrins - 3049679
 * 
 * 2.	NaiveQueue.java Implement and test our naïve Queue approach, as discussed in the lecture notes.
 * 		Create enqueue, dequeue, isEmpty, isFull methods, and test them in the main method.
 */

public class Q2NQ {

	// Data fields
	/**The tail should start at 0, arrNQ is the Naive queue array, 
	 * temp is to hold the current element in the dequeue method 
	 * and i stands for our incrementor*/
	
	int tail = 0;
	int[] arrNQ = new int[5];
	int temp;
	int i;

	// Constructors
	Q2NQ() {
		
	}
	
	// Methods
	//Size method - shows the size of the arrNQ at any given stage.
		public int arrNQSize() {
			return tail;
		}
	
		/**isEmpty is a boolean method to test if the queue is empty, 
		 * "tail" is set to be our back marker, so if tail is 0 there won't be any element in the
		 * queue, if there is an element it should return false. */
	public boolean isEmpty() {
		if (tail == 0) {
			return true;
		} 
		else {
			return false;
		}
	}

	/**isFull is the opposite to isEmpty, it will test if the queue has reached the array
	 * limit (in this case 5), "tail" will be the indicator, 
	 * so if tail reaches the length of the array it will return as a true statement, 
	 * else it will be false.*/
	public boolean isFull() {
		if (tail == arrNQ.length) {
			return true;
		} 
		else {
			return false;
		}
	}

	/**Here is the enqueue method. It adds new ints to the end of the queue,
	 * if the Q is full "overflow" is printed, else, x (the new enqueue int)
	 * is inserted to the tail index of arrNQ, and tail is incremented. I invoked 
	 * displayQ at the end of this method to show what happens when an element is added.*/
	public void enQueue(int x) {
		if (isFull()) {
			System.out.println("overflow");
		} 
		else {
			arrNQ[tail] = x;
			tail = tail + 1;
			displayQ();
		}
	}

	/**Here is the dequeue method, opposite to enqueue, it
	 * will "dequeue" the element that was first into the Q.
	 * "If" isEmpty is true print "underflow" and do nothing, "else"
	 * store index 0 of arrNQ as a temp value, next increment through
	 * the array to bring arrNQ[i] as arr[i + 1] effectively moving down
	 * each element to the next index.
	 * 
	 * Set index of tail - 1 to be null/0 and adjust tail to be the 
	 * previous index of tail - 1. Invoke displayQ to show what happened 
	 * and return temp.
	 * */
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("underflow");
			return 0;
		} 
		else {
			temp = arrNQ[0];
			
			for (i = 0; i <= tail - 2; i++) {
				arrNQ[i] = arrNQ[i + 1];	
			}
			
			arrNQ[tail - 1] = 0;
			tail = tail-1;
			System.out.println("This is the new dequeue Q");
			displayQ();
			System.out.println();
			return temp;
		}
		
	}

	// Display Method used to display the stack array when requested.
	public void displayQ() {

		System.out.print("[ ");

		for (int i = 0; i < arrNQ.length; i++) {
			System.out.print(arrNQ[i] + " ");
		}
		System.out.println("]");
	}
}
