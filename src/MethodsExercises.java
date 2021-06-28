import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        add();
//        sub();
//        mul();
//        div();
//        wePlaying("Rockets");
        myStats("Life is like a box of rocks");

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
//    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";  - accepts: your age. returns: "that's crazy! you don't look
//        100 years old!"    -accepts: your favorite quote. returns: "your fave quote"

    public static String myStats(String x, String y){
        System.out.printf("Hello %s %s",x,y);
        return "Hello"+ x + y;
    }
    public static String myStats(int x){
        System.out.printf("That's crazy! you don't look 100 years old!");
        return "That's crazy! you don't look 100 years old!";
    }
    public static String myStats(String x){
        System.out.printf(x);
        return (x);
    }


}