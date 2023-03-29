package PDS_WorkBook_02;

public class Q2NaiveQueueTest {

	public static void main(String[] args) {

		//Create a new naive queue object pertaining to the Q2NQ class.
		Q2NQ newQ = new Q2NQ();
		
		//Print out the current size of the queue and print the queue.
		System.out.println("The current size of the Queue is " + newQ.arrNQSize());
		newQ.displayQ();
		
		//Let's see if the queue is empty using isEmpty.
		System.out.println("\nIs the Queue empty? " + newQ.isEmpty());
		System.out.println();
		
		
		//enqueue ints onto the Q until it is full & print to console.
		System.out.println("Now let's fill up the Q using enqueue method.");
		newQ.enQueue(10);
		newQ.enQueue(20);
		newQ.enQueue(30);
		newQ.enQueue(40);
		newQ.enQueue(50);

		//Show the arrNQ at max capacity.
		System.out.println("\nThis is the naive Queue at max capacity");
		newQ.displayQ();
		
		//Now let's test if the Queue is full using isFull method in the Q2NQ class.
		System.out.println("\nIs the queue full? " + newQ.isFull());
		
		//Let's dequeue a few elements to test how the queue moves along and progresses.
		System.out.println("\nNow let's dequeue a few elements to test how the queue moves along and progresses.");
		System.out.println("This is the current dequeued element: " + newQ.dequeue());
		
		/**dequeue again, enqueue 10 to the end of the queue and dequeue
		 * again, the resulting Naive queue array should be [ 40 50 10 0 0 ].
		 * */
		newQ.dequeue();
		System.out.println("This is adding another element to the end of the queue after a dequeue ");
		newQ.enQueue(10);
		System.out.println();
		newQ.dequeue();
		
		/**Testing the false boolean values of isFull and isEmpty*/
		System.out.println("\nIs the queue full? " + newQ.isFull());
		System.out.println("\nIs the Queue empty? " + newQ.isEmpty());
		
	}

}
