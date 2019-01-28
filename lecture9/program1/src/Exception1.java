import java.util.*;
class Exception1{
     public static void setTitle(String title){
     	if (title == null)
         {  throw new IllegalArgumentException(""); }
        System.out.println(title);
          }

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your choice from below:");
		System.out.println("1 for division, 2 for array input, 3 for input string, 4 for making an object and 5  ");
		int choice = scan.nextInt();

		switch(choice){
			case 1 : try{
				int num1=30 , num2=0;
				int output1 = num1/num2;
				System.out.println("result" + output1);
							}
							catch(ArithmeticException e){
								System.out.println("cannot divide by zero");
							}break;

			case 2 : try{
				int a[] = new int[10];
				a[11] = 9;
			}			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}	break;

			case 3 :  try{
				int num = Integer.parseInt("XYZ");
				System.out.println(num);
			}catch(NumberFormatException e){
				System.out.println(e);
			}  break;

			case 4: try{
				String str =null;
				System.out.println(str.length());
			} catch(NullPointerException e){
				System.out.println(e);
			}  break;

			case 5 : try{
				String x = null;
				setTitle(x);
			    } catch(IllegalArgumentException e){ System.out.println(e); }

		}
	}
}