import java.util.*;

public class Arraydemo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter araay size : ");
        n = sc.nextInt();
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int[] arr = new int[n];
        System.out.println("Enter the array element : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println("\nSecond array is : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}
