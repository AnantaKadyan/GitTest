/* Author: Ananta
version :1.0.0
Purpose: to get a character input from the user and tell whether the entered character is a vowel or a consonant*/

import java.util.Scanner;
class VowelChar
{
	public static void main(String[] args)
	{  char ch;

	Scanner ch1 = new Scanner(System.in);
	System.out.println("Enter a character : ");
	 ch=ch1.next( ).charAt(0);	 		
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
	System.out.println("Entered character "+ch+" is  Vowel"); 
	}
	else if(ch>='a'&&ch<='z')
		System.out.println("Entered character "+ch+" is Consonant");
	      else
		System.out.println("Not an alphabet");		
	}
}