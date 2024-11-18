import java.util.*;

public class AccMap {
    public static void main(String[] args) {
        String a = "qwertyuiopasdfghjklzxcvbnm"; // Source string
        String b = "abcdefghijklmnopqrstuvwxyz"; // Target string
        HashMap<Character, Character> map = new HashMap<>();

        // Mapping characters from string a to string b
        for (int i = 0; i < 26; i++) {
            map.put(a.charAt(i), b.charAt(i));
        }

        // Using enhanced for-loop to iterate through the map and print mappings
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
