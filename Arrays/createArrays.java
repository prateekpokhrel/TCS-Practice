import java.util.Scanner;
public class createArrays{
    public static void main(String[] args){
       //Input-
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter: \t");
         
        //array create
        int arr[] = new int[8];

        // display
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
            
        }
            arr[2] = 100;
       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}