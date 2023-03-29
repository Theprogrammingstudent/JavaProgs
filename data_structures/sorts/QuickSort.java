package Mulkerrins_Alex_3049679_PDS_WB07_Eclipse;

//Alex Mulkerrins-3049679-PDS-workbook07

public class QuickSort {

	//Data Fields
	//int[] theArray;
	int start;
	int end;
	int pivot;
	int pivotValue;
	int i;
	int j;
	
	
//	Constructor
	QuickSort(){
		
	}
	
	
//	Methods
	
	//Establish 
	
	public void quickSort(int [] list, int start, int end) {
		if (start < end) {										
			
			pivot = partition(list, start, end);				//Invoke partition. This is the Base case, to stop infinite recursion.
			
			//Sort each partition recursively
			quickSort(list, start, pivot-1);					//Recursive part
			quickSort(list, pivot+1, end);
			
		}//endif
		
		
	}//end quickSort
	
	public int partition(int [] theArray, int start,int end) {
		pivotValue = theArray[start];
		
		i= start;
		j = end;
		
		while (true) {
			
			while (theArray[j] > pivotValue) {
				j--;
			}//end while
			
			while (theArray[i] < pivotValue) {
				i++;
			}//end while
			
			if (i < j) {
				swapValues(theArray,theArray[i],theArray[j]);
			}//end if
			
			else {
				return j;
			}//end else
			
		}//end while true
	}
	
	/**
	 * If there is an instance where two values need to be swapped, swapValues is
	 * invoked. 
	 * Declare int 'temp' and set it to the value theArray[a] 
	 * so the element is not overriden. 
	 * Set theArray[a] = theArray[b].
	 * Finally, set theArray[b] = temp.
	 */
	public void swapValues(int [] theArray, int i, int j) {
		int temp = theArray[i];
		theArray[i] = theArray[j];
		theArray[j] = temp;
		
	}
	
	//A method to print the array.
	public void PrintArray(int [] printArray){
		
		for (int i = 0; i < printArray.length; i++) {
			  System.out.print(printArray[i] + " ");
			}
	}
}
