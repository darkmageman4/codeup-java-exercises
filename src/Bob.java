import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Hey dude");
        Scanner bob = new Scanner(System.in);
        String userinput = bob.nextLine();
        if (userinput.isBlank()){
            System.out.println("Fine. Be that way!");
        }else if (userinput.endsWith("?")){
            System.out.println("Sure");
        }else if (userinput.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else{
            System.out.println("Whatever");        }
    }
}