package StreamsPractice;
import java.util.*;

public class StreamQuestions {
    public static void main(String[] args) {
        // Question 1
        List<String> employees = Arrays.asList("John", "Alexandra", "Ben", "David", "Smith" ,"Amy");
        employees.stream()
                .filter(entry -> entry.length() >= 5)
                .map(entry -> entry.toUpperCase())
                .sorted()
                .forEach(System.out :: println);
        // Question 2
        int [] numbers = {3, 6, 1, 8, 5, 10, 7};
        Arrays.stream(numbers).filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .sorted()
                .forEach(System.out :: println);

        long count = Arrays.stream(numbers).filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .sorted()
                .count();
        System.out.println("Count of even numbers : " + count);

        // Filtering all the words started with specific char and reversing with length
        String sentence = "Iam learning java for springBoot just started off lot many things out there, wish me all the best";
        String sen = "Our channel provides amazing content for automation and java";
        Arrays.stream(sen.split(" "))
                .filter(word -> word.toLowerCase().startsWith("a"))
                .map(word -> new StringBuilder(word).reverse() + " " + word.length())
                .sorted()
                .forEach(System.out::println);

        //
        List<Employee> employees1 = Arrays.asList(new Employee("Arjun", 28000),
                new Employee("Meera", 52000),
                new Employee("Rahul", 61000),
                new Employee("Divya", 47000),
                new Employee("Karan", 75000),
                new Employee("Neha", 82000)
        );
        employees1.stream()
                .filter(entry -> entry.Salary > 50000)
                .map(entry -> {
                    if(entry.Salary <= 75000) {
                        entry.Salary = 1.125 * entry.Salary;
                    } else {
                        entry.Salary = 1.1 * entry.Salary;
                    }
                    return entry;
                })
                .forEach(entry -> System.out.println(entry.name + " " + entry.Salary));
    }
}

class Employee{
    String name;
    double Salary;
    Employee(String name, double Salary){
        this.name = name;
        this.Salary = Salary;
    }
}