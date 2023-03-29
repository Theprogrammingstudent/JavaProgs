package Mulkerrins_Alex_3049679_PDS_WB07_Eclipse;

//Alex Mulkerrins-3049679-PDS-workbook07

public class TestMergeSort {

	public static void main (String [] args) {
		
		//Declare and initialise an array to be sorted 
		int [] list3 = {2,3,2,5,6,1,-2,3,14,12};
		int n1 = list3.length;
		
		int [] list4 = {8,3,4,5,22,-5,-2,7,1,18};
		int n2 = list4.length; 
		
		MergeSort merge1 = new MergeSort();
		//merge1.mergeSort(list3, 0, n2-1);
		merge1.PrintArray();
		
		MergeSort merge2 = new MergeSort();
		//merge2.mergeSort(list4, 0, n2-1);
		merge2.PrintArray();
		
	 
	}
}
