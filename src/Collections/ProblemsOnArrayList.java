package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemsOnArrayList {
    public static void mergeTwoLists(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> mergeList = new ArrayList<>(arr1);
        for (int num : arr2){
            if(!mergeList.contains(num)){
                mergeList.add(num);
            }
        }
        System.out.println("Mergelist without duplicates : " + mergeList);
    }

    public static int findLength(String sentence){
        String[] sentenceList = sentence.split(" ");
        ArrayList<String> aa = new ArrayList<>(Arrays.asList(sentenceList));
        return aa.getLast().length();
    }

    public static void rotationByK(ArrayList<Integer> arr, int k){
        int n = arr.size();
        if (n == 0) return;
        k = k % n;
        if (k == 0) return;
        ArrayList<Integer> endPart = new ArrayList<>(arr.subList(n - k, n));
        List<Integer> firstpart = new ArrayList<>(arr.subList(0, n - k));

        arr.clear();
        arr.addAll(endPart);
        arr.addAll(firstpart);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(3,4,5,6,7));
        int k = 2;
        System.out.println("Before rotating the array ; " + arr);
        rotationByK(arr, k);
        System.out.println("After rotating the array by k rotations : " + arr);
        System.out.println(arr.toString());
        String sentence = "Hi my name is Ramki";
        System.out.println("Length of the last element : " + findLength(sentence));
        mergeTwoLists(arr1, arr2);
    }
}
