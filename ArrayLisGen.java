import java.util.*;
public class ArrayLisGen {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("100");
        al.add("200");
        al.add("vvp");

        System.out.println(al);
    }
}

/*Generic Class
 * Syntax
 * 
 * class classname<T>{
 *  T x;
 *  classname(T x){
 *      This.x=x;
 *  }
 *  T gwtValues(){
 *      return x;
 *  }
 * }
 */