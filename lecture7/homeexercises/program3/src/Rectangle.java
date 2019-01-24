class Rectangle extends Shape{
	 double width;
	 double length;

	Rectangle(){
		super();
		length=1.0;
		width=1.0;
	}

	Rectangle(double width,double length){
		super();
		this.length=length;
		this.width=width;
	}

	Rectangle(double width,double length,boolean filled,String color){
		super(color,filled);
		this.length=length;
		this.width=width;
	}

	void setWidth(double width){
		this.width = width;
	}

	double getWidth(){
		return width;
	}

	void setLength(double length){
		this.length = length;
	}

	double getLength(){
		return length;
	}

	double getArea(){
		return ((width*length));
	}

	double getPerimeter(){
		return ((2*(length+width)));
	}

	public String toString(){
		return "color"+getColor()+"\t"+"filled "+isFilled()+"\t"+"length "+getLength()+"\t"+"width "+getWidth()+"\t"+"area "+getArea()+"\t"+"perimeter"+getPerimeter();
	}

}