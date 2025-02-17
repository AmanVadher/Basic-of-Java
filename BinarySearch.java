// Iterative Binary Search
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Numbers (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Search Element : ");
        int k = sc.nextInt();
        int index = binarySearch(arr, k);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Not Found!!");
        }
    }

    public static int binarySearch(int[] arr, int k) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return -1;
    }
}
