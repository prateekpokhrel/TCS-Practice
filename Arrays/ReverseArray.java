public class ReverseArray {
    //new function
    public static void reverse(int numbers[])
    {
        int first = 0, last = numbers.length-1;
        while(first < last)
        {
            //swap
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp;
    
    first++;
    last--;
    }
}
    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 5, 10};
        
        // this function should be done first
        reverse(numbers);

        // loop to print result
        for(int i =0 ; i < numbers.length; i++){
        System.out.print(numbers[i]+ " ");
        System.out.println();
        }
    }
    
}
