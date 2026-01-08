package StreamsPractice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysToCreateStream {
    public static void main(String[] args) {
        List<String> names =  Arrays.asList("Alice", "Bob", "Cris");
        // 1. List -> Stream
        Stream<String> stream = names.stream();

        String [] arr = {"Java", "Python", "JS"};
        // 2. Array -> Stream
        Stream<String> stream1 = Arrays.stream(arr);

        // 3. Stream of
        Stream<Integer> integerStream = Stream.of(1,2,3,4);

        // 4. Stream generate
        Stream<Double> limit = Stream.generate(Math::random).limit(5);

    }
}