package ExceptionHandling;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AssignmentOnFiles {
    public static void countingNoOfLinesInTextFile() throws IOException {
        File file = new File("./sample.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        Scanner sc = new Scanner(file);
        int count = 0;
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
            count += 1;
        }
        System.out.println(count);
    }
    public static void findingLengthyLineInTextFile() throws IOException {
        File file = new File("./sample.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        Scanner sc = new Scanner(file);
        int count = Integer.MIN_VALUE;
        String str = "";
        String maxLine = "";
        while (sc.hasNextLine()) {
            str = sc.nextLine();
            if(str.length() > count) {
                count = str.length();
                maxLine = str;
            }
        }
        System.out.println(maxLine + " : " + count);
    }
    public static void findingWordCountInTextFile() throws IOException {
        File file = new File("./sample.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        Scanner sc = new Scanner(file);
        int wordsCount = 0;
        while (sc.hasNextLine()) {
            List<String> list = Arrays.asList(sc.nextLine().split(" "));
            wordsCount += list.size();
        }
        System.out.println("Words Count : " + wordsCount);
    }
    public static void findingOccurrenceOfAGivenWord(String word) throws IOException {
        File file = new File("./sample.txt");
        if(!file.exists()) {
            file.createNewFile();
        }
        Scanner sc = new Scanner(file);
        int wordCount = 0;
        while (sc.hasNextLine()) {
            List<String> strList = Arrays.asList(sc.nextLine().split(" "));
            for (String str : strList) {
                if(str.equals(word)){
                    wordCount += 1;
                }
            }
        }
        System.out.println("Given Word Count : " + wordCount);
    }
    public static void main(String[] args) throws IOException {
//        countingNoOfLinesInTextFile();
//        findingLengthyLineInTextFile();
//        findingWordCountInTextFile();
        findingOccurrenceOfAGivenWord("backend");
    }
}
