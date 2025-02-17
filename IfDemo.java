import java.util.*;
import static java.lang.System.*;

public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score of the student : ");
        int score = sc.nextInt();
        System.out.println("Enter the grade pay : ");
        double pay = sc.nextDouble();
        if (score <= 0) {
            System.out.println("Invalid Input");
            exit(0);
        } else {
            if (score >= 90) {
                pay = pay + ((3 * pay) / 100);
            } else {
                pay = pay + ((1 * pay) / 100);
            }
        }
        System.out.println("The incremented pay is : " + pay);
    }
}
