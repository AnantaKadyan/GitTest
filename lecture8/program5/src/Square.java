public class Square extends Rectangle{
 
 public Square(){
 	super();
 	this.length = 1.0;
 	this.width = 1.0;
 }	
public Square(double side){
 	super();
 	length = side;
 	width = side;
 }
 public Square(double side , String color, boolean filled){
 	super(side,side,color,filled);
 }
 public double getSide(){
 	return  length;
 }
 public void setSide( double side){
 	this.length = length;
 }
 public void setWidth(double side){
 	width = side;
 }
 public void setLength(double side){
 	length = side;
 }
 public String toString(){
 	return (getArea()+"\t"+getPerimeter());
 }
}