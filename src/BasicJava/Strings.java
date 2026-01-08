package BasicJava;

import java.util.*;

public class Strings {
    String str1 = "Ramki"; // momeory allocated in string pool
    String str2 = new String("Raju"); // memory allocated in heap memory
    String str3 = "Ramki";
    String str4 = new String("Raju");
    /*
        | Feature     | String Pool                            | Heap (new String)                 |
        | ----------- | -------------------------------------- | --------------------------------- |
        | Location    | Inside Heap (special area)             | Normal Heap area                  |
        | How created | By using **string literals**           | Using `new String()`              |
        | Reuse       | Reuses existing objects (saves memory) | Always creates a new object       |
        | Example     | `String s = "Hello";`                  | `String s = new String("Hello");` |
        | Equality    | Same literals → `== true`              | Always different → `== false`     |
    */
    public static String isomorphicStringCheck(String s1, String s2){
        int n1 = s1.length(); int n2 = s2.length();
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        if(n1 != n2) {
            return "Not - Isomorphic";
        }
        for (int i = 0; i < n1; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(map1.containsKey(c1)) {
                if(map1.get(c1) != c2) {
                    return "Not _ Isomorphic";
                }
            }
            else if (map2.containsKey(c2)) {
                if(map2.get(c2) != c1) {
                    return "Not _ Isomorphic";
                }
            }
            else {
                map1.put(c1, c2);
                map2.put(c2, c1);
            }
        }
        return "Isomorphic";
    }

    public static void fizzBuzz(int num){
        ArrayList<String> result = new ArrayList<>();
        for(int i = 1; i <= num; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        System.out.println(result);
    }

    public static char firstNonRepeatingCharacter(String str){
        int n = str.length();
        for (int i = 0; i < n; i++) {
            boolean isFound = false;
            for (int j = 0; j < n; j++) {
                if(i != j && str.charAt(i) == str.charAt(j)) {
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                return str.charAt(i);
            }
        }
        return '$';
    }

    public static boolean checkIfStringsAreRotationsToEachOther(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
//        int n = s1.length();
//        for( int i = 0; i < n; i++) {
//            if(s1.equals(s2))
//                return true;
//            char last = s1.charAt(n - 1);
//            s1 = last + s1.substring(0, n - 1);
//        }
//        return false;
        String combination = s1 + s2;
        return combination.contains(s2);
    }

    public static void reverseWordsInString(String sentence){
        List<String> strList = Arrays.asList(sentence.split("\\."));
        System.out.println(strList.reversed());
    }
    public static void checkPalindrome(String word){
        String lowerCase = word.toLowerCase();
        String reverseWord = new StringBuilder(lowerCase).reverse().toString();
        if(lowerCase.equals(reverseWord)){
            System.out.println(word +  " : Given Word Is Palindrome");
        }else {
            System.out.println(word +  " : Given Word Is Not Palindrome");
        }
    }

    public void uniqueCharsInString(String s){
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }

    public static void countVowels(String str){
        char[] strArr = str.toLowerCase().toCharArray();
        int count = 0;
        for(char chr : strArr){
            if("aeiou".indexOf(chr) != -1){
                count +=1;
            }
        }
        System.out.println("Count Of Vowels In The String : " + count);
    }

    public void reverseString(String name){
        String revStr = "";
        for (int j = name.length() - 1; j >= 0; j--){
//            revStr.concat(String.valueOf(name.charAt(j)));
            revStr += name.charAt(j);
        }
        System.out.println(revStr);
    }

    public boolean checkAnagrams(String wordOne, String wordTwo){
        if(wordOne.length() != wordTwo.length()){
            return false;
        }
        char [] wordOneArr = wordOne.toCharArray();
        char [] wordTwoArr = wordTwo.toCharArray();
        Arrays.sort(wordOneArr);
        Arrays.sort(wordTwoArr);
        return (Arrays.equals(wordOneArr, wordTwoArr));
    }


    public static void main(String[] args) {
        Strings obj1 = new Strings();
        System.out.println(obj1.str1 + " " + obj1.str2);
        System.out.println(obj1.str1 == obj1.str3);
        System.out.println(obj1.str2 == obj1.str4);
        /*
            If you want to compare address or reference you can use == operator,
            or if u want to compare content for two strings use equals method
        */
        System.out.println("Here we comparing strings : String Pool " + obj1.str1.equals(obj1.str3));
        System.out.println("Here we comparing strings : Heap Memory " + obj1.str2.equals(obj1.str4));

        // calling a method
        obj1.uniqueCharsInString("Banana");
        obj1.reverseString("Apple");
        System.out.println(obj1.checkAnagrams("listen", "silent"));
        System.out.println(obj1.checkAnagrams("Apple", "Index"));
        countVowels("developer");
        checkPalindrome("Madam");
        reverseWordsInString("i.like.this.program.very.much");
        System.out.println("Rotations : " + checkIfStringsAreRotationsToEachOther("aab", "aba"));
        System.out.println(firstNonRepeatingCharacter("developer"));
        fizzBuzz(20);
        System.out.println(isomorphicStringCheck("aab", "xyz"));
    }
}
