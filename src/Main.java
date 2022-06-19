import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //A program that converts an inputted temperature in C and provides the equivalent temperature in F.
        // Hint: Google is your friend! Given C, solve for F.
        // Again, check for a valid input value and only respond with the F value if you got it,
        // otherwise output an appropriate error msg to the user.
        // Testing: 3 conditions: Bad Input, then test for the known freezing and boiling points.

        Scanner in = new Scanner(System.in);

        double cel = 0;
        String trash = ""; // use for bad input which will read as a String
        System.out.println("Please enter a temperature in C");

        if(in.hasNextDouble())
        {
            cel = in.nextDouble();
            in.nextLine();
            double fer = (cel * 9/5) + 32;
            System.out.println (cel + " converted to Fahrenheit is " + fer + ".");
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou entered " + trash + " as a temperature");
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }
    }
}