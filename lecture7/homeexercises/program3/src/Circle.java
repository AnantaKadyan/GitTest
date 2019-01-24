class Circle extends Shape{
	double radius;

	Circle(){
		super();
		radius=1.0;
	}

	Circle(double radius){
		super();
		this.radius=radius;
	}

	Circle(double radius,boolean filled,String color){
		super(color,filled);
		radius=radius;
	}

	void setRadius(double radius){
		this.radius = radius;
	}

	double getRadius(){
		return radius;
	}

	double getArea(){
		return ((radius*radius*3.14));
	}

	double getPerimeter(){
		return ((2*3.14*radius));
	}

	public String toString(){
		return "color="+getColor()+"\t"+"filled= "+isFilled()+"\t"+"radius="+radius+"\t"+"area"+getArea()+"\t"+"perimeter= "+getPerimeter();
	}
}