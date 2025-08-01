// write a class in which integer it size and int value are the private variable inside which also calls a private method 
// in which the multiplication of the minimum element of the array and the input integer this return call this
// public method in main method 
import java.util.*;
public class MinXvalue{
    private int[] arr;
    private int size,value;

    public void declare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. : ");
        size=sc.nextInt();
        arr = new int[size];
        System.out.println("Enter "+size+" No. : ");
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value : ");
        value = sc.nextInt();
        int min = Arrays.stream(arr).min().getAsInt();
        call(min,value);
    }

    private void call(int min, int val){
        int value = val*min;
        System.out.println("Multiplication : "+value);
    }
    public static void main(String[] args) {
        MinXvalue m1 = new MinXvalue();
        m1.declare();        
    }
}
