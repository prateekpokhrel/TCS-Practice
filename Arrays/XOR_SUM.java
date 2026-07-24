public class XOR_SUM {
    public static int xorSum(int k, int arr[])
    {
        int maxXorSum = 0;
        for(int num :arr)
        {
            maxXorSum += num;
        }
        for(int i =1; i < k; i++)
        {
            int sum =0;
            for(int num : arr)
            {
                sum += (i ^ num);
            }
            if(sum > maxXorSum)
            {
                maxXorSum = sum;
            }
        }
        return maxXorSum;
    }
    public static void main(String[] args)
    {
        int n =4;
         int k =9;
         int arr[] = { 7, 4, 0, 3};
        
         System.out.println(xorSum(k, arr));
    }
    
}
