
public class FirstNPrimes {
    public static void main(String[] args) {
        int n = 10; // Change n to display a different number of prime numbers
        displayFirstNPrimes(n);
    }

    // Method to display the first n prime numbers
    public static void displayFirstNPrimes(int n) {
        int count = 0;
        int number = 2; // Start checking from 2
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

