package BasicJava;

public class Methods {
    /*
        Java BasicJava.Methods are blocks of code that perform a specific task.
        A method allows us to reuse code, improving both efficiency and organization.
        All methods in Java must belong to a class. BasicJava.Methods are similar to functions and expose the behavior of objects.
    */
    //Method (instance method)
    public void greet(String name){
        System.out.println("Hi, Hello " + name);
    }
    /*
        Different ways to create a java method
        1. Instance Method
            Access the instance data using the object name. Declared inside a class.
        2. Static Method
            Access the static data using class name. Declared inside class with static keyword.
    */
    static String wish(String wisher){
        return "Hello " + wisher;
    }
    // See getters and setters
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int bal) {
        balance += bal;
        System.out.println("Current balance after set, " + balance);
    }

    public static void main(String[] args) {
        Methods obj1 = new Methods();
        obj1.greet("Ram");
        System.out.println(Methods.wish("Santosh"));
        System.out.println(obj1.getBalance());
        obj1.setBalance(310);
    }
}
