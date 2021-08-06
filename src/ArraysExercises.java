import oop.Person;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};

//        System.out.println(Arrays.toString(numbers));
//        format();
//        System.out.println(Arrays.toString(getIntArray()));
//        System.out.println(Arrays.toString(setIntArray(new int[length], scanner)));
//        System.out.println(Arrays.toString(getnameArray()));
//        String[] name = getNameArray();
//        for (String name : names) {
//            System.out.println(names);
//        }
//        String [] personOneNames = getNameArray();
//        String [] personTwoNames = Arrays.copyOf(personOneNames,personOneNames.length);
//
//        System.out.println(personOneNames);
//        System.out.println(personTwoNames);

//        personTwoNames[1] = "Edwards";
//        System.out.println(Arrays.toString(personOneNames));
    }

    public static void format() {

        String[] Person = new String[3];
        Person[0] = "Damn";
        Person[1] = "These";
        Person[2] = "Eggs";

        System.out.println(Arrays.toString(Person));
        for (String n : Person) {
            System.out.println(n);
        }
    }

    public static int[] getIntArray() {
        return new int[]{1, 2, 3};
    }

    public static int[] getIntArray(int length) {
        int[] intArray = new int[length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }
        return intArray;
    }

    public static int[] setIntArray(int[] intArray, Scanner scanner) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Please enter an integer: ");
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

//    public static String[] getNameArray() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Whats is your name!");
//        return scanner.nextLine().split(" ");
//    }
}


