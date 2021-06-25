import java.util.Scanner;

//public class ControlFlowExercises {
//    public static void main(String[] args) {
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

     import java.util.stream.IntStream;

        public class ControlFlowExercises {
            public static void main(String[] args) {
                fizzBuzzBeforeJava8(100);
                fizzBuzzInJava8(100);
            }

            private static void fizzBuzzBeforeJava8(int num) {
                for (int i = 1; i <= num; i++) {
                    if (((i % 5) == 0) && ((i % 7) == 0)) // Is it a multiple of 5 & 7?
                        System.out.println("fizzbuzz");
                    else if ((i % 5) == 0) // Is it a multiple of 5?
                        System.out.println("fizz");
                    else if ((i % 7) == 0) // Is it a multiple of 7?
                        System.out.println("buzz");
                    else
                        System.out.println(i); // Not a multiple of 5 or 7
                }
            }

            private static void fizzBuzzInJava8(int num) {
                IntStream.rangeClosed(1, 100)
                        .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                        .forEach(System.out::println);
            }



/////////////// //MINI EXERCISE//////////////////////////////////
// TODO: create three unique usernames (user1, user2, user3).
//  create a fourth user and set it equal to user input. (ask
//  the user to enter a username). if the username has already
//  been used by user1, user2, or user3, print "sorry this
//  username already exists.
//        Scanner batman = new Scanner(System.in);
//
//        System.out.println("Enter a username ");
//        String user1 = "bob";
//        String user2 = "dylan";
//        String user3 = "zigat";
//        String userInput = batman.next();
//        if (userInput.equals(user1) || userInput.equals(user2) || userInput.equals(user3)) {
//            System.out.println("Sorry this username already exists.");
//        } else {
//            System.out.println("You are " + userInput);
//        }
//    }
//}
/////////////////////////////////////////////////////////////////////


    }
