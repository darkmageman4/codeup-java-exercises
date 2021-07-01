package oberon;

public class OberonRunFile {

    public static void main(String[] args) {
        Oberon texas = new Oberon();

        texas.name = "Wagner";
        texas.numberOfStudents = 32;
        texas.residence = "Texas";
//        texas.gpa = 39.4;
        texas.setGpa(39.4);
        texas.setResidence("Texas");

//        System.out.println(texas.gpa);
        System.out.println(texas.everthting());

    }

}
