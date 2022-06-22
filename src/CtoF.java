import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {


        //A program that converts an inputted temperature in C and provides the equivalent temperature in F.
        // Hint: Google is your friend! Given C, solve for F.
        // Again, check for a valid input value and only respond with the F value if you got it,
        // otherwise output an appropriate error msg to the user.
        // Testing: 3 conditions: Bad Input, then test for the known freezing and boiling points.

        //8.	(6 Points)
        //Redo either the F to C or C to F converter program.
        //Create a new Java Main File called CtoF.java or FtoC.java.
        // (Don’t create a new project, just put it in the current project with the previous java main class.)
        //Use a do while loop to bulletproof the user input.
        // Now, when the user fails to enter a valid number,
        // the program will display an error msg and then loop and prompt them again to try again
        // to input the value correctly.
        // So, the program will block and repeat until they get it right.
        // Be sure to thoroughly test your program.
        // Include screen shots output copies here that show the tests and output.

        Scanner in = new Scanner(System.in);

        double cel = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean enteredWrong = true;
        do {
            System.out.println("Please enter a temperature in C");

            if (in.hasNextDouble()) {
                cel = in.nextDouble();
                in.nextLine();
                if (cel < -273.15){
                    System.out.println("\nYou entered " + cel + " as a temperature");
                    System.out.println("That's below absolute zero, please enter a possible temperature");
                    // https://www.coopersfire.com/news/whats-the-hottest-temperature-possible/
                    // Can't store the hottest possible temperature, so I'm ignoring it.
                }else{
                    double fer = (cel * 9 / 5) + 32;
                    System.out.println(cel + " converted to Fahrenheit is " + fer + ".");
                    enteredWrong = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered " + trash + " as a temperature");
                System.out.println("Run the program again and enter a valid amount!");
                //System.exit(0);  // terminate the program
            }
        }while (enteredWrong);
    }
}

