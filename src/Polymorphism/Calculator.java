package Polymorphism;

public class Calculator {
    // Method Overloading
    public void add(int a, int b){
        System.out.println(a + b);
    }
    public void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
    public void add(int x, String s){
        System.out.println(x + " " + s);
    }
    public void division(){
        System.out.println("Division Code");
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(2, 3);
        cal.add(2, 3, 4);
        cal.add(5, "Ram");
    }
}
