import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> creditHours = new HashMap<>();

        creditHours.put("IT-1025", 3);
        creditHours.put("IT-1050", 3);
        creditHours.put("IT-1150", 3);
        creditHours.put("IT-2310", 3);
        creditHours.put("IT-2320", 4);
        creditHours.put("IT-2351", 4);
        creditHours.put("IT-2650", 4);
        creditHours.put("IT-2660", 4);
        creditHours.put("IT-2030", 4);

       // Check if the map contains the key "IT-1025" and "IT-2110"
        System.out.println("Contains IT-1025: " + creditHours.containsKey("IT-1025"));
        System.out.println("Contains IT-2110: " + creditHours.containsKey("IT-2110"));

        // Print all of the content (key and value) of the map
        System.out.println("\nAll content in the map:");
        for (Map.Entry<String, Integer> entry : creditHours.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


       // Remove IT-2030 and IT-1150
        creditHours.remove("IT-2030");
        creditHours.remove("IT-1150");

      //Print all of the values in the map 
        System.out.println("\nAll values after removing IT-2030 and IT-1150:");
        for (Integer value : creditHours.values()) {
            System.out.println(value);

        
        }
    }
}