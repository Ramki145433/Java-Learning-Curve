package BasicJava;

public class Variables {
    /*
        BasicJava.Variables are containers to store data in memory. Each variable has a name, type and value. It is the basic unit of storage in a program. Java has 4 types of variables.
        Local BasicJava.Variables: Declared inside a method, constructor, or block. Accessible only within that block.
        Instance BasicJava.Variables: Declared inside a class but outside any method. Each object of the class has its own copy.
        Static BasicJava.Variables: Declared with the static keyword inside a class. Shared by all objects of the class.
        Final BasicJava.Variables: Declared with final keyword. Value cannot be changed once assigned

        | Feature           | Instance Variable                      | Static Variable                   |
        | ----------------- | -------------------------------------- | --------------------------------- |
        | Belongs to        | Object (instance of class)             | Class itself                      |
        | Memory Allocation | Created each time an object is created | Single copy shared by all objects |
        | Accessed By       | Through object reference               | Class name (preferred) or object  |
        | Lifetime          | Exists as long as the object exists    | Exists till the program ends      |
        | Example Usage     | rollNo, name of student                | college name, company name        |

    */

    // Instance variable (belongs to each object)
    int instanceVar = 10;
    int rollNo;
    String name;
    // Static variable (shared across all objects of the class)
    static String staticVar = "Iam Static";
    static String college = "ABC University";

    //Constructor
    Variables(int r, String n) {
        rollNo = r;
        name = n;
    }
    // Method to show message using roll number and name
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    //Method means function showVariables

    public void showVariables() {
        // Local variables (declared inside a method)
        int localVar = 5;
        System.out.println("Instance Variable : " + instanceVar);
        System.out.println("Static Variable : " + staticVar);
        System.out.println("Local Variable : " + localVar );
    }

    public static void main(String[] args) {
        // Creating Object from BasicJava.Variables class
        Variables obj1 = new Variables(21, "Rama");
        Variables obj2 = new Variables(23, "Manasa");
        obj1.display();
        obj2.display();
        obj1.showVariables();
        // Accessing static variable directly using class name
        System.out.println("Accessing Static Variable via class: " + Variables.staticVar);
    }

}
