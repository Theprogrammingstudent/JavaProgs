package Mulkerrins_Alex_3049679_Lab07_Eclipse;

//Alex-Mulkerrins-3049679-OOD-Lab07-UML

//This "Polygon" Class inherits the "Shape" class.
//Polygon extends shape.
//This is an "is-a" relationship.
//A polygon is a 2d shape.
import java.util.ArrayList;

//This "Polygon" Class inherits the "Shape" class.
//This is an "is-a" relationship.
//A polygon is a shape.
public class Polygon extends Shape{

	//Data Field
	//create a variable ArrayList of generic type <point> 
	private ArrayList<Point> points;
	
	//Constructors
	/**In the constructor we need to instantiate the arrayList of points for each points object.
	 * As Polygon extends shape we can use the super keyword to invoke the super class constructor.
	 * */
	
	Polygon(){
		
	}
	
	//Methods
	/**Create a toString method to return the points of the Polygon*/
	public String toString() {
		
		String st = "These are the points of the polygon" + points;
		
		return st;
	}
}
