package CodingQuestions;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 5, 10};
        int n = arr.length;
        int[] res = new int[n];
        int left = 0, right = n - 1;
        for(int i = n - 1; i >= 0; i--) {
            if(Math.abs(arr[right]) > Math.abs(arr[left])) {
                res[i] = arr[right] * arr[right];
                right --;
            } else {
                res[i] = arr[left] * arr[left];
                left ++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
