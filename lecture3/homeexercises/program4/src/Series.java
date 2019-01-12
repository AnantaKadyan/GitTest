/* Author: Ananta
Version :1.0.0
Purpose : to find the sum of given series of numbers*/

import java.util.Scanner;
class Series { 
    public static void main(String[] args) 
{ 
    Scanner input = new Scanner(System.in); // input object of class Scanner to get user input
    int x ; // integer variable for the series 
    int num; 
    int num1;
    double total = 1.0 , multi; 

    System.out.println("Enter the value of x in the series 1+x+x2 /2!+x3/3!+ ");
     x = input.nextInt(); // input value of x is taken from the user
    System.out.println("Enter the number of terms of the series :");
    num = input.nextInt();
    multi = x;
    for (num1 = 1; num1 <= num; num1++)  // for loop is used to find the sum series
    { 
        total = total + multi / num1; 
        multi = multi * x; 
    }   
    System.out.println(" sum of series is : "+total);
} 
} 