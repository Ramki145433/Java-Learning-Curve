package Collections;
import java.util.*;
public class SetNotes {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(4);
        hs.add(6);
        hs.add(2);
        hs.remove(2);
        System.out.println(hs.contains(4));
        System.out.println(hs);
    }
}
