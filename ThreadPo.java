class Temp <T>{
    T x;
    Temp(T x){
        This.x=x;
    }
    T getValue(){
        return x;
    }
}
public class GeneratingProg {

}

/*
 * user define thread program by extending thread class.
 * 
 */
class MyDeo extends Thread{
    public void run(){
        System.out.println("run thread:"+Thread.currentThread().getName());
    }
}
public class ThreadPro1{
    public static void main(String[] args) {
        System.out.println("mian thread: "+Thread.currentThread().getName());
        MyDeo d = new MyDeo();
        d.start();
        System.out.println("Main thread:"+Thread.currentThread().getName());
    }
}
