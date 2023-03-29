package Mulkerrins_Alex_3049679_Lab07_Eclipse;

//Alex-Mulkerrins-3049679-OOD-Lab07-UML

//This "Square" Class inherits the "Shape" class.
//This is an "is-a" relationship.
//A square is a shape.
public class Square extends Shape{

	//Data Fields
	/**These are two double variables to store the width and height of an object*/
	private double width;
	private double height;
	
	//Constructor
	/**In the constructor we invoke the set(newWidth) and set(newHeight) methods to initialise the class variables.*/
	Square(double newWidth, double newHeight){
		setWidth(newWidth);
		setHeight(newHeight);
	}
	
	
	//Methods
	/**Getters and Setters*/
	public double getWidth() {
		return width;
	}

	public void setWidth(double newWidth) {
		this.width = newWidth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
	
	/**Create a toString method to return the width and height of the square*/
	@Override
	public String toString() {
		String st = ("The square width is " + getWidth() + "The square height is: " + getHeight());
		return st;
	}
	
}
