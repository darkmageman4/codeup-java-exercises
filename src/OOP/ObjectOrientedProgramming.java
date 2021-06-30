package OOP;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // tell me about a person
//        Person dearMartha = new Person("Wagner",26,"perfect","Haitian");
    Person person = new Person();

    person.setName("Wagner");
        System.out.println(person.getEntertainment("ride rollercosters"));

        Person Tiffany = new Person();
        Tiffany.setName("Tiffany");
        System.out.println(Tiffany.getEntertainment("tubing the river"));

    }
}
