import java.util.Scanner;
public class MethodDemo {
    public static void maximunNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Max Number is : "+a);
        }
        else if(b>a && b>c){
            System.out.println("Max Number is : "+b);
        }
        else{
            System.out.println("Max Number is : "+c);
        }
    }
    public static void main(String[] args) {
        maximunNumber();        
    }
}
