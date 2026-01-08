package BasicJava;

public class ConstructorPractice {
    private int a;
    public ConstructorPractice(){
        this.a = 55;
        System.out.println(a);
    }
    public ConstructorPractice(int num){
        this.a = num;
        System.out.println("Number value : " + num);
    }
    public int getA(){
        return a;
    }
    public static void main(String[] args) {
        ConstructorPractice obj1 = new ConstructorPractice(77);
        ConstructorPractice onj1 = new ConstructorPractice();
        System.out.println(onj1.getA());
    }
}
