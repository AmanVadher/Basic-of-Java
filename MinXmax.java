import java.util.*;
public class MinXmax {
    private int[] arr;
    private int size;
    
    public void declare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. : ");
        size=sc.nextInt();
        arr = new int[size];
        System.out.println("Enter "+size+" No. : ");
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        call(min,max);
    }

    private void call(int min, int max){
        int value = max*min;
        System.out.println("Multiplication : "+value);
    }
    public static void main(String[] args) {
        MinXmax m = new MinXmax();
        m.declare();        
    }
}
