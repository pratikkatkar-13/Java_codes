class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(500);  // Sleep for 500 ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();  // Create Runnable object
        Thread thread = new Thread(runnable);    // Create thread with Runnable object
        thread.start();                          // Start the thread
    }
}
