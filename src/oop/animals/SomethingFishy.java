package oop.animals;

public class SomethingFishy {
    public static void main(String[] args) {
        Marines marineAnimal;

//        while (!printedAllmarineAnimal) {

//            check the animal typename
//            pump to database
//            next loop
//            check to see if the list of animals is now empty
//            if so, printedAllmarineAnimal = true
//            lloop ends

//        }
//      Marines marineAnimal = new Aquamams("Blue Whale");
//        var marineAnimal = new Aquamams("Blue Whale");
        marineAnimal = new Aquamams("Blue Whale");


//        ((Aquamams) marineAnimal).setMaxTimeSubmerged(30);

        System.out.println(marineAnimal.getName());
        System.out.println((((Aquamams) marineAnimal).getMaxTimeSubmerged()));

    }
}
