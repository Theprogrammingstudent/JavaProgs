package Mulkerrins_Alex_3049679_Lab07_Eclipse;

//Alex-Mulkerrins-3049679-OOD-Lab07-UML

//This "Circle" Class inherits the "Shape" class.
//Circle extends shape.
//This is an "is-a" relationship.
//A circle is a shape.
public class Circle extends Shape{
	
	//Data field
	/**Create a private double radius to store the radius of a circle object*/
	private double radius;
	
	//Constructor
	/**In the constructor we need to pass a newRadius into the parameter of the constructor
	 * we then invoke the setRadius method passing in newRadius.*/
	Circle (double newRadius){
		setRadius(newRadius);
	}
	
	//methods
	/**These are the getters and setters to set the newRadius to the this.radius in the circle class*/
	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	
	/**Create a toString method to return the radius of the circle*/
	@Override
	public String toString() {
		String st = ("The circle radius is " + getRadius());
		return st;
	}
}
