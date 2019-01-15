/* Author: ananta
Version: 1.0.0
Purpose: to create a class stack that maintains a stack of integers */

import java.util.*;
class StackTest{
	public static void main(String[] args) {
		int option;
		Scanner input = new Scanner(System.in);
		Stack st = new Stack(); // an object of the type stacktest is created

		st.push();  // we call the method to insert elements
        st.pop(); // we call the method to delete elements
		System.out.println(" Menu :");
		System.out.println("  1 for checking whether empty \n 2 for checking whether full \n 3 for checking for any emptyspace  ");
        
        option = input.nextInt(); // we store the user input in the variable option
        switch(option)
        {
        	 
        	
        	case 1: st.isEmpty(); 
        	
        	case 2: st.isFull();
        	
        	case 3 : st.spaceLeft();
        	
        	default: System.out.println("invalid input");
        }
	}
}