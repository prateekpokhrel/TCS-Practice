public class NiceSubArray{

    public int numberOfSubarrays(int[] nums, int k) 
    {
     int[] freq = new int[nums.length + 1];
        freq[0] = 1;

        int odd = 0;
        int ans = 0;

        for (int num : nums) {
            if (num % 2 != 0)
                odd++;

            if (odd >= k)
                ans += freq[odd - k];

            freq[odd]++;
        }

        return ans;
    }
    public static void main(String[] args) {
    int nums[] = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
    int k = 2;

    NiceSubArray obj = new NiceSubArray();

    System.out.println(obj.numberOfSubarrays(nums, k));
}}