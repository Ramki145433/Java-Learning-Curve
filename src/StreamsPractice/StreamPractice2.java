package StreamsPractice;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamPractice2 {
    public void maxAndMinNumber(){
        List<Integer> numbers1 = Arrays.asList(9, 10, 12, 11, 32, 132);
        // max
        Integer maxElement = numbers1.stream()
                .reduce(0, Integer::max);
        System.out.println("Maximum : " + maxElement);
        // min
        Optional<Integer> minElement = numbers1.stream()
                .reduce(Integer::min);
        System.out.println("Minimum : " + minElement);
    }
    public void productAndSum(){
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer sum = numbers1.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        Integer product = numbers1.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);
        // sum of even numbers
        Optional<Integer> sumOfEven = numbers1.stream()
                .filter(num -> num % 2 == 0)
                .reduce(Integer::sum); // updated version
        sumOfEven.ifPresent(System.out::println);
    }
    public void countElements(){
        List<Integer> numbers1 = Arrays.asList(9, 10, 12, 11, 32, 132);
        long countOfElements = numbers1.stream()
                .filter(num -> num > 10)
                .count();
        System.out.println("Count of elements : " + countOfElements);
    }
    public void findfirstnumgreaterthenten(){
        List<Integer> numbers1 = Arrays.asList(9, 10, 12, 11, 32, 132);
        Optional<Integer> firstEle = numbers1.stream()
                .filter(num -> num > 100)
                .sorted()
                .findFirst();
        System.out.println(firstEle.get());
    }
    public static void main(String[] args) {
        // Even numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream = numbers.stream();
        List<Integer> evenNumbs =  stream.filter(num -> num % 2 == 0)
                .toList();
        System.out.println("Even numbers : " + evenNumbs);

        // Converting each element to squares
        List<Integer> squares =  numbers.stream().map(num -> num * num)
                .toList();
        System.out.println("Squares of each element : " + squares);

        // combining above operations at once
        List<Integer> squaresOfEvenNumbs =  numbers.stream()
                .filter(num -> num % 2 ==0)
                .map(num -> num * num)
                .toList();
        System.out.println("squaresOfEvenNumbs : " + squaresOfEvenNumbs);

        StreamPractice2 obj1 = new StreamPractice2();
        obj1.findfirstnumgreaterthenten();
        obj1.countElements();
        obj1.productAndSum();
        obj1.maxAndMinNumber();
    }
}