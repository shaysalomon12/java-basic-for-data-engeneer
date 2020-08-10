package Homework_09_Aug_2020;

public class MyThread implements Runnable {

    @Override
    public void run() {

        // Loop for 5 min
        try {
            for(int i = 300000; i > 0; i--) {
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }

}
