import java.util.*;
 class EmployeeTest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in); // scan as an object of Scanner class
		Employee e1 = new Employee(); //e1 is an object of class Employee
		double ySalary = e1.yearlySalary(); // the value of yearlysalary is stored in ySalary for e1
		System.out.println("Yearly Salary (befor raise):"+ySalary);
		e1.display();  // method is called


		System.out.println("Enter the details of employee");
		String f = scan.nextLine();  // values are taken from the user for assigning it to constructor
		String l = scan.nextLine();
		double m = scan.nextDouble();
		Employee e2 = new Employee(f,l,m);  // the constructor gets called
		ySalary = e2.yearlySalary();
		System.out.println("Yearly Salary (befor raise):"+ySalary);
		e2.display();

		System.out.println(" Enter the Address of the employee in 3 lines :");
        String fl = scan.nextLine();
		String sl = scan.nextLine();
		int pc = scan.nextInt();
		Address a1 = new Address( fl , sl , pc);
		a1.displayAdd();


	}
}