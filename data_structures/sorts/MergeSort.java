package Mulkerrins_Alex_3049679_PDS_WB07_Eclipse;

//Alex Mulkerrins-3049679-PDS-workbook07

public class MergeSort {
	//Data fields
	int [] array;
	int l; //left index
	int r; //right index
	int mid; //middle of array
	
	
	//Constructor
	MergeSort(){
		
	}
	
	//Methods
		
	public int [] getArray(){
		return array;
	}
	
	public void setArray(int [] newArray){
		this.array = newArray;
	}
	
	public void merge(int [] newArray, int mid, int l,int r){
		
		int current1;
		int current2;
		int current3;
		
		/**Here we need to merge the split up arrays back into
		 * a single array.
		 * We do this by creating three variables that work in unison to place
		 * the new array back together in ascending order.*/
		
		
	}
	
	public void mergeSort(int [] newArray, int l, int r){
		if (newArray.length>1) {								//Base case to stop infinite recursion.
			int mid = l + (r-1)/2;
			
			//int firstHalf = ;
			
			//mergeSort(newArray, l, mid);					//Recursion of the method calling itself.
			//mergeSort(newArray, mid+1, r);
			
			//merge(newArray, mid, l, r);
			
		}
	}
	
	public void PrintArray(){
		
		for (int i = 0; i < getArray().length; i++) {
			  System.out.print(getArray()[i] + " ");
			}
	}
}
