public class Circle{
   private	double radius;
 	private String color;

 	 public Circle(){
 		radius = 1.0;
 		color = "red";
 	}
 	public Circle(double radius){
 		this.radius = radius;
 		this.color = "red";

 	}
 	public Circle( double radius , String color){
 		this.radius = radius;
 		this.color = color;
 	}

 	double getRadius(){
 		return radius;
 	}
 	void setRadius( double radius){
 		this.radius = radius;
 	}
 	String getColor(){
 		return color;
 	}
 	void setColor(String color){
 		this.color = color;
 	}

 	double getArea(){
 		double area = 3.14 * radius * radius;
 		return area;
 	}

 }

