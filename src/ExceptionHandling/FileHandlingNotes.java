package ExceptionHandling;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileHandlingNotes {
    public static void fileReadingUsingBufferReader() throws IOException {
        File file = new File("./sample.txt");
        if(!file.exists()) {
            file.createNewFile();
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String str = new String();
        String line = new String();
        while ((line = br.readLine()) != null) {
            str += line + "\n";
        }
        System.out.println(str);
        fr.close();
        br.close();
    }
    public static void fileReadingUsingScanner() throws IOException {
        File file = new File("./sample.txt");
        if(!file.exists()) {
            file.createNewFile();
        }
        // you can also provide fileInputStream instance to scanner class
        FileInputStream fis = new FileInputStream(file);
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
    public static void fileReadingUsingFIS() throws IOException {
        File file = new File("./sample.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileInputStream fis = new FileInputStream(file);
        int asciiNum;
        while ((asciiNum = fis.read()) != -1){
            System.out.print((char) asciiNum);
        }
        fis.close();
    }
    public static void main(String[] args) throws IOException {
        /*
            createNewFile
            delete
            exist
            hide
            readOnly
         */
        File file = new File("C:\\Users\\INJARAPU RAMAKRISHNA\\OneDrive\\Ramki\\TestFiles\\resume.txt");
        if(file.createNewFile()){
            System.out.println("File Successfully created");
        } else {
            System.out.println("File may be presented or facing a issue while creating");
        }
        // calling fileReading Function
//        fileReadingUsingFIS();
//        fileReadingUsingScanner();
//        fileReadingUsingBufferReader();
//        findingOccurrenceOfAGivenWord("backend");
    }
}
