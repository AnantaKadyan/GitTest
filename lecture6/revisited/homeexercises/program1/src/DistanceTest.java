import java.util.*;
class DistanceTest{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of feet1: ");
		float feet1 = scan.nextFloat();
		System.out.println("Enter the value of inch1: ");
		float inch1 = scan.nextFloat();
		System.out.println("Enter the value of feet2: ");
		float feet2 = scan.nextFloat();
		System.out.println("Enter the value of inch2: ");
		float inch2 = scan.nextFloat();
		
		Distance d1 = new Distance(feet1,inch1);
		Distance d2 = new Distance(feet2 , inch2);
		Distance d =new Distance();
        d.sum(d1,d2);
		
		// this method can also be used
	/*  d1.setDistance(feet1);
		d1.setDistance(inch1);
		d2.setDistance(feet2);
		d2.setDistance(inch2); 
		this is used after user inputs are taken*/
		 
		 

	}
}