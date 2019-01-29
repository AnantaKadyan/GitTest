class Circle implements GeometricObject {
	double radius = 1.0;

	Circle(double radius){
		this.radius = radius;
	}
	public double getArea(){
		double area = 3.14 * radius*radius;
		return area;
	}

	public double getPerimeter(){
		double peri = 2 *3.14*radius;
		return peri;
	}
}