class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Thread using Thread Class: " + i);
            try {
                Thread.sleep(500);  // Sleep for 500 ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();  // Create Thread object
        thread.start();                    // Start the thread
    }
}
