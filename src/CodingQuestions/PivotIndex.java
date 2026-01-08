package CodingQuestions;
import java.util.Arrays;
public class PivotIndex {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 2, 1};
        int totalSum = Arrays.stream(arr).sum();
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum) {
                System.out.println("Pivot Index : " + i);
                break;
            }
            leftSum += arr[i];
        }
    }
}
