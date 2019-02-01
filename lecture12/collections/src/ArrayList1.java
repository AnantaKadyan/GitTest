import java.util.*;
class ArrayList1
{
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("amit");
		al.add("vijay");
		al.add("kumar");
		al.add(1,"Sachin");

		System.out.println(" element at position 2 is : "+al.get(2));

		ListIterator<String> itr = al.listIterator();
		System.out.println(" transversing elements in forward direction");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println("transversing elements in backward direction");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}
}