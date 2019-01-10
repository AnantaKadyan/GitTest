/* Author :Ananta
Version : 1.0.0
Purpose: to check that the numbers entered by the user are same upto 3 decimal points*/

import java.util.Scanner;  // to take inputs from the user
 class SameNumber {
 	public static void main(String[] args) {

 		  Scanner input = new Scanner(System.in); // defining input as an object of Scanner class

        System.out.print("Input floating-point number: ");
        double x = input.nextDouble(); // declaration and input of floating number stored in variable x
        System.out.print("Input floating-point another number: ");
        double y = input.nextDouble();  // declaration and input of floating number stored in variable y

        x = Math.round(x * 1000); // used to round of the floating numbers to accurate 3 places of decimal
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y) // if and else used to test conditional statements
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
 	
 	}
 }