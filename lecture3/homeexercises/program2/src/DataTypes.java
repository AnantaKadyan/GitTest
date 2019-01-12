/*Author : Ananta
version :1.0.0
purpose: to perform  basic arithmetic operations addition, subtraction, multiplication and division on all data types
 */
  class DataTypes
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

        double number3 = 0.4;
        double number4 = 0.4;
 
        //calculating number1 + number2 ie the sum;
        double sum1 = number3 + number4;
 
        //calculating number1 - number2 ie the difference;
        double difference1 = number3 - number4;
 
        //calculating number1 * number2 ie the multiplication;
        double product1 = number3 * number4;
 
        //calculating number1 / number2 that is the division;
        double quot1 = number3 / number4;
 
        //calculating number1 % number2 ie the modulus operator for remainder;
        double rem1 = number3 % number4;
 
        //Displaying the values
        System.out.println("number3 : "+number3);
        System.out.println("number4 : "+number4);
        System.out.println("sum : "+sum1);
        System.out.println("difference : "+difference1);
        System.out.println("product : "+product1);
        System.out.println("quot : "+quot1);
        System.out.println("rem : "+rem1);

        char number5 = 'a';
        char number6 = 'b';
 
        //calculating number1 + number2 ie the sum;
        int sum2 =  (number5 + number6);
 
        //calculating number1 - number2 ie the difference;
        int difference2 = (number5 - number6);
 
        //calculating number1 * number2 ie the multiplication;
        int product2 =(number5 * number6);
 
        //calculating number1 / number2 that is the division;
        int quot2 = (number5 / number6);
 
        //calculating number1 % number2 ie the modulus operator for remainder;
        int rem2 = (number5 % number6);
 
        //Displaying the values
        System.out.println("number5 : "+number5);
        System.out.println("number6 : "+number6);
        System.out.println("sum : "+sum2);
        System.out.println("difference : "+difference2);
        System.out.println("product : "+product2);
        System.out.println("quot : "+quot2);
        System.out.println("rem : "+rem2);
    }
}