package Mulkerrins_Alex_3049679_Lab07_Eclipse;

//Alex-Mulkerrins-3049679-OOD-Lab07-UML

/**The "Point" Class is a composition of the "Shape" class.
 * Points cannot exist without the shape class.
 * We instantiate the instance variable "protected Point centrePoint".
 * in the constructor and invoke the setters and getters.*/

public class Point{

	//Data Fields
	private int x;
	private int y;
	
	//constructor
	Point(){
		
	}
	
	//Methods
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	/**This is the Overridden equals method used to compare if two points are equal to each other.*/
	@Override 
	public boolean equals(Object p1){ 
 
		Point p = (Point)p1; 
		if(x == p.getX() && y == p.getY()) 
			return true; 
		else
			return false; 
	} 

	
	
}
