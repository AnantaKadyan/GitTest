class Employee
{
	String name; // instance variables
	String address;
	long yearJoined;

	Employee( String name , String address , long yearJoined)
	{
		this.name = name;
		this.address = address;
		this.yearJoined = yearJoined;
	}
	
	void display() // instance method
	{
		System.out.println(name+"\t\t"+yearJoined+"\t\t"+address+"\n");
	}
}