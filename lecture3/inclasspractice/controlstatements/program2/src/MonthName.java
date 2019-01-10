/* Author: ananta
Version: 1.0.0
Purpose : to convert the entered integer into months by the user*/

 import java.util.Scanner; // to take inputs from the user
  class MonthName{
  	public static void main(String[] args) {
  		char choice='y'; // we set the choice to ask as yes
  		int month;
  		do{
  			Scanner input = new Scanner(System.in); // defining input as an object of class scanner
  			System.out.println(" Enter any integer between 1 and 12 : ");
  			month = input.nextInt();

  			switch(month){
  	case 1:
        System.out.println ("The name of month number 1 is January");
        break;
    case 2:
        System.out.println ("The name of month number 2 is February");
        break;
    case 3:
        System.out.println ("The name of month number 3 is March");
        break;
    case 4:
        System.out.println ("The name of month number 4 is April");
        break;
    case 5:
        System.out.println ("The name of month number 5 is May");
        break;
    case 6:
        System.out.println ("The name of month number 6 is June");
        break;
    case 7:
        System.out.println ("The name of month number 7 is July");
        break;
    case 8:
        System.out.println ("The name of month number 8 is August");
        break;
    case 9:
        System.out.println ("The name of month number 9 is September");
        break;
    case 10:
        System.out.println ("The name of month number 10 is October");
        break;
    case 11:
        System.out.println ("The name of month number 11 is November");
        break;
    case 12:
        System.out.println ("The name of month number 12 is December");
        break;
    default:
            System.out.println ("You have entered an invalid number");
        }

        System.out.println(" Do you want to continue ? ");
         choice = input.next().charAt(0);
        } while(choice == 'y') ;		
    }

  		
  	}
  