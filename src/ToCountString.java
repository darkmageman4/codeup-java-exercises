import java.util.Scanner;

public class ToCountString {
    public static void main(String[] args) {


        //TODO: Create a method that will return how many capital letters are in a string.
        Scanner userInput = new Scanner(System.in);
        String txt = userInput.nextLine();

        int count = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isUpperCase(txt.charAt(i))) {
                count++;
                System.out.println(txt.charAt(i));
            }
        }
        System.out.println(count);
    }
}