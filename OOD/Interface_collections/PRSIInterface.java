package Mulkerrins_Alex_3049679_Lab05_Eclipse;

//Alex Mulkerrins - 3049679

/** This is my PRSI interface, it declares one abstract
 *  method and a static variable rate as shown in the question. 
 *  We will implement these interface abstract method and variable in the Employee class.
 *  "Interface" keyword declares that it is an interface, "abstract" is the keyword 
 *  to declare an abstract method in the interface.*/

public interface PRSIInterface {
static final double rate = 0.04; // 4%
public abstract double calculatePRSI();
}
