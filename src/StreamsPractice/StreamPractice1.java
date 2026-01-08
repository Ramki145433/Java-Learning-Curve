package StreamsPractice;
import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice1 {
    public static void main(String[] args) {
        List <Integer> numbers = List.of(1,3,5,6,7,8,9);
        numbers.stream() // Creating Stream Source
                .filter(num -> num % 2 == 0)
                .sorted(Comparator.reverseOrder()) // Intermediate Operations
                .forEach(System.out :: println); // Terminal Operations
        // Count intermediate Operation
        long count = numbers.stream()
                .filter(num -> num % 2 == 0)
                .count();
        System.out.println("Even numbers count : " + count);
        // Map
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .sorted()
                .forEach(System.out :: println);

        List<Integer> result =  numbers.stream().filter(ele -> ele%2 == 0)
                .toList();
        System.out.println("Using Collectors : " + result);
    }
}