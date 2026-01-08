package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalInStream {
    /*
        Optional represents “value may or may not exist” and Streams use it to safely handle empty results instead of returning null.
        | Method          | Purpose                 |
        | --------------- | ----------------------- |
        | `isPresent()`   | Check value exists      |
        | `isEmpty()`     | Check no value          |
        | `get()`         | Get value (⚠ risky)     |
        | `orElse()`      | Default value           |
        | `orElseGet()`   | Lazy default            |
        | `orElseThrow()` | Throw exception         |
        | `ifPresent()`   | Execute if value exists |

    */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Cris", "David");
        // Use Case 1: findFirst()
        // Actually there is no word in list starts with Z, so optional object comes into picture. It gives empty in this scenario.
        Optional<String> word = names.stream()
                .filter(name -> name.startsWith("Z"))
                .findFirst();
        System.out.println(word);
        // possible outcome;
        // Value present → "Zeeshan"
        // Value absent → Optional.empty()

        //Handling (it prints if value present or else not)
        word.ifPresent(System.out::println);

        // Use Case 2: Safe Default Value (orElse)
        // If values is not presented in the list we are consoling default name.
        String defaultName = names.stream()
                .filter(name -> name.startsWith("Z"))
                .findFirst()
                .orElse("Default Name");
        System.out.println(defaultName);
    }
}