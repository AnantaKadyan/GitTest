public class Circle 
{
protected double radius=1.0;

public Circle(double radius)
{
this.radius=radius;
}
public double getPerimeter()
{
 return(3.14*radius*radius);
 
}	
public double getArea()
{
return(2*3.14*radius);
}
}