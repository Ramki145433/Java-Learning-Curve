package Collections;
interface Animal{
    public void play();
}
interface pet{
    public void run();
}
// Multiple inheritance using interfaces
// Interface extends another interface
interface Dog extends Animal, pet{
    public void bark();
}
public class ImplementExtendsExample implements  Dog{
    public void bark() {
        System.out.println("Bark");
    }

    public void play() {
        System.out.println("Play");
    }

    public void run() {
        System.out.println("Run");
    }

    public static void main(String[] args) {
        ImplementExtendsExample eg = new ImplementExtendsExample();
        eg.bark();
        eg.play();
        eg.run();
    }
}
