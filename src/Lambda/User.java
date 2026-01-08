package Lambda;
import java.util.*;
public class User {
    public static void main(String[] args) {
//        Car c1 = new Car() {
//            @Override
//            public void ride() {
//                System.out.println("User Riding");
//            }
//        };
//        c1.ride();
//        c1.sound();
//        Car.accelerate();
        // (arguments) -> {function body}
        Car c2 = (int s) -> System.out.println(s > 100 ? "Danger" : "Ok");
        c2.ride(100);

        Bus b1 = (s) -> s;
        System.out.println(b1.drivingSpeed(90));

    }
}
