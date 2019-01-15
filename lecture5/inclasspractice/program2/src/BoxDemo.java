/* Author : Ananta
Version : 1.0.0
Purpose : to create another class used to print the dimensions and volume of the box*/

class BoxDemo{
	public static void main(String[] args) {

		// we use parameterised constructors
		Box s = new Box();  // we make different objects of the Box class
		Box t = new Box(1,2,3);
		Box u = new Box(4,5);
		double vol = s.volume(); // we assign the value of volume to the variable vol
		System.out.println("volume is : " + vol);
		 vol = t.volume(); // we assign the value of volume to the variable vol
		System.out.println("volume is : " + vol);
		 vol = u.volume(); // we assign the value of volume to the variable vol
		System.out.println("volume is : " + vol);
	}
}