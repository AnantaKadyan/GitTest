public class Circle extends Shape{
	double radius;
	public Circle(){
		super();
		radius = 1;
   }
  public  Circle(double radius){
   	super();
   	this.radius = radius;
   }
   public Circle(double radius , String color,boolean filled){
   	super(color,filled);
   	this.radius = radius;
   }
  public  double getRadius(){
   	return radius;
   }
  public  void setRadius(double radius){
   	this.radius = radius;
   }
  public double  getArea(){
  	return (3.14*radius*radius);
  }
 public  double getPerimeter(){
  	return (3.14*2*radius);
  }
  public String toString(){
  	return (getArea()+"\t"+getPerimeter());
  }

}