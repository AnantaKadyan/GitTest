import java.util.*;
class ArrayObject
{
	public static void main(String[] args) {
		Student s1 = new Student(1, "ravi" ,18);
		Student s2 = new Student(2, "vijay" ,19);
		Student s3 = new Student(3, "ajay" ,18);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator itr = al.iterator();

		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}