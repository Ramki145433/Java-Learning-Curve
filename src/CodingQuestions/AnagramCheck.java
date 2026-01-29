package CodingQuestions;

import java.util.Arrays;

public class AnagramCheck {
    public static boolean getResult(String str1, String str2) {
        int[] arr = new int[26];
        if(str1.length() != str2.length()) return false;
        // Other way of writing
//        for (char ch : str1.toLowerCase().toCharArray()) {
//            arr[ch - 'a']++;
//        }
        for (int ch : str1.toLowerCase().toCharArray()) {
            arr[ch - 97]++;
        }
        for (int ch : str2.toLowerCase().toCharArray()) {
            arr[ch - 97]--;
        }
        for (int num : arr) {
            if(num != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "silenb";
        String str2 = "listen";
        System.out.println(AnagramCheck.getResult(str1, str2));
    }
}
