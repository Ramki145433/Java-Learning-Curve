package Collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNotes {
    public static void returnSecondMax(ArrayList<Integer> arr){
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        if(arr.size() < 2){
            System.out.println("Array size should be greater than 2");
        }
        for (int ele : arr){
            if(ele > firstHighest){
                secondHighest = firstHighest;
                firstHighest = ele;
            } else if (ele > secondHighest && ele < firstHighest) {
                secondHighest = ele;
            }
        }
        if(secondHighest == Integer.MIN_VALUE){
            System.out.println("Array contains similar values");
        } else{
            System.out.println("Second Highest Element : " + secondHighest);
        }
    }
    public static void returnLeastElement(ArrayList<Integer> arr){
        int firstLeastNum = Integer.MAX_VALUE;
        int secondLeastNum = Integer.MAX_VALUE;
        for (int ele : arr){
            if(ele < firstLeastNum){
                secondLeastNum = firstLeastNum;
                firstLeastNum = ele;
            } else if (firstLeastNum < ele && secondLeastNum > ele) {
                secondLeastNum = ele;
            }
        }
        System.out.println("Second Least Num : " + secondLeastNum);
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Raju");
        list.add("Rakesh");
        list.add(3, "Joe");
        list.add(2, "virat");
        list.set(1, "Rohit"); // replacing a new value by removing old one.
        System.out.println(list);
        System.out.println(list.get(1));
        Collections.sort(list);
        System.out.println("Sorted List : " + list);
        Collections.reverse(list);
        System.out.println("Reverse List : " + list);
        System.out.println(list.contains("abc"));
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 5; i >= 1; i--){
            list1.add(i);
        }
        list1.add(5);
        list1.add(4);
        System.out.println(list1);
        returnSecondMax(list1);
        returnLeastElement(list1);
    }
}
