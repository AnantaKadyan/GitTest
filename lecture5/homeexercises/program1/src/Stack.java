/* Author: ananta
Version: 1.0.0
Purpose: to create a class stack that maintains a stack of integers */
import java.util.*;
class Stack{

	int[] arr= new int[10]; // declaration and initialisation of an array
	int i; // instance variable
	Scanner scan = new Scanner(System.in);
    
	void push(){  // method to insert the elements in the array
		System.out.println("Enter an array of 10 digits :");
		for ( i=0 ;i<10 ;i++)
		{
			arr[i] = scan.nextInt();
		}

	}

	void pop(){  // instance method to delete element from the array
		System.out.println("Enter the element you want to delete:");
       int  del = scan.nextInt();
        for ( i = 0; i < 10; i++) 
        {
            if(arr[i] == del)
            {
               
        for( i = i+1; i < 10; i++)
            {
                arr[i-1] = arr[i];
            }
            System.out.println("After Deleting:");
            for ( i = 0; i < 8; i++) 
            {
                System.out.println(arr[i]+",");
            }
        }
	}
}

    void isEmpty(){  // instance method to find whether the array is empty or not
    	if ( arr.length > 0)
    		System.out.println("the array is not empty ");
        else
    			System.out.println(" the array is empty");
    	}

    
    void isFull(){ // istance method to determine whether the array is full or not
    	if( arr.length == 10)
    		System.out.println(" The array is full");
    	else
    		System.out.println("The array is not full");
     }
    
    void spaceLeft(){ // instance method to find whether any empty spaces are present or not
    	
    		if( arr.length < 10)
    			System.out.println("The array still has some space left");
    		else
    			System.out.println("The array is full without any spaces left");
    	
    }
	

}