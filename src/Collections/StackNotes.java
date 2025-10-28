package Collections;
import java.util.Stack;
public class StackNotes {
    public static void main(String[] args) {
        /*
            *In Java, a Stack is a linear data structure that follows the Last In First Out (LIFO)
            *principle and is defined in the java.util package. Internally, it extends the Vector class.
        */
        Stack<String> stack = new Stack<>();
        stack.push("Ram");
        stack.push("Sai");
        stack.push("Raju");
        stack.push("Raj");
        System.out.println("Initial stack : " + stack);
        String popped = stack.pop();
        System.out.println("popped element : " + popped);
        System.out.println("After popping : " + stack);
        System.out.println("Checking the stack is having elements : " + stack.isEmpty());
        while (!stack.isEmpty()){
            stack.pop();
        }
    }
}
