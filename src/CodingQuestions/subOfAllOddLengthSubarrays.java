package CodingQuestions;

import java.util.Arrays;

public class subOfAllOddLengthSubarrays {
    public static int result(int[] arr){
        int sum = 0;
        // The below approach time complexity is O(n^3) this is worst
//        for (int i = 1; i <= arr.length; i++) {
//            if(i % 2 != 0) {
//                for (int j = 0; j < arr.length - i + 1; j++) {
//                    int[] subArray = Arrays.copyOfRange(arr, j, i + j);
//                    for (int num : subArray) {
//                        sum += num;
//                    }
//                }
//            }
//        }
        // Optimized solution
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            // (i + 1) refers to starts positions
            // (n - i) refers to end positions
            int totalSubArraysThatContainCurrentElement = (i + 1) * (n - i);
            int totalOddSubArrays = (totalSubArraysThatContainCurrentElement + 1) / 2;
            sum += arr[i] * totalOddSubArrays;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(subOfAllOddLengthSubarrays.result(arr));
    }
}
