import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {
//        add();
//        sub();
//        mul();
//        div();
//        wePlaying("Rockets");
//        myStats(76);
//        lauraMethod(3);
//        Scanner sc = new Scanner(System.in);
//        int km = sc.nextInt();
//        stonks(km);
//        System.out.println("Good Job!");
//        boozo(1, 10);
//        Scanner scammer = new Scanner(System.in);
//        number4(scammer);
        number3(10);

    }

    public static int add() {
        int x, y, sum;
        Scanner adding = new Scanner(System.in);
        System.out.print("First number: ");
        x = adding.nextInt();
        System.out.print("Second number: ");
        y = adding.nextInt();
        sum = x + y;
        System.out.printf("%s + %s equals %s", x, y, sum);
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
        System.out.printf("%s is the best team ", name);
        numbers(play);
    }
    // TODO: create a new method that accepts the string created from the
//     first method and returns the number of characters in that string.

    public static void numbers(String play) {
        System.out.println("\nThere are " + play.length() + " characters in this string");
    }

    ;
//    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";  - accepts: your age. returns: "that's crazy! you don't look
//        100 years old!"    -accepts: your favorite quote. returns: "your fave quote"

    public static String myStats(String x, String y) {
        System.out.printf("Hello %s %s", x, y);
        return "Hello" + x + y;
    }

    public static String myStats(int x) {
        System.out.printf("That's crazy! you don't look 100 years old!");
        return "That's crazy! you don't look 100 years old!";
    }

    public static String myStats(String x) {
        System.out.printf(x);
        return (x);
    }

    //    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.

    public static String lauraMethod(String x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me your age, name, and if you have pets");
        String name = sc.next();
        System.out.println(name);
        return "hello";
    }

    public static void lauraMethod(int x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me your age, name, and if you have pets");
        String age = sc.next();
        System.out.println(age);
    }

    public static Boolean lauraMethod() {
        Boolean yes = true;
        Boolean no = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me your age, name, and if you have pets");
        String animals = sc.next();
        System.out.println(animals);
        return true;
    }
    //recursions
//    TODO: you are a sports manager. Prompt your client who is training
//     for a marathon how many miles they have to run today. You're the
//     coach, so you decide how many miles they ran that day. print out
//     how many miles they have left in training until they have 0 miles
//     left.

    public static void stonks (int miles) {
        if (miles > 0) {
            System.out.printf("How many miles %s\n", miles);
            miles -= 2;
            System.out.printf("Mile: %s", miles);
            stonks(miles);
        }
    }

    public static int boozo (int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + " :");
        int answer = sc.nextInt();
        if (answer >= min || answer <= max) {
            System.out.println("num in range");
            return answer;
        } else {
            return boozo(min, max);

        }
    }
    public static int number3(int x) {
        System.out.println("Enter a number 1 - 10");
        int i, value = 1;
        for (i = 1; i <= x; i++) {
            value = value * i;
        }
        System.out.println( x + "!" + " = " + value);
        return value;

    }

   public static void number4 (Scanner scammer){
//        Scanner scammer = new Scanner;
       while (true){
           System.out.println("How many side is your dice?");
           short n = Short.parseShort(scammer.nextLine());
           int range = -1 + 1;
           System.out.println("Your dice roll 1 = " + ((int)(Math.random() * range) + 1));
           System.out.println("Your dice roll 2 = " + ((int)(Math.random() * range) + 1));
           System.out.println("Do you wish to continue?");
           if(scammer.nextLine().toLowerCase().equals("n")){
               break;
           }
       }
   }

}

