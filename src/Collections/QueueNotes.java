package Collections;
import java.util.*;
public class QueueNotes {
    public static void priorityQueuePractice(){
        /*
            * Initial Capacity of Priority Queue is : 11
            * Add : Offer, add
            * retrieval : peek (Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.)
            * delete : poll(Retrieves and removes the head of this queue, or returns null if this queue is empty.),
            * remove(Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.)
            * Verification : Contains
            * Comparator.reverseOrder() => Initially head always points to lowest element if its interger type, you can change by using comparator.
        */
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(8);
        pq.offer(6);
        pq.offer(4);
        pq.offer(2);
        pq.offer(1);
        System.out.println(pq);
        int peekELe = pq.peek();
        System.out.println(peekELe);
        pq.poll();
        pq.remove();
        System.out.println(pq);
        System.out.println(pq.contains(8));
        // Retrieving all elements
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
    public static void arrayDeque(){
        ArrayDeque<String> ad = new ArrayDeque<>();
        // For Adding : offer, offerFirst, offerLast
        // For Retrieval : peek, peekFirst, peekLast
        // For Delete : pool, pollFirst, pollLast
        ad.offer("Dog"); // basically adds at first
        ad.offerFirst("Tiger");
        ad.offerLast("Lion");
        System.out.println(ad);

        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        ad.poll(); // removes first element
        ad.pollFirst();
        ad.pollLast();
        System.out.println(ad);
    }
    public static void main(String[] args) {
        priorityQueuePractice();
        arrayDeque();
    }
}