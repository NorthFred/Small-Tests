import java.util.*;

public class HashMapExerciseTest {

    public static void main(String[] args) {
        
        // HashMap can be created from the interface "map":
        Map<String, String> translations = new HashMap<>();
        
        // "put" method is used to add keys and values:
        translations.put("thank you", "kiitos");
        translations.put("here you go", "ole hyvä");
        translations.put("yes", "kyllä");
        translations.put("no", "ei");
        
        // keySet() method returns a set made of keys
        // get() method fetches the value in the hashmap that goes with the key
        for (String key: translations.keySet()) {
            
            System.out.println(key + ": " + translations.get(key));
        }
        
    }
}
