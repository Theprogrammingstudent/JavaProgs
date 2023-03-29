package PDS_WorkBook_02;

public class Q3CircularQueueTest {

	public static void main(String[] args) {
		
		/**Let's create a new object pertaining to our class Q3CQ,
		 * it will be a circular queue.
		 * */
		Q3CQ newCQ = new Q3CQ ();
		
		/* Next we can test if this class is empty using isEmpty method**/
		System.out.println("Is the Circular queue empty at present? " + newCQ.isEmpty());		
		newCQ.displayCQ();
		System.out.println();
		
		/**Now let's enqueue some numbers into the circular queue*/
		System.out.println("\"enqueue\" some numbers into the circular queue: ");
		newCQ.enqueue(10);
		newCQ.enqueue(20);
		newCQ.enqueue(30);
		newCQ.enqueue(40);
		newCQ.enqueue(50);
		
		/**At this point our circular queue is considered full even though there is a space left
		 * we completely filled the array with six elements then the head would = the tail value 
		 * this would clash with our isEmpty boolean so in this scenario when the sixth element is
		 * free it is considered that the array or circular queue is full*/
		newCQ.displayCQ();
		
		/**Let's test isFull to see if our circular queue is full.*/
		System.out.println("\nIs the circular queue full? " + newCQ.isFull() + "\n");
		
		/**Let's try and dequeue some of the elements in the circular queue,
		 * this will return the element at the head position.
		 */
		System.out.println("\"dequeue\" some numbers off the circular queue: ");
		System.out.println("This is the element at the \"head\" position " + newCQ.dequeue() + "\n");
		System.out.println("This is the element at the \"head\" position " + newCQ.dequeue() + "\n");
		System.out.println("This is the element at the \"head\" position " + newCQ.dequeue() + "\n");
		
		/**Here I have added a few more enqueue elements in order to the "wrap around" funtion
		 * of the circular queue, we can see when tail reaches index 5 the tail returns to index 0.
		 * If the head were to follow suit it would also wrap around.*/
		newCQ.enqueue(10);
		newCQ.enqueue(20);
		newCQ.enqueue(30);
		
		
		/**Display it to see where we're at, it should be [20 30 0 40 50 10]*/
		System.out.println("\nThe array at present: ");
		newCQ.displayCQ();
		
		
		
		
		
	}

}
