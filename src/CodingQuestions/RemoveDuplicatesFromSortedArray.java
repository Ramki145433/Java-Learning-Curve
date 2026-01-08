package CodingQuestions;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] arr = {21,35,35,47,47,56,58};
        int j = 0;
        int temp;
        for (int i = 1; i < arr.length; i++) {
            if(arr[j] != arr[i]) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int subArr [] = Arrays.copyOfRange(arr, 0, j+1);
        System.out.println(Arrays.toString(subArr));
    }
}
