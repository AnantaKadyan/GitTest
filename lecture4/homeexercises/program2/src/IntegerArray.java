/* Author : Ananta
Version : 1.0.0
Purpose : to get an input of an array with 5 elements and perform various functions on it*/

import java.util.*;
class IntegerArray{
	public static void main(String[] args) {
		
		int [] arr1 = new int[5];
		int counter =0;
		Scanner scan = new Scanner(System.in);  // scan object is created for class Scanner to get inputs from the user

		// the program asks for the user input
		System.out.println(" Enter an array  :");
		for (counter=0 ; counter<5 ; counter++)
		{
			arr1[counter] = scan.nextInt();
		}
		// the program displays the elements of the array
		System.out.println(" the elements of the array are : ");
		for(counter = 0; counter<5 ; counter++)
		{
			System.out.println(arr1[counter]);
		}
		//Program displays the sum of all the elements of the array
		int sum =0;
		 for( int num : arr1)
		  {
          sum = sum+num;
          }
      System.out.println("Sum of array elements is:"+sum);
      // program displays the largest number of the array
      int max;
         max = arr1[0];
        for(counter = 0; counter < 5; counter++)
        {
            if(max < arr1[counter])
            {
                max = arr1[counter];
            }
        }
        System.out.println("Maximum value in the array :"+max);
        //program gives the smallest number in an array
        int min;
         min = arr1[0];
        for(counter = 0; counter < 5; counter++)
        {
            if(min > arr1[counter])
            {
                min = arr1[counter];
            }
        }
        System.out.println("Minimum value in the array :"+min);
        // program gives the second largest value of the array
        int largest = arr1[0];
        int secondLargest= arr1[0];

        for (counter = 0; counter< arr1.length; counter++) {
 
			if (arr1[counter] > largest) {
				secondLargest = largest;
				largest = arr1[counter];
 
			} else if (arr1[counter] > secondLargest) {
				secondLargest = arr1[counter];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
		//program gives the sum of alternate numbers of an array
        int position = 1;
		for ( counter = (position-1); counter<arr1.length; counter+=2){
        sum = arr1[counter] + arr1[counter+1];
        System.out.println(" the sum of alternate numbers is :"+ sum);
        //program is used to find the occurrence of a element in the array
        int count =0 , x;
        System.out.print("Enter the element of which you want to count number of occurrences:");
        x = scan.nextInt();
        for(counter = 0; counter< 5; counter++)
        {
            if(arr1[counter] == x)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:"+count);

    }
}
}

















