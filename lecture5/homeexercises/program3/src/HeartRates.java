/* Author : ananta
version : 1.0.0
Purpose : to get the input from 2 patients and display their name age and their heart rates*/

import java.util.*;

     class HeartRates {
 
      
    //Initialize Variables.
 
    String firstName, lastName;
    BirthDate dob ;
    int day;
    int month;
    int year;
    //Constructor
 
     HeartRates(String fName, String lName,int month, int day, int year ) {
 
        firstName = fName;
        lastName = lName;
        dob = new BirthDate( day , month, year);
        
    }
     void setFirstName(String fName) {
        firstName = fName;
    }
    //Get First Name. 
    String getFirstName() {
        return firstName;
    }
 
    //Set Last Name.
     void setLastName(String lName) {
        lastName = lName;
        }
 
    //Get Last Name.
 
     String getlastName() {
        return lastName;
    }
    
 //Get Month, Day and Year
     void getBirthDate() {
        System.out.println(day+"/"+month+"/"+year);
    }

     int getAge(){
        return (year +((month *30)+day)/365);
        }
 
     int maximumHeartRate() {
        return (220 - getAge());
    }
 
    //displays the target heart rate range
     void targetHeartRate(){
    System.out.println("Target Heart Rate Range: "+ maximumHeartRate() * 0.5 + " to "+ maximumHeartRate() * 0.85);
    }
}







    

	
