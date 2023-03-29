package Mulkerrins_Alex_3049679_Lab08_Eclipse;

//Alex Mulkerrins - 3049679

/**
 * Write a class called Lab8 that creates 5 customers. Store these customer objects 
 * in an ArrayList and then sort the list, using the Collections.sort method. (You will
 * need to import java.util.* for this.)
 * */


//Import libraries for the Collections.Sort and PrintWriter & FileWriter in try/catch block.
import java.util.*;
import java.io.*;

public class Lab8 {
	
	//Main method
	public static void main (String [] args) {
		
		/**Create a new ArrayList of generic type <Customer> named "al"
		 * 
		 * Create 5 customer objects as in the question with instances of age name and phone numbers as the parameters.
		 * name them c1, c2, c3, c4, c5.
		 * 
		 * Add them all to the ArrayList al.*/
		ArrayList<Customer> al = new ArrayList<Customer>();
		
		Customer c1 = new Customer(55, "Frank Sinatra", "087123467");
		Customer c2 = new Customer(40, "Nina Simone", "0877654321");
		Customer c3 = new Customer(25, "John Coltrane", "0834567890");
		Customer c4 = new Customer(66, "Miles Davis", "0861357911");
		Customer c5 = new Customer(37, "Dave Brubeck", "0832468102");
	
	
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		
		/**Collections.Sort will sort the ArrayList in ascending order in terms of age. 
		 * This is based on the selection statements CompareTo method in the Customer class. */
		Collections.sort(al);
		
		/**Use a try/catch block to catch any errors when trying to print the output to a .txt file.
		 * re-organise the code provided in the question to print the output to the .txt file*/
		try{
		
			//Create a printWriter object out and new file.
			PrintWriter out = null;
			//This is a platform dependent directory, where the FilerWriter will create a File to this specific directory on my laptop.
			out = new PrintWriter(new FileWriter("C:\\Users\\ajpma\\OODWorkSpace\\Mulkerrins_Alex_3049679_Lab08_Eclipse\\src\\Mulkerrins_Alex_3049679_Lab08_Eclipse\\OutFile.txt"));
			
			//Below I tried to make machine independent directory.
			//out = new PrintWriter(new File("C:\\OutFile\\OutFile.txt"));
			//out = new PrintWriter(new File("OutFile.txt"));
			
			
			//This for loop handles printing the ArrayList "al" to the "out" - the OutFile.txt File. 
			for (int i = 0; i < al.size();i++) {  
			out.println(al.get(i));
			}
			if (out != null) out.close();

		}
		
		//Print an error if the is an exception and the stackTrace of the error.
		catch (Exception e){
			System.out.println("There is an error in writing the file");
			e.printStackTrace();
		}
		
	      
		/**This is just to print the output to the console for reference.*/
		System.out.println("Success...");
		
		for (int i = 0; i < al.size();i++) {
	    	  
			System.out.println(al.get(i));
			}
	
	}
	

}
