import java.util.*;
class Emp{
    float salary;
    private void getSal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary : ");
        salary=sc.nextFloat();
    }
    public void setSal(){
        getSal();
    }
}
public class Inherit extends Emp{
    float bonus =80.0f;
    public float totalsal(float b,float sal){
        float total=(b/100)*sal+sal;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inherit i1= new Inherit();
        Emp e = new Emp();
        e.setSal();
        System.out.println("Enter bonus to be paid");
        i1.bonus=sc.nextFloat();
        float sal=i1.totalsal(i1.bonus, i1.salary);
        System.out.println("Salary Paid : "+sal);
    }
}