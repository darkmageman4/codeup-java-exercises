import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);
        String userinput = bob.next();
        if (userinput.equals(" ")){
            System.out.println("Fine. Be that way!");
        }else if (userinput.endsWith("?")){
            System.out.println("Sure");
        }else if (userinput.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else{
            System.out.println("Whatever");        }
    }
}
