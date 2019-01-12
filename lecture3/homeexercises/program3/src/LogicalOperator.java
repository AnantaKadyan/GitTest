/* Author: Ananta
 Version: 1.0.0
 Purpose: to give the output of rational and logical operators on integers and boolean datatypes*/

 class LogicalOperator{
 	public static void main(String[] args) {

 		boolean riddle = !( 1 < 8 && (5 > 2 || 3 < 5)); // logical operators are used on integers
		System.out.println("logical operator on integer : " +riddle);

		boolean rational = (21 <= 19 || 17 >= 28); // rational operators are used on integers
		System.out.println("rational operator on integer : "+rational);

		boolean logical = ( false && !(true || true) );// logical operators are used on boolean
		System.out.println("logical operator on boolean : "+logical);
 	}
 }