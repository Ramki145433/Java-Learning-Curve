package Inheritance;

public class Admin extends Developer{
    public void manage(){
        // Without creating object we can access the methods from super class
        // Using super you can access particular property from super class, still same method available in local.
        // Multiple inheritance is not possible in java using classes, only multi level you can do.
        super.read();
        write();
        System.out.println("Manage Access");
    }
    public void read(){
        System.out.println("Read Access For Admin");
    }
}
