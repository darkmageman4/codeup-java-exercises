package movies;

import java.util.Scanner;

public class MovieApplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: ");
        int choice = userInput.nextInt();
        switch (choice) {
            case 1:
//                resolution = number + other;
                break;
            case 2:
//                resolution = number - other;
                break;
            case 3:
//                resolution = number * other;
                break;
            case 4:
//                resolution = number / other;
                break;
            case 5:
//                resolution = number / other;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
