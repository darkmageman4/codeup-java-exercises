import java.util.ArrayList;

public class ServerNameGenerator {
    public static void main(String[] args) {



//adjective
        String[] adjective = {"adorable", "adventurous", "aggressive", "agreeable"
                    , "alert", "alive"
                    , "amused", "angry-15", "annoying", "amazing"};
        int goodAdjectives = (int) (Math.random() * adjective.length);
        String evenBetter = adjective[goodAdjectives];

//adjective

//nouns
        String[] nouns = {"Bread", "Milk", "Juice", "Eggs", "Cheese", "Rice"
                , "Grenades", "Ar-15", "Scar", "Sig"};
        int goodNouns = (int) (Math.random() * nouns.length);
        String oddWorse = nouns[goodNouns];

//nouns
        System.out.printf("Here is your server name: \n%s-%s",  oddWorse,evenBetter);

    }
}


