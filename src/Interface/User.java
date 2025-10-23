package Interface;

public class User {
    public static void main(String[] args) {
//        Lenovo lenovo = new Lenovo();
//        lenovo.copy();
//        lenovo.paste();
//        lenovo.cut();
//        lenovo.capture();
//        lenovo.playMusic();
//        Laptop.audio(); // Accessing directly by Interface, because its a static method.
//      Laptop.commonCode(); we cant access this method because this is private method.
        ExtendsAbsClass obj1 = new ExtendsAbsClass();
        obj1.cut();
        obj1.capture();
        obj1.paste();
        obj1.copy();
        obj1.security();
    }
}
