import java.util.Arrays;

class Student{
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Student{roll_no : " + roll_no + ", name : '" + name + "'}";
//    }
}

public class ArrayOfObjectsInJava {
    public static void main(String[] args) {
        Student obj1 = new Student(20, "Ram");
        System.out.println(obj1);
//        Student [] arr;
//        arr = new Student[3];
//        arr[0] = new Student(1, "Aman");
//        arr[1] = new Student(2, "Ramki");
//        arr[2] = new Student(3, "Sai");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Element at " + i + " : { "
//                    + arr[i].roll_no + " "
//                    + arr[i].name+" }");
//        }
    }
}
