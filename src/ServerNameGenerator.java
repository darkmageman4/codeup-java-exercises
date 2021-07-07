public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] nouns = {"Bread", "Milk", "Juice", "Eggs", "Cheese", "Rice"
                , "Grenades", "Ar-15", "Scar", "Sig"};

        String[] adjective = {"adorable", "adventurous", "aggressive", "agreeable"
                , "alert", "alive"
                , "amused", "angry-15", "annoying", "annoyed"};

        for (String Nouns : nouns) {
            System.out.println(Nouns);
        }
        for (String Adjectives : nouns) {
            System.out.println(Adjectives);

        }

//        System.out.println("Here is your server name: \n" + Nouns + Adjectives);
    }
}
