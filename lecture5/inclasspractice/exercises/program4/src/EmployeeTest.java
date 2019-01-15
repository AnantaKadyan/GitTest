
import java.util.*;
class EmployeeTest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);  // scan object of the Scanner class
		System.out.println("Enter the number of employees:");
		int num=scan.nextInt();  // the number of employees are stored in num variable
		Employee employees[]=new Employee[num];  // an array of type Employee is declared and initialised
		int i;
		for (i=0;i<num;i++)  // for loop is used to run the input statements till the number of employees
		{
			employees[i] = new Employee();
			System.out.println("Enter the name of Employee:");
			employees[i].name = scan.nextLine(); 
			if (i==0) scan.nextLine(); // the entered name is stored in the array

			
			System.out.println("Enter the Year of Joining:");
			employees[i].yearOfJoining = scan.nextInt();      
			System.out.println("Enter the address of Employee:");
			employees[i].address = scan.nextLine();
			scan.nextLine();
		}
		System.out.println("Name\t\tYear\t\tAddress");
		for (i=0;i<num;i++)  // for the number of employees the output is displayed
		{
			employees[i].display();
		}
	}
}