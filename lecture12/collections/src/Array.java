import java.util.*;
class Array
{
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("ravi");
		al.add("vijay");
		al.add("ajay");
	     
	     ArrayList al2 = new ArrayList();
	     al2.add("ravi");
	     al2.add("hanumat");

	     al.addAll(al2);

	     System.out.println("iterating elements after removal are : ");
	     Iterator itr = al.iterator();
	     while(itr.hasNext())
	     {
	     	System.out.println(itr.next());
	     }
	}

}