
class Test{
public static void main(String[] args) {
	ResizableCircle c = new ResizableCircle(10.0);
	System.out.println( c.getPerimeter());
	System.out.println(c.getArea());

	c.resize(3000);
	System.out.println( c.getArea() );
	System.out.println(c.getPerimeter());
}
}