package EXAM_PREPARE.P1_CORE;

public class P12_THREADS {
    //    static class myThreads extends Thread{
//        public void run(){
//            System.out.println("My Thread is running.....");
//        }
//    }
//
//    public static void main(String[] args) {
//        myThreads t = new myThreads();
//        t.start();
//    }

    static class myRunnable implements Runnable{
        public void run() {
            System.out.println("Runnable thread is running....");
        }

        public static void main(String[] args) {
            Thread m = new Thread(new myRunnable());
            m.start();
        }
    }
}
