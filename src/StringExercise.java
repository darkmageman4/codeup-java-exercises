import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
//        String test = "We don't need no education\n" +
//                "We don't need no thought control";
//        System.out.println(test);
        //        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"
        Scanner sc = new Scanner(System.in);
        String pride = "Red Orange Blue Yellow Green Purple";
        System.out.println("Whats your favorite color?");
        String userInput = sc.next();
        if (userInput.contentEquals("Red")) {
            System.out.printf("My favorite color %s is the first one", userInput);
        }else if (userInput.contentEquals("Purple")){
            System.out.printf("My favorite color %s is the last one",userInput);
        }else {
            System.out.println("Get out of here!");
        }
    }
}
