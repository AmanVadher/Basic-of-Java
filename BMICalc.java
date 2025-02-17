import java.util.*;
public class BMICalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight(kg) : ");
        float Weight = sc.nextFloat();
        System.out.println("Enter Height(feet) : ");
        float feet = sc.nextFloat();
        float meter = (float) (feet*0.3048);
        float cal = Weight / (feet*feet);
        System.out.println("BMI Value is : "+cal);
    }
}
