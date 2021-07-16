package collection;

import oop.Person;

import java.util.ArrayList;

public class CollectionsLecture {
    public static void main(String[] args) {
        ArrayList<String> strAr = new ArrayList<>();

        strAr.add("I am adding Will");
        System.out.println(strAr);
        System.out.println("id: " + System.identityHashCode(strAr));
        System.out.println("Size: " + strAr.size());
        System.out.println("index of zero: " + strAr.get(0));
        System.out.println("Hash: " + strAr.hashCode());
        System.out.println("\n");


        strAr.add("I am adding Turner");
        System.out.println(strAr);
        System.out.println("Size: " + strAr.size());
        System.out.println("id: " + System.identityHashCode(strAr));
        System.out.println("index of one: " + strAr.get(1));
        System.out.println("Hash: " + strAr.hashCode());
        System.out.println("\n");


        ArrayList<String> stringCopy = strAr;

        strAr.add("I am adding Copy");
        System.out.println(stringCopy);
        System.out.println("Size: " + strAr.size());
        System.out.println("id: " + System.identityHashCode(strAr));
        System.out.println("index of two: " + strAr.get(2));
        System.out.println("Hash: " + strAr.hashCode());
        System.out.println("\n");

        System.out.println("The array lists are equal: " + strAr.equals(stringCopy));
        System.out.println("\n");

        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(new Person("Casey Edwards"));
        peopleList.add(new Person("Frodo Banging"));
        peopleList.add(new Person("WarShack"));

        for (Person person : peopleList) {
            System.out.println(peopleList.indexOf(person));
//            PersonUtils.printGreeting("Hello, I am: ", person.getFullName());
        }
//        public static void printListDetails (ArrayList < Person > peopleList) {
//            int counter = 0;
//            for (Person person : peopleList) {
//                System.out.println("Current Iterations: " + counter);
//                System.out.println("Current Index: ", peopleList.indexOf(person));
//                counter++;
//            }
//        }


    }
}
