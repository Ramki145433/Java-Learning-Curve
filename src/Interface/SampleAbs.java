package Interface;

public abstract class SampleAbs implements Laptop{
    // Abs class with not fully implements the Laptop Interface.
    public void copy() {
        System.out.println("Copy Code From Abs Class");
    }

    public void paste(){
        System.out.println("Paste Code From Abs Class");
    }

    public abstract void capture();

    public abstract void cut();
}
