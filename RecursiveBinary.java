import java.util.Scanner;

public class RecursiveBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Numbers :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Search Element : ");
        int k = sc.nextInt();
        int index = binarySearch(arr, k, 0, n - 1);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Not Found!!");
        }
    }

    public static int binarySearch(int[] arr, int k, int l, int r) {
        if (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == k) {
                return mid;
            }

            if (arr[mid] < k) {
                return binarySearch(arr, k, mid + 1, r);
            } else {
                return binarySearch(arr, k, l, mid - 1);
            }
        }

        return -1;
    }
}
