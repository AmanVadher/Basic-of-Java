import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Search Element : ");
        int k = sc.nextInt();
        int num = linearSearch(arr, k);
        if (num != -1) {
            System.out.println("Element found at index: " + num);
        } else {
            System.out.println("Not Found!!");
        }
    }

    public static int linearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
