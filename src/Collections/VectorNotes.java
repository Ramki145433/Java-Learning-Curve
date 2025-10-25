package Collections;
import java.util.*;
public class VectorNotes {
    public static void removeDuplicates(Vector<String> v){
        Vector<String> res = new Vector<>();
        for(int i = 0; i < v.size(); i++){
            if(i == v.lastIndexOf(v.get(i))){
                res.add(v.get(i));
            }
        }
        System.out.println(res);
    }

    public static void copyOfVector(Vector<String> v){
        Vector<String> copy = new Vector<>(v);
        copy.add("abc");
        copy.add(1, "xyz");
        System.out.println("Copy of vector : " + copy);
    }

    public static void main(String[] args) {
        /*
            Vector is a resizable array in Java, found in the java.util package.
            It is part of the Collection Framework and works like an ArrayList,
            but it is synchronized, meaning it is safe to use in multi-threaded programs.
            However, this makes it a bit slower than ArrayList./

            It expands as elements are added.
            The Vector class is synchronized in nature means it is thread-safe by default.
            Like an ArrayList, it maintains insertion order.
            It allows duplicates and nulls.
            It implements List, RandomAccess, Cloneable and Serializable.


        */
        Vector<String> vec = new Vector<>(5,4);
        Vector<String> vec1 = new Vector<>();
        vec1.add("Sai");
        vec1.add("Ram");
        //The below functionalities are need learn for every classes.
        //Add
        //0 <= index <= vec.size() inserting a element at index should follow this rule
        vec.addElement("Ram");
        vec.add("Raju");
        vec.add("Ram");
        vec.add(3, "Sai");
        vec.add("Raju");
        //first index and last index
        System.out.println("FirstIndex : " + vec.indexOf("Raju"));
        System.out.println("LastIndex : " + vec.lastIndexOf("Raju"));
        //calling method removeDuplicates
        removeDuplicates(vec);
        copyOfVector(vec);
        //Update
        vec.add(3, "Laxman");
        //Retrieval
        for (String v : vec){
            System.out.println(v);
        }
        System.out.println("First Element : " + vec.getFirst());
        System.out.println("Last Element : " + vec.getLast());
        //Delete
        vec.remove("Sai");
        vec.removeElement("Ram");
        //Verification
        System.out.println(vec.contains("Sai"));
        System.out.println(vec.containsAll(vec1));

        System.out.println(vec);
        System.out.println(vec.size());
        System.out.println(vec.capacity());
    }
}
