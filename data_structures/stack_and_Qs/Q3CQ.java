package PDS_WorkBook_02;

/**Alex Mulkerrins - 3049679
 * 
 * 3.	CircularQueue.java Implement and test our Circular Queue approach, 
 * 		also discussed in the lecture notes. Create enqueue, dequeue, isEmpty, 
 * 		isFull methods, and test them in the main method
 * */

public class Q3CQ {
	// Data fields
	int head = 0;
	int tail = 0;
	int[] arrCQ = new int[6];
	int dEq;

	// constructor
	Q3CQ() {

	}

	// Methods
	
	//nEq stands for new enqueue.
	/**"enqueue" is where an element is added onto the queue. If the queue is full
	 * overflow is printed. else, tail index of arrCQ is set to nEq value. If tail
	 * reaches arrCQ length - 1, tail is reset to 0 otherwise it's tail + 1. Display
	 * at the end.*/
	public void enqueue(int nEq) {
		if (isFull()) {
			System.out.println("The Q is full, overflow.");
		} 
		else {
			arrCQ[tail] = nEq;
			if (tail == arrCQ.length - 1) {
				tail = 0;
			} else {
				tail = tail + 1;
			}
			displayCQ();
		}
	}

	//dEq stands for new dequeue.
	/**"dequeue" is where an element is taken off the CQ. If the Q is Empty underflow
	 * is printed. else, "head" index of arrCQ is placed in the dEq int variable and 
	 * arrCQ[head] is reset back to the null value 0 ready for the next value to be input.
	 * If the head value reaches index 5 (arrCQ length - 1) then it is reset to 0, otherwise 
	 * head + 1. Display to console and return dEq.*/
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Error underflow!");
			return 0;
		}
		else {
			dEq = arrCQ[head];
			
			arrCQ[head]= 0;
			
			
			
			if (head==arrCQ.length-1) {
				head = 0;
			}
			else {
				head = head + 1;
			}
			displayCQ();
			return dEq;
		}
	}

	/**If head variable is equal to tail  variable, then there are
	 * no elements in the queue. Otherwise it's false.*/
	public boolean isEmpty() {
		if (head == tail) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**If every index of the array had a value placed into it then head would be 
	 * at index 0 and tail would have traversed through each index and wrapped back 
	 * around to index 0 again. This would indicate an empty array/CQ as this is the condition 
	 * for isEmpty.
	 * 
	 * To remedy this, if the head marker is equal to tail + 1 it is considered to be a full array
	 * even though there is still an empty space.
	 * */
	public boolean isFull() {
		if (head == tail + 1 || head == 0 && tail == arrCQ.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	// Display Method used to display the stack array when requested.
	public void displayCQ() {

		System.out.print("[ ");

		for (int i = 0; i < arrCQ.length; i++) {
			System.out.print(arrCQ[i] + " ");
		}
		
		System.out.println("]");
	}
}
