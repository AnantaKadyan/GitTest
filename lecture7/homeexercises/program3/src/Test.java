import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Shape s = new Shape();
		Rectangle r = new Rectangle(1.0 ,1.0);
		Square sq = new Square(1.0);
		Circle c = new Circle(1.0);

		System.out.println("Shape: "+"\t"+"\t"+s.toString());
		System.out.println("Rectangle: "+"\t"+"\t"+r.toString());
		System.out.println("Circle: "+"\t"+"\t"+c.toString());
		System.out.println("Square: "+"\t"+"\t"+sq.toString());

	}
}