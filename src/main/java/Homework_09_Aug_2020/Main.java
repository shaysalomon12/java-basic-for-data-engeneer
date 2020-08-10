package Homework_09_Aug_2020;

public class Main {

    public static void main(String[] args) {

        String threadName;
        MyThread mt = new MyThread();

        // Run n threads in parallel
        int n = 30;
        for (int i=1; i<(n+1); i++){
            threadName = "Thread_" + i;
            Thread t = new Thread(mt, threadName);
            System.out.println("Starting thread called " +  t.getName());
            t.start();

        }

        // Keep main running after all threads exited to see it in VisualVM
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
