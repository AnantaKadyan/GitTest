/* Author: ananta
version: 1.0.0
Purpose: to solve the quadratic equations */

import java.util.Scanner; // to take inputs from the user
class QuadEquation{

	public static void main(String[] args) {
		int a, b, c;
		double root1, root2, d;
        Scanner input = new Scanner(System.in); //defining input as an object of class Scanner
        System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.print("Enter a:");
        a = input.nextInt();
        System.out.print("Enter b:");
        b = input.nextInt();
        System.out.print("Enter c:");
        c = input.nextInt();
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        d = b * b - 4 * a * c;

        if( d> 0.0)
        {
        	root1 = (-b + Math.pow(d,0.5)) / (2.0 * a);
        	root2 = (-b + Math.pow(d,0.5)) / (2.0 * a);
        	System.out.println("the roots are " + root1 + "and " + root2);

         }
	    else if(d ==0.0)
	    {
		root1 = -b / (2.0 * a);
	    System.out.println(" the roots are equal and are " + root1);
         }
	    else
	    { 
	    	System.out.println("the roots are imaginary");
         }

        }

}