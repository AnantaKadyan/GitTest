import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Enter the name of Student:");
		student.firstName = scan.nextLine();
		student.lastName = scan.nextLine();



		System.out.println("Enter the address details: (Line1,Line2,City,State,PinCode)");
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();
		String city = scan.nextLine();
		String state = scan.nextLine();
		int pinCode = scan.nextInt();
		student.addr.setValueAddress(line1,line2,city,state,pinCode);



		System.out.println("Enter the DOB: (date,month,year)");
		int date,month,year;
		date = scan.nextInt();
		month = scan.nextInt();
		year = scan.nextInt();
		student.dob.setValueDate(date,month,year);



		System.out.println("Enter the number of skills the student possess");
		int skills1 = scan.nextInt();
		student.skills = new String [skills1];

		for (int i=0;i<skills1;i++)
		{
			System.out.println("Enter skill no. "+(i+1));
			scan.nextLine();
			student.skills[i]=scan.nextLine();
		}



		System.out.println("How many qualifications does the student have?");
		int qual = scan.nextInt();
		student.qual = new Qualification [qual];
		System.out.println("Enter the data for each Qualification:");
		for (int i=0; i<qual;i++)
		{
			System.out.println((i+1)+".");
			System.out.println("Name");
			scan.nextLine();
			String qualName = scan.nextLine();
			System.out.println("University");
			String university = scan.nextLine();
			System.out.println("Institute");
			String institute = scan.nextLine();
			System.out.println("CGPA");
			float cgpa = scan.nextFloat();
			student.qual[i] = new Qualification();
			student.qual[i].setQual(qualName,university,institute,cgpa);
		}



		System.out.println("How many projects has the student done?");
		int project1 = scan.nextInt();
		student.projects = new Project[project1];
		System.out.println("Enter the data for each project: Name, StartDate, EndDate, Role, Responsibilities");
		for (int i=0;i<project1;i++)
		{
			System.out.println((i+1)+".");
			String name = scan.nextLine();
			System.out.println("Started on");
			int day1 = scan.nextInt();
			int month1 = scan.nextInt();
			int year1 = scan.nextInt();
			System.out.println("Ended on");
			int day2 = scan.nextInt();
			int month2 = scan.nextInt();
			int year2 = scan.nextInt();
			String role = scan.nextLine();
			System.out.println("How many responsibilities were there during for this project?");
			int response1 = scan.nextInt();
			student.projects[i] = new Project();
			student.projects[i].responsibilities = new String[response1];

			for (int j=0;j<response1;j++)
			{
				System.out.println("Enter responsibility no. "+(j+1));
				student.projects[i].responsibilities[j] = scan.nextLine();
			}

			student.projects[i].setProject(name,role);
			student.projects[i].startDate = new Date();
			student.projects[i].setStartDate(day1,month1,year1);
			student.projects[i].endDate = new Date();
			student.projects[i].setEndDate(day2,month2,year2);
		}



		System.out.println("Enter student's email address");
		student.eMail = scan.nextLine();
		System.out.println("Enter student's contact number");
		student.contactNo = scan.nextLine();



		student.display();
	}
}