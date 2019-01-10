/* Author: Ananta
Version : 1.0.0
Purpose : to convert the entered minutes into years and number of days*/

import java.util.Scanner;
 class ConvertinYears {

    public static void main(String[]args) {


        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in); // to get the input from the user about no of minutes

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble(); // entered value is assigned to min variable

        long years = (long) (min / minutesInYear); // typecasting is used
        int days = (int) (min / 60 / 24) % 365; //typecasting used

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}