import java.util.*;
public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cm : ");
        float cm = sc.nextFloat();
        System.out.println("In Which you can Convert(mm,m,feet,inch): ");
        String cov = sc.next();
        switch (cov) {
            case "mm":
                System.out.println("Milimeter is : "+(cm*10));
                break;
            case "m":
                System.out.println("Meter is : "+(cm*0.01));
                break;
            case "feet":
                System.out.println("Feet is : "+(cm*0.0328084));
                break;
            case "inch":
                System.out.println("Inch is : "+(cm*0.393701));
                break;
            default:
                System.out.println("Invalid Input!!!");
                break;
        }
    }
}
