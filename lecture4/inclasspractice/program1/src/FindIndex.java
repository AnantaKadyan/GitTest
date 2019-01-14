/* author : ananta
Version : 1.0.0
Purpose : to find a particular element in an array and display the elements of the array*/



import java.util.Scanner;
class FindIndex{
	public static void main(String[] args) {
		
		int selement;
		int flag= -1;
		int counter =0;
		Scanner scan = new Scanner(System.in);

		int elements[] = new int[10];

		 // the program asks the input from the user
		System.out.println(" Enter 10 elements of the array :");
		for( counter = 0 ; counter<10 ; counter ++)
		{
			elements[counter] = scan.nextInt();

		}

		// the program asks the user to enter the number to be searched
		System.out.println(" Enter the number to be searched :");
		selement = scan.nextInt();
         

         // display the elements in the array
		System.out.println(" the following elements were entered in the array :");
		for( counter = 0 ; counter<10 ; counter ++)
		{
			System.out.println(elements[counter]);
		}
          //the program searches for the element in the array
		for( counter = 0 ; counter<10 ; counter ++)
		{
			if(elements[counter] == selement)
			{
				flag=1;
				break;

			}
			else
			{
				flag=-1;

			}
		}
		if (flag == 1)
			System.out.println(" element "+elements[counter]+" found at position "+counter);
		else
			System.out.println(" element"+ elements[counter]+"not found "+flag);


	}
}