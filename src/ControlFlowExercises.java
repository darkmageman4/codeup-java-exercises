import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //While loop
//        int i = 5;
//        while (i < 16){
//            System.out.println("i is " + i);
//            i++;
//    }
        // Do while loop
//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 65536);
        //for loop
//        for (int i = 2; i < 300; i *= i){
//            System.out.println(i);
//            if (i == 5){
//                break;
//            }
//        }

//        for (int i = 2; i < 300; i *= i) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//
//            }
//        }

        //MINI EXERCISE
        // TODO: create three unique usernames (user1, user2, user3).
        //  create a fourth user and set it equal to user input. (ask
        //  the user to enter a username). if the username has already
        //  been used by user1, user2, or user3, print "sorry this
        //  username already exists.
        Scanner batman = new Scanner(System.in);

        System.out.println("Enter a username ");
        String user1 = "bob";
        String user2 = "dylan";
        String user3 = "zigat";
        String userInput = batman.next();
        if (userInput.equals(user1) || userInput.equals(user2) || userInput.equals(user3)) {
            System.out.println("Sorry this username already exists.");
        } else {
            System.out.println("You are " + userInput);
        }
    }
}