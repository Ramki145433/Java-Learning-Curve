package Collections;
import java.util.LinkedList;
public class LinkedListNotes {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);
        ll.set(0, 10);
        System.out.println(ll);
    }
}
