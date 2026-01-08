package StreamsPractice;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice4 {
    // Level is going to be intermediate
    public void sortWorkersBySalary(List<Worker> workers){
        List<Worker> sortedListAsc = workers.stream()
                .sorted(Comparator.comparing(Worker::getSalary))
                .toList();
        System.out.println(sortedListAsc);
        List<Worker> sortedListDesc = workers.stream()
                .sorted(Comparator.comparing(Worker::getSalary).reversed())
                .toList();
        System.out.println(sortedListDesc);
    }

    public void averageAgeOfWorkers(List<Worker> workers){
        OptionalDouble average = workers.stream()
                .mapToInt(Worker::getAge)
                .average();
        average.ifPresent(System.out::println);
    }

    public void partitionByEvenAndOdd(List<Integer> numbers){
        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("Even numbers : " + result.get(true));
        System.out.println("Odd numbers : " + result.get(false));
    }

    public void groupingByStringLength(List<String> words){
        Map<Integer, List<String>> result = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }

    public void countOccurrences(List<String> fruits){
        Map<String, Long> collect = fruits.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    public void findAvgSalaryByDepartment(List<Worker> workers){
        Map<String, Double> avgSalary = workers.stream()
                .collect(Collectors.groupingBy(Worker::getDepartment, Collectors.averagingDouble(Worker::getSalary)));
        System.out.println(avgSalary);
    }
    public static void main(String[] args) {
        List<Worker> workers = Arrays.asList(
                new Worker(101, "John", 50000, 35, "HR"),
                new Worker(102, "Alice", 70000, 38, "Finance"),
                new Worker(103, "Bob", 45000, 45, "HR"),
                new Worker(104, "David", 90000, 55, "Finance")
        );
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("Apple", "Bat", "Cat", "Dark", "Eagle", "Fish");
        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "Apple", "Banana", "Orange");
        StreamPractice4 obj1 = new StreamPractice4();
        obj1.sortWorkersBySalary(workers);
        obj1.averageAgeOfWorkers(workers);
        obj1.partitionByEvenAndOdd(numbers);
        obj1.groupingByStringLength(words);
        obj1.countOccurrences(fruits);
        obj1.findAvgSalaryByDepartment(workers);

        Map<String, List<Worker>> res = workers.stream()
                .collect(Collectors.groupingBy(Worker::getDepartment));
        System.out.println("Dept : " + res);

        Map<String, Long> res2 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getDepartment, Collectors.counting()));
        System.out.println(res2);

        Map<String, Double> res3 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getDepartment, Collectors.summingDouble(Worker::getSalary)));
        System.out.println(res3);

        Map<String, Double> res4 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getDepartment, Collectors.averagingDouble(Worker::getSalary)));
        System.out.println(res4);

        // count occurrences of each char in Word.
        String str = "Delicious";
        Map<String, Long> alphaCount = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println(alphaCount);

        Map<Character, Integer> map1 = new LinkedHashMap<>();
        for(Character ch : str.toCharArray()) {
            map1.put((Character) ch , map1.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map1);
    }
}