package Collections;
import java.util.*;
public class MapNotes {
    public static void main(String[] args) {
        /*
            A HashMap is a part of Java’s Collection Framework and implements the Map interface. It stores elements in key-value pairs, where:
            Keys are unique. If we try to insert a duplicate, it replaces the existing value of the corresponding key.
            Values can be duplicated.
            Internally uses Hashing, hence allows efficient key-based retrieval, insertion, and removal with an average of O(1) time.
            Not synchronized (unlike Hashtable in Java) and hence faster for most cases.
            Allows to store the null keys as well, but there should be only one null key object. Multiple values can be null.
        */
        HashMap<Integer, String> mapObj = new HashMap<>();
        // Add elements to hashmap
        mapObj.put(535002, "Vizianagaram");
        mapObj.put(535005, "Vizag");
        mapObj.put(535001, "Srikakulam");
        System.out.println(mapObj);
        // Retrieval of keys
        List<Integer> keys = new ArrayList<>(mapObj.keySet());
        System.out.println(keys);
        for (int num : keys){
            System.out.println(num);
        }
        // Retrieval of values
        List<String> values = new ArrayList<>(mapObj.values());
        System.out.println(values);
        //Deletion of element
        mapObj.remove(535002);
        System.out.println("After Deletion : " + mapObj);
        // verification of keys
        System.out.println(mapObj.containsKey(535002));
        System.out.println(mapObj.containsKey(535826));
        // verification of values
        System.out.println(mapObj.containsValue("Vizag"));
        System.out.println(mapObj.containsValue("Delhi"));
        //Updation of elements
        mapObj.put(535002, "qwerty");
        mapObj.putIfAbsent(535009, "Eluru");
        System.out.println("Final Hashmap : " + mapObj);

        //traversal of java hashmap
        for(HashMap.Entry<Integer, String> entries : mapObj.entrySet()){
            System.out.println(entries.getKey() + " >>>>> " + entries.getValue());
        }
    }
}
