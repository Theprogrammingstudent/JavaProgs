package Mulkerrins_Alex_3049679_Lab07_Eclipse;

//Alex-Mulkerrins-3049679-OOD-Lab07-UML
/**This "TextBox" class is a composition of SlideElement.
 * A "has-a" relationship is applied here to the class TextBox and the SlideElement class.
 * This means that the TextBox instance variable created in the SlideElement needs to be instaciated
 * in the TextBox Class.
 * 
 * We need to invoke the getters and setters to initialize the class variables.
 * 
 * We need to create a toString method to return the the variables of the class when called.*/
public class TextBox {

	//Data Field
	private String text;
	private int colour;
	
	//Constructor
	TextBox(String newText, int newColour){
		
	}
	
	//Methods
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getColour() {
		return colour;
	}
	public void setColour(int colour) {
		this.colour = colour;
	}
	
	
}
