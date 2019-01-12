/* Author : Ananta
version : 1.0.0
Purpose : to get the number of rows from the user and print out a character rhombus */

import java.util.Scanner; // to get input from the user we import the Scanner library

class CharRhombus {
	public static void main(String[] args) {
		 char choice = 'y'; // variable choice is given value y initially to keep the program repeating
		 do{

		 	Scanner scan = new Scanner(System.in); // scan is an object of class Scanner
		 	Scanner input = new Scanner(System.in);
        System.out.println("Input the number of rows: ");
        int row = scan.nextInt();
        int count = 1;
        int count2 = 1;
        char ch = 'A'; // ch variable is given value a to start with the rhombus with letter A

        for (int num1 = 1; num1 < (row * 2); num1++) // for loop to get the location of the letters
        {
            for (int space = row - count2; space > 0; space--)   // secondary loop to print out space
            
            {
                System.out.print(" ");
            }
            if (num1 < row)  // conditional statement used to check the rows are less than the num1
            {
                count2++;
            } 
            else 
            {
                count2--;
            }
            for (int num2 = 0; num2 < count; num2++) // for loop to print out the first characters
            {
                System.out.print(ch);//print Character specified
                if (num2 < count / 2)  // if is used to check whether the character needs to be increased by one or decreased
                {
                    ch++;
                } else 
                {
                    ch--;
                }
            }
            if (num1 < row)
            {
                count = count + 2;
            } 
            else
            {
                count = count - 2;
            }
            ch = 'A'; // the value of ch variable is set to A after completing every row

            System.out.println();
        }




          System.out.println(" Do you want to continue ? ");
         choice = input.next().charAt(0); // to take in a character input
        } while(choice == 'y') ;		// while loop condition is y to get the program repeated
		 
	}
}