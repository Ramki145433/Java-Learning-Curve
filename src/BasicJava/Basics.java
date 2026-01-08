package BasicJava;

public class Basics {
    public static void main(String[] args) {
        //BasicJava.Basics of java from GFG
        //Data types
        /*
        In Java, data types specify the type of values a variable can hold. They define the size, range and nature of data stored in memory. Java has two main categories of data types:
        Primitive: byte, short, int, long, float, double, char, boolean
        Non-Primitive: String, Arrays, Classes, Interfaces, Objects
        */
        // ----Primitive Data Types
        byte b = 100;              // 1 byte
        short s = 30000;           // 2 bytes
        int i = 100000;            // 4 bytes
        long l = 10000000000L;     // 8 bytes

        float f = 3.14f;           // 4 bytes
        double d = 3.14159265359;  // 8 bytes

        char c = 'A';              // 2 bytes (Unicode character)
        boolean flag = true;       // 1 bit

        // -------- Non-Primitive Data Types --------
        String str = "Hello, Java"; // String (class in Java)
        int[] arr = {1, 2, 3, 4, 5}; // Array
        Integer wrapperInt = Integer.valueOf(50); // Wrapper class example
        StringBuilder sb = new StringBuilder("Java"); // Class object

        // -------- Output --------
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " "); // without new line
        }
        System.out.println();
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("StringBuilder: " + sb);
    }
}
