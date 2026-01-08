package StreamsPractice;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPractice3 {
    public void findDistinctElements(List<Integer> numbers){
        // Using distinct intermediate operation
        List<Integer> distinctElements = numbers.stream()
                .distinct()
                .toList();
        System.out.println("Distinct Elements : " + distinctElements);
    }
    public void averageOfList(List<Integer> numbers){
        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Average Of Numbers : " + avg);
    }
    public void sortAscAndDesc(List<Integer> numbers){
        // asc
        List<Integer> ascOrder = numbers.stream()
                .distinct()
                .sorted()
                .toList();
        List<Integer> descOrder = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Asc Order : " + ascOrder);
        System.out.println("Desc Order : " + descOrder);
    }
    public void joinAllStrings(List<String> names){
        String joinByComma = names.stream()
                .collect(Collectors.joining(",","{","}"));
        System.out.println(joinByComma);
    }
    public void checkAllPositive(List<Integer> numbers){
        boolean isMatch = numbers.stream()
                .allMatch(num -> num > 0);
        System.out.println("is all are positive : " + isMatch);
        boolean b = numbers.stream()
                .noneMatch(num -> num < 0);
        System.out.println(b);
    }
    public void checkAnyNumDivisibleBy(List<Integer> numbers){
        boolean b = numbers.stream()
                .anyMatch(num -> num % 3 == 0);
        System.out.println(b);
    }
    public void flatListOfLists(List<List<Integer>> listOfLists){
        List<Integer> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(flatList);
    }
    public void findSecondHighes(List<Integer> numbers){
        // using skip we can skip elements as you want
        Optional<Integer> secondHighestNum = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondHighestNum);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 4, 3, 2, 4, 6, 7);
        List<String> names = Arrays.asList("Ram", "Raj", "Naveen");
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(6, 7));
        StreamPractice3 obj1 = new StreamPractice3();

        obj1.findDistinctElements(numbers);
        obj1.averageOfList(numbers);
        obj1.sortAscAndDesc(numbers);
        obj1.joinAllStrings(names);
        obj1.checkAllPositive(numbers);
        obj1.checkAnyNumDivisibleBy(numbers);
        obj1.flatListOfLists(listOfLists);
        obj1.findSecondHighes(numbers);
    }
}
