import java.util.Scanner;

public class Linear_Search {
    int linear_search(int[] array, int key, int size) {
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Linear_Search obj = new Linear_Search();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array.\n");
        int size = sc.nextInt();
        System.out.println("Enter elements of array:\n");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter key to find in array\n");
        int key = sc.nextInt();
        int result = obj.linear_search(array, key, size);
        if (result == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("Key found at index: " + result);
        }
    }
}
