package JavaCore;

//public class thread  extends Thread{
//    public void run(){
//        System.out.println("Thread is Running");
//    }
//
//    public static void main(String[] args){
//        thread t1 = new thread();
//        t1.start();
//    }
//}

public class thread implements Runnable{
    public void run(){
        System.out.println("Thread is Running");
    }

    public static void main(String[] args){
        Thread t1 = new Thread(new thread());
        t1.start();
    }
}