import java.util.Scanner;

public class KmTOmiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter KM : ");
        float km = sc.nextFloat();
        float miles = (float) (km * 0.621371);
        System.out.println(miles+" Miles");
    }
}
