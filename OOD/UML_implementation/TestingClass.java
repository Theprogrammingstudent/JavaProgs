package Mulkerrins_Alex_3049679_Lab07_Eclipse;

//Alex-Mulkerrins-3049679-OOD-Lab07-UML


import java.util.ArrayList;

public class TestingClass {

	public static void main(String[] args) {
		
		/**First we need to make an array list of our shapes*/
		

		Shape circle1 = new Circle(2.0);
		//Shape sqaure1 = new Square(2.0, 2.0);
		//Shape polygon1 = new Polygon();
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(circle1);
		//Presentation presentation1 = new Presentation(shapes);
		System.out.println(circle1.toString());
		
		
		
	}

}
