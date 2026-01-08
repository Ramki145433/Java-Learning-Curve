package Lambda;
import java.util.*;
public class MethodReferencePractice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        // Reference to a static method
        list.forEach(MethodReferencePractice::greet);
        // Reference to an Instance Method of a particular obj (for non static method we need to create a obj)
        list.forEach(new MethodReferencePractice() :: show);
    }
    public static void greet(int num){
        System.out.println("Hello my roll number is " + num);
    }
    public void show(int num){
        System.out.println("My number is " + num);
    }
}
