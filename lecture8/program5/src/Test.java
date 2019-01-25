class Test{
	public static void main(String[] args) {
		
		Rectangle r =new Rectangle(2.0 , 2.0);
		Square s = new Square(2.0);
		Circle c = new Circle(2.0);

		System.out.println("Rectangle :"+"\t"+r.toString());
		System.out.println("Circle :"+"\t"+c.toString());
		System.out.println("Square :"+"\t"+s.toString());
	}
}