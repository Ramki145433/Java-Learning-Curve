package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionNotes {
    public static void fileReader() throws FileNotFoundException {
        File file = new File("C:\\Users\\INJARAPU RAMAKRISHNA\\Downloads\\iram_accessKeys (1).csv");
        FileInputStream fis = new FileInputStream(file);
        System.out.println(fis);
    }
    public static void multiCatchDemo(){
        try {
            int arr [] = new int[3];
            arr[6] = 10;
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        } catch (IndexOutOfBoundsException ibe) {
            System.out.println(ibe.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void nestedTryDemo() {
        try {
            try {
                int res = 10 / 0;
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
            }
            int arr[] = new int[5];
            arr[10] = 100;
        } catch (IndexOutOfBoundsException ibe) {
            System.out.println(ibe.getMessage());
        }
    }
    public static void validateVote(int age){
        if(age < 18) {
            throw new ArithmeticException("Not Eligible To Vote");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Program execution started");
        int numerator = 10;
        int denominator = 0;
        int result = 0;
        try{
            result = numerator / denominator;
        }
        catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
//            throw ae;
        }
        finally {
            System.out.println("Finally block runs");
        }
        System.out.println("Output : " + result);
        System.out.println("Program execution end");
        fileReader();
        multiCatchDemo();
        nestedTryDemo();
        validateVote(15);
    }
}
