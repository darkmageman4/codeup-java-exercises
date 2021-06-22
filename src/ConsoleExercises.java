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

//        System.out.print("Enter something: ");
//        String month = damnDaniel.next();
//        String day = damnDaniel.next();
//        String year = damnDaniel.next();

//        System.out.print("Month:" + month +"\n" + "Day:" + day +"\n" + "Year" + year +"\n");

//        String next = damnDaniel.nextLine();
//        System.out.println(next);

//        System.out.printf("Month: %s \n Day: %s Year: %s", month, day, year);
       damnDaniel.useDelimiter("\n");
        System.out.println("What is the length, width, and height of your classroom");
        double length, width, area ,height,perimeter,volume;
        length = damnDaniel.nextInt();
        width = damnDaniel.nextInt();
        area = length * width;
        height = damnDaniel.nextInt();
        perimeter = length * 2 + width * 2;
        volume = length * height * width;
        System.out.printf("length: %s \nWidth: %s\n", length, width);
        System.out.printf("Area: %s \nPerimeter: %s\n", area, perimeter);
        System.out.printf("Height: %s \nVolume: %s", height,volume );
//        (double/int/deliminator)
    }

}


