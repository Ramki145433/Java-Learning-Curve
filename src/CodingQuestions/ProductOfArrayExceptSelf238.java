package CodingQuestions;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {
    public static int[] getResult(int[] arr) {
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        int[] res = new int[arr.length];
        prefix[0] = 1;
        suffix[arr.length - 1] = 1;
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }
        for (int j = arr.length - 2; j >= 0; j--) {
            suffix[j] = suffix[j + 1] * arr[j + 1];
        }
        for (int k = 0; k < arr.length; k++) {
            res[k] = prefix[k] * suffix[k];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(ProductOfArrayExceptSelf238.getResult(arr1)));
        System.out.println(Arrays.toString(ProductOfArrayExceptSelf238.getResult(arr2)));
    }
}