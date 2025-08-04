package EXAM_PREPARE;

class MyThreads extends Thread{
    public void run(){
        System.out.println(getName() + " is currently running....");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted");
        }
        System.out.println(getName() + " Finished...");
    }
}

public class P13_MULTITHREADS {
    public static void main(String[] args) throws InterruptedException{
        MyThreads t1 = new MyThreads();
        MyThreads t2 = new MyThreads();
        t1.setName("Anup Chand");
        t2.setName("Ayush Joshi");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both Threads Executed Successfully");
    }



//    static class thread1 extends Thread{
//        public void run(){
//            System.out.println("Thread 1 is running...");
//        }
//    }
//
//    static class thread2 extends Thread{
//        public void run(){
//            System.out.println("Thread 2 is running....");
//        }
//    }
//
//    public static void main(String[] args) {
//        thread1 t1 = new thread1();
//        thread2 t2 = new thread2();
//        t1.start();
//        t2.start();
//    }
}
