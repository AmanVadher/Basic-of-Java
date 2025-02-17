import java.util.*;
public class SimpleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i<=5; i++){
            System.out.println("Enter First Number : ");
            float a = sc.nextFloat();
            System.out.println("Enter Second Number : ");
            float b = sc.nextFloat();
            System.out.println("Enter Operator(+,-,*,/) : ");
            String op = sc.next();
            switch (op) {
                case "+":
                    System.out.println("Addition : "+(a+b));
                    break;
                case "-":
                    System.out.println("Subtraction : "+(a-b));
                    break;
                case "*":
                    System.out.println("Multiplication is : "+(a*b));
                    break;
                case "/":
                    System.out.println("Division is : "+(a/b));
                    break;
                default:
                    System.out.println("Invalid Input!!!");
                    break;
            }
        }
    }
}
