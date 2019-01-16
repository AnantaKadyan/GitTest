
import java.util.*;

class HeartRateTest{

 public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in); // we make input object for Scanner class
        HeartRates[] hr = new HeartRates[2];  // an array of class is defined and initialised

        for ( int i=0 ; i <2 ; i++){
        System.out.println("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Enter BirthDate: ");
         int day=input.nextInt();
         int month=input.nextInt();
         int year=input.nextInt();
 
        HeartRates hr1 = new HeartRates(firstName, lastName,day,month,year); // another object of the class is defined to call the functions
        System.out.println("Name: "+ firstName +", " + lastName);
        System.out.println("Age in years: "+hr1.getAge());
        System.out.println("Maximum Heartrate: "+ hr1.maximumHeartRate());
        hr1.getBirthDate();   // the methods are called using the object
        hr1.targetHeartRate();
    }
 
    }
}