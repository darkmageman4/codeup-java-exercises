package grade;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner tower = new Scanner(System.in);
        Student test = new Student("Wagner");
        test.addGrade(10);

//        System.out.println(test.Students());
//        System.out.println(test.getGrades());
//        System.out.println(test.getGradeAverage());

        HashMap<String, String> students = new HashMap<>();
        students.put("Demetrio", "demo");
        students.put("Grady", "GG");
        students.put("Prachi", "PP");
        students.put("Chris", "Christo");

        System.out.println(students.get("Grady"));
        System.out.println("Here are the GitHub usernames of our students:\n"
                + students.keySet());
        System.out.println("What student would you like to see more information on?\n");
        String other = tower.next();

        switch (other) {
            case "Demetrio":
                System.out.println(
                        "Name: " + other + "- GitHub Username: " + students.get("Demetrio") +
                        "Current Average: " + test.getGradeAverage());
                break;
            case "Grady":
                System.out.println(
                        "Name: " + other + "- GitHub Username: " + students.get("Grady") +
                                "Current Average: " + test.getGradeAverage());
                break;
            case "Prachi":
                System.out.println(
                        "Name: " + other + "- GitHub Username: " + students.get("Prachi") +
                        "Current Average: " + test.getGradeAverage());
                break;
            case "Chris":
                System.out.println(
                        "Name: " + other + "- GitHub Username: " + students.get("Chris") +
                                "Current Average: " + test.getGradeAverage());
                break;
            default:
                System.out.printf("Sorry, no student found with the GitHub username of %s.", other);
                throw new IllegalStateException("Unexpected value: " + other);
        }

        String userInput = tower.next();
        System.out.println("Would you like to see another student?\n");
        String fedz = tower.next();
        if (userInput.equalsIgnoreCase("y")) {
            return;
        } else if (userInput.equalsIgnoreCase("n")) {
            //start over
        }
    }
}
