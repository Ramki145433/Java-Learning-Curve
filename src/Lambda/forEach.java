package Lambda;
import  java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class forEach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ram", "Raj", "Sai", "Rishi");
        list.forEach(name -> System.out.println(name));
        list.forEach(System.out::println);
        Map<String, Integer> map = new HashMap<>();
        map.put("Raj", 21);
        map.put("Ram", 22);
        map.put("Sai", 23);
//        map.entrySet().forEach((num) -> System.out.println(num));
//        map.forEach((key, value) -> System.out.println(key + " " + value));
        AtomicInteger index = new AtomicInteger();
        List <Student> students = Arrays.asList(
                new Student("Ram", 21),
                new Student("Raj", 22)
        );
        students.forEach(entry -> System.out.println(index.getAndIncrement() + " " + entry.name + " " + entry.rollNum));
    }
}

class Student {
    String name;
    int rollNum;
    Student(String name, int rollNum){
        this.name = name;
        this.rollNum = rollNum;
    }
}



