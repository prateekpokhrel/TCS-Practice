import java.util.*;
public class LargestNumber {

    // new function
    public static int getNumber(int numbers[])
    {   
        // syntax to get largest number from array
        int largest = Integer.MIN_VALUE;

        // syntax to get smallest number from array
        int smallest = Integer.MAX_VALUE;


        // loop to traverse all over the given array
        for(int i =0; i< numbers.length; i++)
        {   
            // condition for getting largest
            if(largest< numbers[i])
            {
                largest = numbers[i];
            }
             
            // codition fro getting smallest
            if(smallest > numbers[i])
            {
                smallest = numbers[i];
            }
        
    }
    System.out.println("Smallest number is: " + smallest);
    
    return largest; // as only one thing can return
    }

    // main function
    public static void main(String args[])
    {
        int numbers[] = {2, 4, 6, 5, 1};
        System.out.println("Largest number is: "+getNumber(numbers));
    }
    
}
