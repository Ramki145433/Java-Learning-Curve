package Lambda;

@FunctionalInterface
public interface Car {
    void ride(int speed);
    default void sound(){
        System.out.println("Pls Sound");
    }
    private void brake(){
        System.out.println("Braking");
        accelerate();
    }
    static void accelerate(){
        System.out.println("Accelerate");
    }
}
