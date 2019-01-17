import  java.util.*;
class DistanceTest{
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter first distance ");
		System.out.println("enter feet");
		float f = scan.nextFloat();
		System.out.println("enter inches");
		float i = scan.nextFloat();
		
		System.out.println("enter second distance ");
		System.out.println("enter feet");
		 f = scan.nextFloat();
		System.out.println("enter inches");
		 i = scan.nextFloat();
		
        Distance d1 = new Distance(f,i);
		Distance d2 = new Distance();
		d1.setDistance( f ,i );
		d1.setDistance();
		d2.setDistance(f,i);
		d2.setDistance();
		d1.sum(d2);

	}
}