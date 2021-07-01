package oopexercise;

public class Person {
    //field
    private String name;

    // Constructor class hat accepts a `String` value and sets
    //the person's name to the passed string.
    public Person (String name){
        this.name = name;
    }

    public Person (){

    }

    //Properties

    //TODO: return the person's name
    public String getName() { return name; }

    //TODO: change the name property to the passed value
    public void setName(String name) { this.name = name; }

    //TODO: print a message to the console using the person's name
    public void sayHello() { System.out.println(name); }

}

