/*Author : Ananta
version :1.0.0
purpose: to perform  basic arithmetic operations addition, subtraction, multiplication and division
 */
  class Operations
{
 
    public static void main(String[] args)
    {
        int number1 = 10;
        int number2 = 5;
 
        //calculating number1 + number2 ie the sum;
        int sum = number1 + number2;
 
        //calculating number1 - number2 ie the difference;
        int difference = number1 - number2;
 
        //calculating number1 * number2 ie the multiplication;
        int product = number1 * number2;
 
        //calculating number1 / number2 that is the division;
        int quot = number1 / number2;
 
        //calculating number1 % number2 ie the modulus operator for remainder;
        int rem = number1 % number2;
 
        //Displaying the values
        System.out.println("number1 : "+number1);
        System.out.println("number2 : "+number2);
        System.out.println("sum : "+sum);
        System.out.println("difference : "+difference);
        System.out.println("product : "+product);
        System.out.println("quot : "+quot);
        System.out.println("rem : "+rem);
    }
}