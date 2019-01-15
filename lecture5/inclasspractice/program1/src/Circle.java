/* Author : Ananta
Version : 1.0.0
Purpose : to create class circle which has methods to find area of circle*/
class Circle{
	double radius; // instance variable
     
    // instance method of the class Circle 
	double findArea(){
		return radius * radius * 3.1415;

	}
	void displayArea(){
		System.out.println(" Area = "+ findArea());
	}


}