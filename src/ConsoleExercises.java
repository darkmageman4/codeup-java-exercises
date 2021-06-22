import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %s",pi);

/* TODO: use the scanner to take in the name of the month you were born and print it back out
    - remember to first prompt the user for the input*/

//Scanner Class

//        while (sc.hasNext()) {
//            String word = sc.next();
//            if(word.equals("break")){
//                break;
//            }
//            System.out.println("Wrong word: \"" + word + "\" ");
//        }

        Scanner damnDaniel = new Scanner(System.in);

        System.out.print("Enter something: ");
        String month = damnDaniel.next();
        String day = damnDaniel.next();
        String year = damnDaniel.next();

//        System.out.print("Month:" + month +"\n" + "Day:" + day +"\n" + "Year" + year +"\n");

        String next = damnDaniel.nextLine();
//        System.out.println(next);

        System.out.printf("Month: %s \n Day: %s Year: %s", month, day, year);


    }

}
