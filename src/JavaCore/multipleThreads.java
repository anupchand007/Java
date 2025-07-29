package JavaCore;
//
//class MyThread1 extends Thread {
//    public void run(){
//        System.out.println("Thread 1 is running....");
//    }
//}
//
//class Mythread2 extends Thread{
//    public void run(){
//        System.out.println("Thread 2 is running...");
//    }
//}
//
//public class multipleThreads {
//    public static void main(String[] args){
//        MyThread1 t1 = new MyThread1();
//        Mythread2 t2 = new Mythread2();
//        t1.start();
//        t2.start();
//    }
//}


class Counter {
    int count = 0;

    public void increment() {
        count++; // not thread-safe
    }
}

public class multipleThreads {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count: " + c.count);  // Wrong output like 1800–1999
    }
}
