import java.util.*;
 class CircleTest1
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Circle c1 = new Circle();
		double area = c1.area();
		double cir = c1.circumference();

		c1.display(area,cir);
		
	}
}