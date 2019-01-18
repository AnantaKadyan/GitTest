import java.util.*;
class StaticDistanceTest{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of feet1: ");
		float feet1 = scan.nextFloat();
		System.out.println("Enter the value of inch1: ");
		float inch1 = scan.nextFloat();
		System.out.println("Enter the value of feet2: ");
		float feet2 = scan.nextFloat();
		System.out.println("Enter the value of inch2: ");
		float inch2 = scan.nextFloat();
		
		StaticDistance d1 = new StaticDistance(feet1,inch1);
		StaticDistance d2 = new StaticDistance(feet2 ,inch2);
		StaticDistance d3 = StaticDistance.sum(d1,d2);
		System.out.println(d3.getvaluefeet()+"  "+d3.getvalueinch());


        }
    }