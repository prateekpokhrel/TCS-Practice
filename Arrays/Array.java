import java.util.*;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an array
        int arr[] = new int[4];
        int size = arr.length;

        // Input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Display
        System.out.println("\nArray Elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Update
        arr[2] = 100;

        System.out.println("\n\nArray after Update:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Delete
        int index = 2;

        if (index >= 0 && index < size) {

            // Shift elements to the left
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            size--;

            System.out.println("\n\nArray after Deletion:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }

        } else {
            System.out.println("Invalid Index.");
        }

        sc.close();
    }
}