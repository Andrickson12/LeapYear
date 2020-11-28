import java.util.Scanner;

public class Demo {

    //variables
    static private boolean isLeap = false;

    public static void main (String[] args) {

        leapFunction();

    }

    public static void leapFunction() {

        //Get user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");

        //Storing user input in year variable
        int year = sc.nextInt();
        sc.close();

        //Calculation
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
            }
            else
                isLeap = true;
        }
        //Displaying results based on condition
        if (isLeap) {
            System.out.println(year + " is a Leap Year, prepared.");
        } else {
            System.out.println(year + " is not a Leap Year, relax.");
        }
    }
}
