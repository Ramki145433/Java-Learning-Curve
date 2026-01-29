package StreamsPractice;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice5 {
    public void findTheMostCommonFirstLetterAmongAllEmployeeNames(List<Worker> workers){
        Map.Entry<Character, Long> characterLongEntry = workers.stream()
                .map(Worker::getName)
                .toList()
                .stream().collect(Collectors.groupingBy(e -> e.charAt(0), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(characterLongEntry);
    }
    public void slidingWindowAverage(List<Integer> input,  int windowSize){
        List<Double> list = IntStream.range(0, input.size() - (windowSize - 1)).mapToObj(i -> input.subList(i, i + windowSize))
                .map(window -> window.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0)
                ).toList();
        System.out.println(list);
    }
    public void findMostThreeFrequentWordsInSentence(String str){
        Stream<String> stream = Arrays.stream(
                str.toLowerCase()
                        .replaceAll("[^a-z\\s]", "")
                        .split(" ")
        );
        Map<String, Long> collect = stream.collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        ));
        System.out.println(collect);

        List<Map.Entry<String, Long>> list = collect.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .toList();
        System.out.println(list);
    }
    public void checkPrime(int num){
        boolean b = IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(i -> num % i == 0);
        System.out.println("Is this number " + num + " prime number : " + b);
    }
    public static void main(String[] args) {
        List<Worker> workers = Arrays.asList(
                new Worker(101, "John", 50000, 35, "HR"),
                new Worker(102, "Alice", 70000, 38, "Finance"),
                new Worker(103, "Job", 45000, 45, "HR"),
                new Worker(104, "David", 90000, 55, "IT"),
                new Worker(105, "Join", 56000, 35, "HR"),
                new Worker(106, "France", 72000, 38, "IT"),
                new Worker(107, "Gangster", 49000, 45, "IT"),
                new Worker(108, "Aero", 91000, 55, "Finance")
        );
        StreamPractice5 obj1 = new StreamPractice5();
        obj1.findTheMostCommonFirstLetterAmongAllEmployeeNames(workers);

        List<Integer> input = Arrays.asList(2, 3, 4, 5, 6, 7);
        int windowSize = 4;
        obj1.slidingWindowAverage(input, windowSize);

        String str = "Java is great language, java streams are very useful, java is used in wide variety!";
        obj1.findMostThreeFrequentWordsInSentence(str);

        obj1.checkPrime(7);
    }
}