package collectionexplanation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Jose", "Meghan", "Duncan", "Maryam"));
        names.add("Hugh");
        names.add("Alex");

        System.out.println(names.get(1));

        // regular for loop
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // enhanced for loop (or foreach loop)
        for(String name : names) {
            System.out.println(name);
        }
        // set and queue are omitted

        Map<String, Integer> namesAndAges = new HashMap<>();
        namesAndAges.put("Meghan", 25);
        namesAndAges.put("Alex", 25);
        namesAndAges.put("Alex", 26);

        System.out.println(namesAndAges.get("Alex"));
        for(var k : namesAndAges.keySet()) {
            System.out.println(k);
        }
    }
}
