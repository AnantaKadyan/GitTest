import java.util.*;

class TestMyTime{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the values of hour , minute, second :");
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		int second = scan.nextInt();
		
		try
		{
		MyTime t =new MyTime( hour , minute , second);
		MyTime t1 = t.nextHour(); 
		System.out.println(" time in next hour is : "+t1.toString());  // the next time should come as 0 after 23
		MyTime t2 = t.nextMinute();
		System.out.println(" time in next minute is : "+t2.toString());
		MyTime t3 = t.nextSecond();
		System.out.println(" time in next second is : "+t3.toString());

	     MyTime t4 = t.previousHour(); 
		System.out.println(" time in previous hour is : "+t4.toString());  // the next time should come as 0 after 23
		MyTime t5 = t.previousMinute();
		System.out.println(" time in previous minute is : "+t5.toString());
		MyTime t6 = t.previousSecond();
		System.out.println(" time in previous second is : "+t6.toString());
        } catch(Exception e)
        {
        	System.out.println(e);
        }
}
}