import  java.util.*;
class StaticDistanceTest{
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);

		StaticDistance d1 = new StaticDistance(StaticDistance.f,StaticDistance.i);
		StaticDistance d2 = new StaticDistance();
		
		System.out.println("enter first distance ");
		System.out.println("enter feet");
		 StaticDistance.f = scan.nextFloat();
		System.out.println("enter inches");
		 StaticDistance.i = scan.nextFloat();
		d1.setDistance1( StaticDistance.f ,StaticDistance.i );
		d1.setDistance();
		
		System.out.println("enter second distance ");
		System.out.println("enter feet");
		 StaticDistance.f = scan.nextFloat();
		System.out.println("enter inches");
		 StaticDistance.i = scan.nextFloat();
		 d2.setDistance2(StaticDistance.f,StaticDistance.i);
		d2.setDistance();
		
       StaticDistance.sum(d2);

	}
}