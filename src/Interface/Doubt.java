package Interface;

@FunctionalInterface
interface A{
    void show();
    default void commonMethod(){
        System.out.println("CM calling from interface");
    }
}
class B implements A{
    public void show(){
        System.out.println("Showing from implement class B");
    }
    // Extra method in B
    public void display(){
        System.out.println("Displaying from B class");
    }
    public void commonMethod(){
        System.out.println("CM calling from class B");
    }
}

public class Doubt {
    public static void main(String[] args) {
        /*
            | Reference Type | Object Type | Allowed Methods     | Notes                |
            | -------------- | ----------- | ------------------- | -------------------- |
            | `B`            | `B`         | All methods in `B`  | Full access          |
            | `A`            | `B`         | Only methods in `A` | Runtime polymorphism |
         */
        B obj1 = new B(); // reference to B
        A obj2 = new B(); // reference to A (interface)
        obj1.show();
        obj2.show();
        obj1.display();
        obj2.commonMethod();
//      obj2.display(); compilation error because display method is not there in A interface.
    }
}
