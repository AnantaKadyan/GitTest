/*Author :Ananta
Version: 1.0.0
Purpose: get a 5 digit number input from the user and display all the 5 digits separately*/

import java.util.Scanner; // to get inputs from the user
 
public class SeparateDigits {
    public static void main (String [] args) {
    	char choice = 'y';
    	do{  // use of do while loop to keep the program to continue until the user wishes
         
        Scanner value = new Scanner (System.in);
         
        int number; //number entered by the user
        int digit1; //first digit of number
        int digit2; //second digit of number
        int digit3; //third digit of number
        int digit4; //fourth digit of number
        int digit5; //fifth digit of number
         
        System.out.println (); //displays a blank line
         
        System.out.print ("Enter An Integer Number Consisting of Five Digits : ");
        number = value.nextInt(); // to get the 5 digit number input from the user
         
        digit5 = number % 10;
        digit4 = (number % 100)/10;
        digit3 = (number % 1000)/100;
        digit2 = (number % 10000)/1000;
        digit1 = number / 10000;
        
         
        System.out.println( digit1 + "\t"+ digit2+"\t"+digit3+"\t"+digit4+"\t"+digit5);
        System.out.println("do you want to continue ?");
        choice = value.next().charAt(0); // to get a character input from the user
        } while(choice == 'y') ;		
    }
}
