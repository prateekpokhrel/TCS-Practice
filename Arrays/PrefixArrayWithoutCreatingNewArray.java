import java.util.*;

public class PrefixArrayWithoutCreatingNewArray {

    public static void maxSubArraySum(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            int currSum = 0;

            for (int j = i; j < numbers.length; j++) {

                currSum += numbers[j];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 8, -1, 0};
        maxSubArraySum(numbers);
    }
}