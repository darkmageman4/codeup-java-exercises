import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        add();
//        sub();
//        mul();
//        div();
        wePlaying("Rockets");

    }

    public static int add() {
        int x, y, sum;
        Scanner adding = new Scanner(System.in);
        System.out.print("First number: ");
        x = adding.nextInt();
        System.out.print("Second number: ");
        y = adding.nextInt();
        sum = x + y;
        System.out.printf("%s + %s equals %s",x,y,sum);
    return sum;
    }

    public static int sub() {
        Scanner subtracting = new Scanner(System.in);
        System.out.print("First number: ");
        int x = subtracting.nextInt();
        System.out.print("Second number: ");
        int y = subtracting.nextInt();
        return x - y;
    }

    public static int mul() {
        Scanner multiplying = new Scanner(System.in);
        System.out.print("First number: ");
        int x = multiplying.nextInt();
        System.out.print("Second number: ");
        int y = multiplying.nextInt();
        return x - y;
    }

    public static int div() {
        Scanner dividing = new Scanner(System.in);
        System.out.print("First number: ");
        int x = dividing.nextInt();
        System.out.print("Second number: ");
        int y = dividing.nextInt();
        return x - y;
    }

//    TODO: create a new method that accepts the name of a basketball
//  team (ex: the spurs) and returns a String that says
//  "[basketballTeam] is the best team.". Invoke that method within
//  your main method (remember to pass in the name of the basketball
//  team). print out the result of the new method.

    public static void wePlaying(String name) {
        var play = name + " is the best team";
        System.out.printf("%s is the best team ",name);
        numbers(play);
    }
   // TODO: create a new method that accepts the string created from the
//     first method and returns the number of characters in that string.

    public static void numbers(String play){
        System.out.println("\nThere are " + play.length() + " characters in this string");
    };
//    public int getInteger(int min, int max);{
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//    }
}