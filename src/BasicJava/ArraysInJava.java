package BasicJava;

import java.util.Arrays;
public class ArraysInJava {
    public static void main(String[] args) {
        //Initializing an Array
        int [] arr = {10, 20, 30, 40};
        int[] numbers = new int[2];
        numbers[0] = 11;
        numbers[1] = 12;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(numbers));
        //Accessing Elements
        System.out.println("Second Element " + arr[1]);
        //length is property not a method(.length() is for BasicJava.Strings)
        System.out.println("Last Element " + arr[arr.length - 1]);

        // Types of Arrays
        // Single - Dimensional Array
        int[] marks = {90, 80, 70};
        for (int num : marks){
            System.out.printf(num + " ");
        }

        // Multi Dimensional Array
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // Regular for loop
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
        // Enhanced for loop
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

        //Jagged Array (array of arrays with different length)
        int [][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[1];

        System.out.println("Deep to String " + Arrays.deepToString(jagged));

        // Copying Arrays
        int[] a = {1, 2, 3};
        int[] b = a; // reference copy (both point to same array)
        int[] c = a.clone();
        System.out.println(a + " " + c);

        //toString() → Print array in readable form
        //deepToString() → Print multi-dimensional arrays
        //sort() → Sort elements
        //binarySearch() → Search element (must be sorted)
        int[] sortedArr = {1, 2, 5, 9};
        int index = Arrays.binarySearch(sortedArr, 5);
        System.out.println(index); // 2

        //copyOf() / copyOfRange() → Copy arrays
        int[] cArr = {1, 2, 3, 4};
        int[] copy = Arrays.copyOf(cArr, 2); // [1, 2]
        int[] range = Arrays.copyOfRange(cArr, 1, 3); // [2, 3]

        //equals() → Compare arrays
        int[] x = {1, 2, 3};
        int[] y = {1, 2, 3};
        System.out.println(Arrays.equals(x, y)); // true

        //fill() => Fill array with values
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 5);
        System.out.println(Arrays.toString(fillArray));

        //stream() (Java 8+) → Convert array to stream
        int[] streamArr = {1, 2, 3};
        Arrays.stream(streamArr).forEach(System.out::println);

    }}
