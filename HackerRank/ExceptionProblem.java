import java.io.*;
import java.util.*;

public class ExceptionProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        try{
            if(B<=0 || H<=0){
                throw new Exception("Breadth and height must be positive");
            }
            System.out.println(B*H);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            sc.close();
        }
    }
}