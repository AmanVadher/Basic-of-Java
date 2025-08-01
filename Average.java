import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 No. : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            if(b>c){
                System.out.print(a+" "+b+" "+c);
            } else {
                System.out.println(a+" "+c+" "+b);
            }
        } else if(b>a && b>c){
            if(a>c){
                System.out.print(b+" "+a+" "+c);
            } else {
                System.out.println(b+" "+c+" "+a);
            }
        } else {
            if(c>a){
                System.out.print(c+" "+a+" "+b);
            } else {
                System.out.println(c+" "+b+" "+a);
            }
        }
    }
}
