import java.util.*;
public class ArrayOfObject {
    double rate;
    String name;
    int id;

    ArrayOfObject(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Rate : ");
        rate = sc.nextDouble();
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter ID : ");
        id = sc.nextInt();
    }
    
    public void display(){
        System.out.println("The details of the purchase are : ");
        System.out.println("Product name : "+name);
        System.out.println("Rate = "+rate);
        System.out.println("Customer id = "+id);
    }
    public static void main(String[] args) {
        ArrayOfObject ao[] = new ArrayOfObject[5];
        for(int i=0; i<ao.length;i++){
            System.out.println("-----Display Object"+i+"-----");
            ao[i]=new ArrayOfObject();
            ao[i].display();
        }
        // ao[0]=new ArrayOfObject();
        // ao[1]= new ArrayOfObject(1000000.0d,"HP",4);
        // ao[2]= new ArrayOfObject(1550000.0d,"Lenovo",7);
        // ao[3]= new ArrayOfObject(1550000.0d,"Dell",4);
        // ao[4]= new ArrayOfObject(250000.0d,"HP",9);
        // ao[0].display();
        // System.out.println("--------------------------");
        // ao[1].display();
        // System.out.println("--------------------------");
        // ao[2].display();
        // System.out.println("--------------------------");
        // ao[3].display();
        // System.out.println("--------------------------");
        // ao[4].display();
        // System.out.println("--------------------------");
    }
}
