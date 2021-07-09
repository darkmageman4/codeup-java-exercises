package grade;

import java.util.HashMap;
import java.util.Set;

public class HashCode {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            myHashMap.put(i, "This is a value");
        }

Set<Integer>keys = myHashMap.keySet();

        for (Integer key : keys){
            System.out.println(myHashMap.get(key));
        }

    }

}
