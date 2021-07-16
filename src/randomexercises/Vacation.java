package randomexercises;

import java.util.Arrays;
import java.util.Scanner;

public class Vacation {
    // TODO: Create a method which will return a String[] containing the user's favorite vacation spots
//  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
//  -> Then, add the old elements
//  -> Finally, add the new element
//  -> When the user decides to finish inputting spots, return the String[].
//  -> sout out the returned value!
    public static String[] newSpot() {
//        String[] Vacation = new String[3];
//        Vacation[0] = "Miami";
//        Vacation[1] = "Dallas";
//        Vacation[2] = "Los Vegas";

//        String[] Vacation = {"Miami", "Dallas", "Los Vegas"};

        //Arrange userInput into an array
// Set of valid user inputs
//        final Set<String> gameList = new HashSet<String>();
//        // Object from which user inputs are read
//        final Scanner in = new Scanner(System.in);
//
//        // Introduction
//        System.out.println("Where do you want ot go for vacation");
//
//        // What the user enters
//        String input;
//
//        // Check that 4 spots have been entered, don't get out of the loop until then
//        while (gameList.size() < 4) {
//            System.out.print("Enter the name of a vacation spot: ");
//            // Read one input, trim all beginning and trailing whitespaces
//            input = in.nextLine().trim();
//            // If the resulting string is empty, input is invalid: ask for another
//            if (input.isEmpty()) {
//                System.out.println("Empty inputs not accepted!");
//                continue;
//            }
//            if (!gameList.add(input))
//                System.out.println("You have already selected this place (" + input + ')');
//        }
//
//        // Print out the list of inputs
//        System.out.println("The list of places are: " + gameList);
//        return gameList;
        ///End of arrange userInput into an array


        //Declared length of Array Method
        Scanner input = new Scanner(System.in);
        //Read user  input.
        System.out.println("How many places do you want to enter?");
        String places = input.next();
        String[] array = new String[Integer.parseInt(places)];
        System.out.println("Enter the " + places + " places now.");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.next();
//            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
        return array;


        //End declared length of Array Method


    }
}
