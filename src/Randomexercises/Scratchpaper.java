package Randomexercises;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Scratchpaper {
    //TODO: write a method that accepts a string and returns a String array that splits at the spaces
    // - you can write this within any main method


    public static void stringToArray(String input) {
        String[] lyrics = input.split(" ");
        System.out.println(Arrays.toString(lyrics));
    }
}
