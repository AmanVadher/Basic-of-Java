import java.util.Scanner;

public class Ob {
    int arr[];
    String name;
    int roll;
    float cgpa;

    Ob() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter Name : ");
            name = sc.next();
            System.out.println("Enter Roll No. : ");
            roll = sc.nextInt();
            System.out.println("Enter CGPA : ");
            cgpa = sc.nextFloat();
            check(arr);
        }
    }

    public void check(int Ob[]) {
        if (cgpa >= 5) {
            System.out.println("Pass");
            System.out.println("Name : " + name);
            System.out.println("Roll No. : " + roll);
            System.out.println("CGPA : " + cgpa);
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Ob o = new Ob();
    }
}