import java.util.Scanner;

public class Demo {

    public static void main (String[] args) {

        //variables
        int year;
        boolean isLeap = false;

        //Get user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");

        //Storing user input in year variable
        year = sc.nextInt();
        sc.close();

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

        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

}
