import java.util.*;

public class LinearSearch {

    //new function
    public static int linearSearch(int numbers[],  int key)
    {
        // for linear search we are starting for loop from index i=0 to i < number.length
        for( int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == key)
            {
                return i;
            }
        }
         return -1;
    }

    //main function
    public static void main(String args[])
    {
        int numbers[] = { 2,4,6,8,10,14,16};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT found");
        }
        else{
            System.out.println("Key is at index: " + index);
        }
    }
    
}
