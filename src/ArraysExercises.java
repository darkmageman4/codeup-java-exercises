import oop.Person;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        format();

addPerson();

    }

    public static void format() {

        String[] Person = new String[3];
        Person[0] = "Damn";
        Person[1] = "These";
        Person[2] = "Eggs";

        System.out.println(Person);
        for (String n : Person) {
            System.out.println(n);

        }
    }
}


