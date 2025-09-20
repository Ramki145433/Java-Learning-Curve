public class Loops {
    public static void main(String[] args) {
        // 1. For Loop
        int num = 5;
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " ith iteration");
        }
        //while loop
        while (num > 1) {
            System.out.println(num + " while iteration");
            num--;
        }
        //Do while
        int k = 1;
        do {
            System.out.println(k + " do iteration");
            k++;
        }while (k < 5);
        // for each loop
        int[] array = {10, 20, 30, 40, 50};
        for(int a : array){
            System.out.println(a + " array iteration");
        }
    }
}