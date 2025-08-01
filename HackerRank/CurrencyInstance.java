import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyInstance {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String india = "Rs."+df.format(payment); 
        
        NumberFormat uSFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = uSFormat.format(payment);
        
        NumberFormat chFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chFormat.format(payment);
        
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = frFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}