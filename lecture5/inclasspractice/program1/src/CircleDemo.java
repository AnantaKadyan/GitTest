/* Author : Ananta
Version : 1.0.0
Purpose : to create another class used to print the dimensions and volume of the circle*/
import java.util.*;
class CircleDemo{
	public static void main(String[] args) {
		Circle c = new Circle(); // an object of type circle is created
		c.radius = 2; // we assign the value of radius
		c.displayArea(); // we call the method to display area

		Circle c1 = new Circle();
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the value of radius :");
		c1.radius = scan.nextDouble();
		c1.displayArea();

		
	}
	 
}