package OOP;

public class Person {

    // field
    private String name;
    private int age;
    private String height;
    private String nationality;
    private static final boolean hasSkin = true;

    // Constructor
    public Person (String name, int age, String height, String nationality){
        this.name = name;
        this.age = age;
        this.height = height;
        this.nationality = nationality;
    }

    public Person() {

    }


    // Properties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public static boolean isHasSkin() {
        return hasSkin;
    }
}
