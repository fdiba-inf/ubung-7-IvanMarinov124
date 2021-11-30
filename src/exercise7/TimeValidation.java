package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        boolean timeValid = true;
        boolean result1  =  areHoursValid(hours);
        boolean result2 = areMinutesValid(minutes);
        if(result1 == true && result2 == true) 
        {
          timeValid = true;
        }
        else{
          timeValid = false;
        }
        System.out.println("Time valid: " + timeValid);
    }


    public static boolean areHoursValid(int hours) {
        if(hours < 24 && hours > 0)
        {
          return true;
        }
        else
        {
          return false;
        }
        
    }


    public static boolean areMinutesValid(int minutes) {
        if(minutes < 60 && minutes > 0)
        {
          return true;
        }
        else
        {
          return false; 
        }
        
    }
}
