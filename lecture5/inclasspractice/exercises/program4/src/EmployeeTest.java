
import java.util.*;
class EmployeeTest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);  // scan object of the Scanner class
		System.out.println("Enter the number of employees:");
		int num=scan.nextInt();  // the number of employees are stored in num variable
		scan.nextLine();
		Employee emp[]=new Employee[num];  // an array of type Employee is declared and initialised
		int i;

		for (i=0;i<num;i++)  // for loop is used to run the input statements till the number of employees
		{
			
			System.out.println("Enter the name of Employee:");
			String name = scan.nextLine();
			
            
			System.out.println("Enter the Year of Joining:");
			long yearJoined= scan.nextLong();      
			
			System.out.println("Enter the address of Employee:");
			scan.nextLine();
			String address = scan.nextLine();
			
		
			emp[i] = new Employee( name , address , yearJoined);
		
		System.out.println("Name\t\tYear\t\tAddress");
		 // for the number of employees the output is displayed
		
			emp[i].display();
		}
	}
}