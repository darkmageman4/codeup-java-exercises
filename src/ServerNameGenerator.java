import java.util.ArrayList;

public class ServerNameGenerator {
    public static void main(String[] args) {



//adjective
        String[] adjective = {"adorable", "adventurous", "aggressive", "agreeable"
                    , "alert", "alive"
                    , "amused", "angry-15", "annoying", "amazing"};
        int randomized = (int) (Math.random() * adjective.length);
        String ads = adjective[randomized];
//        System.out.println("Random Element = " + ads);

//adjective

//nouns
        String[] nouns = {"Bread", "Milk", "Juice", "Eggs", "Cheese", "Rice"
                , "Grenades", "Ar-15", "Scar", "Sig"};
        int randomIndex = (int) (Math.random() * nouns.length);
        String randomElement = nouns[randomIndex];
//        System.out.println("Random Element = " + randomElement);

//nouns
        System.out.printf("Here is your server name: \n%s-%s",  randomElement,ads);

    }
}


