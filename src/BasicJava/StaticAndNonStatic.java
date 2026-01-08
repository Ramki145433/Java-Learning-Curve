package BasicJava;

public class StaticAndNonStatic {
    /*
        | Feature    | Static (class-level)   | Non-static (instance-level)  |
        | ---------- | ---------------------- | ---------------------------- |
        | Belongs to | Class                  | Object                       |
        | Memory     | Method Area            | Heap                         |
        | Access     | ClassName.methodName() | object.methodName()          |
        | Sharing    | Shared by all objects  | Each object has its own copy |
        | Example    | `Math.sqrt()`          | `s1.displayInfo()`           |

        Summary of execution Hierarchy
        1.Static blocks (only once, at class load time).
        2.Instance blocks (every time an object is created).
        3.Constructor (every time an object is created, after instance block).
        4.BasicJava.Methods (when explicitly called).
    */

    static String schoolName = "Ravindra Bharathi";
    int rollNumber;
    String name;
    // non-static block
//    {
//        System.out.println(rollNumber + " " + name + " from non-static block");
//    }
    // constructor
    StaticAndNonStatic(int num, String name){
        this.rollNumber = num;
        this.name = name;
        System.out.println("From Constructor");
    }
    {
        System.out.println(rollNumber + " " + name + " from non-static block");
    }
    //static block
    static {
        System.out.println(schoolName + " from static block");
    }
    public void display(){
        System.out.println(name + " is studying in " + schoolName + " school");
    }
    public static void main(String[] args) {
        /*
            if you execute this code without creating object, only static blocks executes
            because memory allocates in method area
        */
        // I'm creating object now
        StaticAndNonStatic obj1 = new StaticAndNonStatic(21, "Ramki");
//        StaticAndNonStatic obj2 = new StaticAndNonStatic(26, "Ram");
        // you can see in the console, 0 null from non-static block why because before executes constructor
        //jvm checks any non static blocks are there.
        obj1.display();
    }
}
