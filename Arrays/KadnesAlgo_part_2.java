import java.util.*;

public class KadnesAlgo_part_2 {

    public static void kadanes(int numbers[]) {

        int currSum = numbers[0];
        int maxSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            currSum = Math.max(numbers[i], currSum + numbers[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum Sum = " + maxSum);
    }

    public static void main(String[] args) {

        int numbers[] = {-5, -2, -8, -1};
        kadanes(numbers);
    }
}