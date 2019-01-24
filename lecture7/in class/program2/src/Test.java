import java.util.*;
public class Test{
 public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);
	int choice;
	System.out.println(" input 2 for bike , 4 for car ");
	choice = input.nextInt();

	switch(choice)
	{
		case 2:
		 Bike b = new Bike();
		b.display();
		break;

		case 4 : 
		 //Vehicle c = new Car();   the reference variable c is an object of type Vehicle but it is refering to Car type and so car will be operated
		Car c = new Car();
		c.display();
		break;

		default:
		Vehicle v = new Vehicle();
		v.display();
	}
  }
}