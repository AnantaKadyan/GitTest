class Square extends Rectangle{

	Square(){
		super();
		length=1.0;
		width=1.0;
	}

	Square(double side){
		super();
		length=side;
		width=side;
	}

	Square(double side,boolean filled,String color){
		super(side,side,filled,color);
	}

	void setSide(double side){
		length = side;
		width = side;
	}

	double getSide(){
		return length;
	}

	void setWidth(double side){
		width = side;
	}

	void setLength(double side){
		width = side;
	}

	public String toString(){
		return "color= "+getColor()+"\t"+"filled= "+isFilled()+"\t"+"length"+getLength()+"\t"+"width= "+getWidth()+"\t"+"area"+getArea()+"\t"+"perimeter= "+getPerimeter();
	
	}
}
