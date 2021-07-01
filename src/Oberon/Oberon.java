package Oberon;

public class Oberon {
// TODO: CREATE A NEW "OBERON" CLASS WITH AT LEAST 6 PROPERTIES
//  THAT DESCRIBE OUR OBERON COHORT. MAKE SURE TO INCLUDE
//  AT LEAST THREE DIFFERENT TYPES OF DATA IN YOUR CLASS. IN A
//  SEPARATE FILE, CREATE 3 INSTANCES OF THE OBERON CLASS AND
//  PRINT OUT A STRING THAT USES AT LEAST 3 OF THOSE PROPERTIES
//  TO DESCRIBE THAT OBERON INSTANCE.

public String name;
public int numberOfStudents;
private static final boolean hasSkin = true;
public static final boolean isAGirl = true;
public String residence;
public double gpa;

public Oberon(String name, int numberOfStudents, String residence, short gpa){
    this.name = name;
    this.numberOfStudents = numberOfStudents;
    this.residence = residence;
    this.gpa = gpa;
}



public Oberon(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public static boolean isHasSkin() {
        return hasSkin;
    }

    public static boolean isIsAGirl() {
        return isAGirl;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String everthting(){
        return this.name + " lives in " + residence;
    }
}
