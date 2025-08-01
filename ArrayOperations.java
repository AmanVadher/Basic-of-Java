public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 7, 2, 15, 8, 12, 6, 9};

        // Printing sum of all elements in the array
        System.out.println("Sum of all elements: " + add(array));

        // Printing maximum element in the array
        System.out.println("Maximum element: " + max(array));

        // Searching for an element in the array
        int key = 12;
        int index = search(array, key);
        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }

    // Method to calculate and return the sum of all elements in the array
    public static int add(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Method to find and return the maximum element in the array
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Method to search for an element in the array and return its index
    // Returns -1 if the element is not found
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
