package IteratorTypes;
import java.util.*;
public class EnumerationNotes {
    public static void main(String[] args) {
        /*
            Introduced in JDK 1.0 (used with legacy classes like Vector, Stack, Hashtable).
            Can only read elements — not remove or modify.
            Limitation: No removal, forward-only, works with legacy collections.
        */
        Stack<String> stackOne = new Stack<>();
        stackOne.add("Ram");
        stackOne.add("Raj");
        stackOne.add("Naveen");
        Enumeration<String> elements = stackOne.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }

        /*
            Introduced in JDK 1.2 as part of Collection Framework.
            Works with all collections (ArrayList, HashSet, etc.).
            Supports element removal while iterating.
        */
        List<Integer> listOne = new ArrayList<>();
        listOne.add(55);
        listOne.add(66);
        listOne.add(77);
        listOne.add(88);
        listOne.add(99);
        Iterator<Integer> it = listOne.iterator();
        while (it.hasNext()){
            int num = it.next();
            if(num == 66){
                it.remove();
            }
        }
        System.out.println(listOne);

        /*
          Specialized iterator for List (e.g., ArrayList, LinkedList).
          Allows:
          Bidirectional traversal
          Add / modify elements during iteration Get current index
        */

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("John", "Joy", "Joe", "Jason"));
        ListIterator<String> listElements = arr.listIterator();
        while (listElements.hasNext()){
            String name = listElements.next();
            if(name.equals("Joe")){
                listElements.set("Jacob");
            }
            System.out.println(name);
        }
        System.out.println(arr);
        while (listElements.hasPrevious()){
            String name = listElements.previous();
            System.out.println(name);
        }
    }
}