package oop;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
//         tell me about a person
//        Person dearMartha = new Person("Wagner",26,"perfect","Haitian");
    Person dorthy = new Person();

    dorthy.setName("Wagner");
        System.out.println(dorthy.getEntertainment("ride rollercosters"));

        Person Tiffany = new Person();
        Tiffany.setName("Tiffany");
        System.out.println(Tiffany.getEntertainment("tubing the river"));

    }
}
