package HashmAPrelatedPlm;

import java.util.HashMap;
import java.util.Map;

public class ImplementationofHashmap {
    public static void HashMapMethod() {
        HashMap<String, Integer> map = new HashMap<>();
        // Adding element //

        map.put("Akash", 21);
        map.put("yash", 16);
        map.put("lav", 17);
        map.put("vivek", 23);
        map.put("abhishek", 24);

        // Getting value of a key from the hashmap //

        System.out.println(map.get("yash")); // 16
        System.out.println(map.get("Ankur")); // null because ankur is not present //

        // Changing(Updating value of a key in the hashmap//

        map.put("Akash", 25); // here update value 21 to 25 //
        System.out.println(map.get("Akash"));

        // removing a pair from the hashmap//

        System.out.println(map.remove("Akash")); // hera akash data will be remove because it exist//
        System.out.println(map.remove("pritee")); // Null because it not exist//
        System.out.println(map.get("Akash"));

        // cheacking if a key is in the hashmap //
        System.out.println(map.containsKey("Akash")); // False because it not cointains already remove//
        System.out.println(map.containsKey("yash"));// true because it exists//

        // adding a new entry only if the new key doesn't exist//
        map.putIfAbsent("Rahul", 30); // Enter because if it not exist//
        map.putIfAbsent("yash", 30); // Not enter because it alredy exists//
        System.out.println(map.get("Rahul")); // gives output as 30
        System.out.println(map.get("yash"));// it gives 16

        // get all key in the hashmap //
        System.out.println(map.keySet());

        // get all values in the hashmap//
        System.out.println(map.values());

        // get all entry in the hashmap //
        System.out.println(map.entrySet());

        // traversing all entry of hashmap // using for each loop // method 1 // keyset

//        for (String key : map.keySet()) {
//            System.out.printf("Age of %s is %d \n ", key, map.get(key));
//     }
        System.out.println();

        // traversing all entry of hashmap // using for each loop // method 2// Entry set

//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.printf("Age of %s is %d \n ", e.getKey(), e.getValue());
//
//
//        }
        System.out.println();


        // traversing all entry of hashmap // using for each loop // method 3 //
        for( var e : map.entrySet()){
            System.out.printf("Age of %s is %d \n", e.getKey(),e.getValue());
        }
        System.out.println();
    }
    static void main(String[] args) {

        HashMapMethod();
    }
}
