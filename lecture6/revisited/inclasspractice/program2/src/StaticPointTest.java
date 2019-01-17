
import java.util.*;
class StaticPointTest
{
	public static void main (String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x1: ");
		float x1 = scan.nextFloat();
		System.out.println("Enter the value of y1: ");
		float y1 = scan.nextFloat();
		System.out.println("Enter the value of x2: ");
		float x2 = scan.nextFloat();
		System.out.println("Enter the value of y2: ");
		float y2 = scan.nextFloat();
		StaticPoint p1 = new StaticPoint();
		StaticPoint p2 = new StaticPoint();
		p1.setValueX(x1);
		p1.setValueY(y1);
		p2.setValueX(x2);
		p2.setValueY(y1);
		float dist = p1.calcDistance(p2);
		System.out.println("The distance between the two points is: "+String.format("%7.2f",dist));
	}
}