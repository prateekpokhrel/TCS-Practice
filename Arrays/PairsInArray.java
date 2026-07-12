public class PairsInArray {
    public static void pairsArray(int numbers[])
    {   int totalPairs =0;
        for(int i=0; i < numbers.length; i++)
        {
            int curr = numbers[i];
        for(int j=i+1; j < numbers.length; j++)
        {
          System.out.print( "(" + curr + "," + numbers[j] + ")");
          totalPairs++;
        }
        System.out.println();
        }
        System.out.println("Total Pairs: " +totalPairs);
    }

    public static void main(String[] args) {
        int numbers[] ={2, 3, 4, 10};
        pairsArray(numbers);

        
    }
    
}
