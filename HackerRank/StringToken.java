import java.io.*;
import java.util.*;

public class StringToken {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // Write your code here.
        String[] tokens = s.trim().split("[^A-Za-z+]");
        List<String> filteredtoken = new ArrayList<>();
        for(String token : tokens){
            if(!token.isEmpty()){
                filteredtoken.add(token);
            }
        }
        System.out.println(filteredtoken.size());
        for(String token : filteredtoken){
            System.out.println(token);
        }
        sc.close();
    }
}

