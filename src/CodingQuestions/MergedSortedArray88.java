package CodingQuestions;

import java.util.Arrays;

public class MergedSortedArray88 {
    public static void getResult(int[] nums1, int[] nums2, int n, int m){
        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;
        while (i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else{
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
//        int x = 0;
//        int y = m;
//        while(x < m) {
//            nums1[y++] = nums2[x++];
//        }
//        Arrays.sort(nums1);
//        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int[] nums1= {1, 2, 3, 0, 0, 0};
        int[] nums2 = {3, 5, 1};
        int n = 3;
        int m = 3;
        MergedSortedArray88.getResult(nums1, nums2, n, m);
    }
}
