package CodingQuestions;

public class sumOfSquaresOfNumbers {
    public static boolean question(int c){
        long left = 0;
        long right = (long) Math.sqrt(c);
        while (left <= right) {
            long sum = left * left + right * right;
            if(sum > c) {
                right --;
            } else if (sum < c) {
                left ++;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(sumOfSquaresOfNumbers.question(5));
    }
}
