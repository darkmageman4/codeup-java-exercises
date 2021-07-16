package randomexercises;

import java.util.Arrays;
import java.util.Random;

public class Scratchpaper {
    //TODO: write a method that accepts a string and returns a String array that splits at the spaces
    // - you can write this within any main method


    public static void stringToArray(String input) {
        String[] lyrics = input.split(" ");
        System.out.println(Arrays.toString(lyrics));
    }

    public static void getTwentyPrimes() {
        //returns a string containing the first 20 prime numbers, each separated by a comma.
        // Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.


        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is not a prime number");
            } else {
                System.out.println(i + " is a prime number");

            }
        }
    }


    public static void letterInString() {
// TODO Given this string: `String str = "Oberon is the
//  best cohort ever!"`, print out the character from that
//  string using a random number generator, that generates
//  a number between 0 and 50. Using a try/catch block, handle
//  any errors (Exceptions) that may occur by printing out the
//  message.

        String str = "Oberon is the best cohort ever!";
        Random randomObj = new Random();
        int randomNum = randomObj.nextInt((50));
        System.out.println(randomNum);

        try {
            System.out.println("letter " + " =  " + str.toUpperCase().charAt(randomNum));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("You went over!");
        }

    }
}
