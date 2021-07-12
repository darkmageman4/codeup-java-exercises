package grade;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    Scanner tower = new Scanner(System.in);

    public static void main(String[] args) {
        Student test = new Student("Wagner");
//        test.addGrades(100,87,99,25);

        application();

        //        System.out.println(test.Students());
//        System.out.println(test.getGrades());
//        System.out.println(test.getGradeAverage());

    }

    public static void application() {
        HashMap<String, String> students = new HashMap<>();
        students.put("Demetrio", "demo");
        students.put("Grady", "GG");
        students.put("Prachi", "PP");
        students.put("Chris", "Christo");

        Student Demetrio = new Student("Demetrio");
        Demetrio.addGrades(19, 87, 49, 95);

        Student Chris = new Student("Chris");
        Chris.addGrades(19, 87, 49, 95);

        Student Prachi = new Student("Prachi");
        Prachi.addGrades(19, 87, 49, 95);

        Student Grady = new Student("Grady");
        Grady.addGrades(19, 87, 49, 95);

        Scanner tower = new Scanner(System.in);

//        System.out.println(students.get("Grady"));
        System.out.println("Here are the GitHub usernames of our students:\n"
                + students.keySet());
        System.out.println("What student would you like to see more information on?\n");
        String other = tower.next();

        switch (other) {
            case "Demetrio":
                System.out.println(
                        "Name: " + other + "- GitHub Username: " + students.get("Demetrio") + "\n" +
                                "Current Average: " + Demetrio.getGradeAverage());
                restart();
            case "Grady":
                System.out.println(
                        "Name: " + other + "- GitHub Username: " + students.get("Grady") + "\n" +
                                "Current Average: " + Grady.getGradeAverage());
                restart();
            case "Prachi":
                System.out.println(
                        "Name: " + other + "- GitHub Username: " + students.get("Prachi") + "\n" +
                                "Current Average: " + Prachi.getGradeAverage());
                restart();
            case "Chris":
                System.out.println(
                        "Name: " + other + "- GitHub Username: " + students.get("Chris") + "\n" +
                                "Current Average: " + Chris.getGradeAverage());
                restart();
            default:
                System.out.printf("Sorry, no student found with the GitHub username of %s.", other);
//                throw new IllegalStateException("Unexpected value: " + other);
        }
    }

    public static boolean cancel() {
        System.out.println("Then get out of here");
        return false;
    }

    public static void restart() {
        Scanner tower = new Scanner(System.in);
        System.out.println("Would you like to see another student?\n");
        String fedz = tower.next();
        if (fedz.equalsIgnoreCase("y")) {
            application();
        } else {
            cancel();
        }

    }
}

