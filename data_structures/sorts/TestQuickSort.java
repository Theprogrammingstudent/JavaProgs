package Mulkerrins_Alex_3049679_PDS_WB07_Eclipse;

//Alex Mulkerrins-3049679-PDS-workbook07


//This program compiles but runs an error.
public class TestQuickSort {

	public static void main(String [] args) {

		//Test the list below clearly showing the output before and after the sort. Name the array list2 {8,3,4,5,22,-5,-2,7,1,18} 

		//Declare and initialise the list 1 & list 2 arrays.
		//Set the length for each array the declares the length of the Array.
		int [] list1 = {2,3,2,5,6,1,-2,3,14,12};
		int length1 = list1.length;
		
		int [] list2 = {8,3,4,5,22,-5,-2,7,1,18};
		int length2 = list2.length-1;
		
		//Create a quick sort object.
		QuickSort quick1 = new QuickSort();		
		
		//Print the array unsorted
		System.out.println("The first quicksort array unsorted is: ");
		quick1.PrintArray(list1);
		
		//Sort the Array and print the sorted array.
		System.out.println("\nThe first quicksort array sorted is: ");
		quick1.quickSort(list1, 0, length1-1);
		quick1.PrintArray(list1);
		
		
		//Repeat the same for list same for list 2.
		QuickSort quick2 = new QuickSort();
		System.out.println("The first quicksort array unsorted is: ");
		quick2.PrintArray(list2);
		
		System.out.println("\nThe first quicksort array sorted is: ");
		quick2.quickSort(list2, 0, length2-1);
		quick2.PrintArray(list2);
				
		
	}
	
}
