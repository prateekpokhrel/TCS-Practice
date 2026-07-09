import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        int size = arr.length;

        // Input
        System.out.println("Enter 8 elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Display before deletion
        System.out.println("\nArray before deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Delete
        System.out.print("\n\nEnter index to delete: ");
        int index = sc.nextInt();

        if (index >= 0 && index < size) {

            // Shift elements to the left
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            size--;

            // Display after deletion
            System.out.println("Array after deletion:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }

        } else {
            System.out.println("Invalid Index");
        }

        sc.close();
    }
}