import java.util.*;
class Test{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" enterr the value of x");
		float x = scan.nextFloat();
		System.out.println(" enterr the value of y");
		float y = scan.nextFloat();
		System.out.println(" enterr the value of z");
		float z = scan.nextFloat();

		Point3D p = new Point3D();
		p.setXYZ(x,y,z);
		System.out.println(p.toString());

	}
}