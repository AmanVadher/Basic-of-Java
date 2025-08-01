import java.util.*;
public class CGPA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Enter 3 Subject Marks : ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        int sum = num1+num2+num3;
        int avg = sum/3;
        float cgpa = (float) (avg/9.5);
        System.out.println("CGPA : "+cgpa);
    }
}