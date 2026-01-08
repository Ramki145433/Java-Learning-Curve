package BasicJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 30;
        System.out.println(x + y + z);
        float f;
        f = x;
        System.out.println("floatValue " +  f); // example for widening
        double d = 9.645;
        int narrow = (int)d;
        System.out.println("double to int " + narrow); // example for narrowing
        System.out.println("Hello, Welcome to Java");

        // Taking input from user using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Your age is : " + age);

        //Block
        {
            System.out.println("Iam running inside the block");
        }
    }
}