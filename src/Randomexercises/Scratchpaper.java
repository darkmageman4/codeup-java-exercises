package Randomexercises;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;

public class Scratchpaper {
    //TODO: write a method that accepts a string and returns a String array that splits at the spaces
    // - you can write this within any main method


    public static void stringToArray(String input) {
        String[] lyrics = input.split(" ");
        System.out.println(Arrays.toString(lyrics));
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
            System.out.println("letter "  + " =  " + str.toUpperCase().charAt(randomNum));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("You went over!");
        }

    }
}
