package Interface;

public interface Laptop {
    public void copy();
    public void paste();
    public void cut();
    public void capture();
    // Implementation using default.
    public default void security(){
        System.out.println("Laptop Security Code");
        audio();
        commonCode();
    }

    public static void audio(){
        System.out.println("Laptop Audio Code");
        commonCode();
    }

    // Take a case where we have some implementation methods in interface that uses a common code.
    // In that case, we need this private method.
    private static void commonCode(){
        System.out.println("Laptop Common Code");
    }
}
