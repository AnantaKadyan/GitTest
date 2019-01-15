class Employee
{
	String name; // instance variables
	String address;
	int yearOfJoining;
	Employee()  // non parameterised constructor
	{
		name="";
		address="";
		yearOfJoining=2000;
	}
	void display()
	{
		System.out.println(this.name+"\t\t"+this.yearOfJoining+"\t\t"+this.address+"\n");
	}
}