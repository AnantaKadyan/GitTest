/* Author: Ananta
Version : 1.0.0
Purpose: to get an input of number of rows from the user and print out the pascal's triangle*/

import java.util.Scanner; // to get input from the user

 class PascalTriangle
{
    public static void main(String args[])
	{ 
		char choice = 'y'; // value of variable choice is set to yes to repeat the experiment
	    do{
	
	    int row, num1, num3, number=1, num2;
		Scanner scan = new Scanner(System.in); // object input and scan are formed to take inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		row = scan.nextInt();
		
		for(num1=0;num1<row;num1++) // for loop is used to form the pascal's triangle
		{
			for(num3=row; num3>num1; num3--)
			{
				System.out.print(" ");
			}
            number = 1;
			for(num2=0;num2<=num1;num2++)
			{
				 System.out.print(number+ " "); // to print out the number in form of the triangle
                 number = number * (num1 - num2) / (num2 + 1);
			}
			System.out.println(); // next line blanck is printed 

		}	
			
			 System.out.println(" Do you want to continue ? ");
         choice = input.next().charAt(0); // to take in a character input
        } while(choice == 'y') ;		// while loop condition is y to get the program repeated
		}
	}
