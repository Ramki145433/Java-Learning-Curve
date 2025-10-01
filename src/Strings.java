import java.util.Arrays;

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
    public void uniqueCharsInString(String s){
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                res += s.charAt(i);
            }
        }
        System.out.println(res);
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
    }
}
