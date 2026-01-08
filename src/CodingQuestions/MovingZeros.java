package CodingQuestions;

import java.util.Arrays;

public class MovingZeros {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,0,4};
        int j = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
