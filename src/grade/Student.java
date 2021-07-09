package grade;

import java.util.ArrayList;

public class Student {
    private String names;
    private ArrayList<Double> grades;

    public Student(String names) {
        this.names = names;
        grades = new ArrayList<>();
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }


    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add((double) grade);
    }

    public double Students() {
        var student = getNames().indexOf(names);
        var classSize = getGrades().size();
        return student;

    }

    // returns the average of the students grades
    public double getGradeAverage() {
        return Students();
    }
}
