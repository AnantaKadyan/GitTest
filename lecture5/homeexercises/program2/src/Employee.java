class Employee
{
	String fName; // instance variables defined
	String lName;
	double monthlySalary;
	Employee() // non parameterised constructor
	{
		fName="Sameer";
		lName="Singh";
		monthlySalary=60;
	}
	Employee(String f, String l, double m) // parameterised constructor formed
	{
		fName=f;
		lName=l;
		monthlySalary=m;
	}
	double yearlySalary() // instance method 
	{
		return (12*monthlySalary);
	}
	double raise()
	{
		return (1.10*yearlySalary());
	}
	void display()
	{
		System.out.println("Employee details:\n"+fName+" "+lName+"\nYearly Salary (after raise):"+raise());
	}
}

class Address{

	String firstline;
	String secondline;
	long pincode;

	Address( String fl , String sl , int pc){
		firstline = fl;
		secondline = sl;
		pincode = pc;
	}

	void displayAdd(){
		System.out.println(" Employee Address is : "+ firstline + "\n"+secondline+"\n"+pincode);
	}

}

