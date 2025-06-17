
 class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

public class ConstructorOfThreadclass {
    public static void main(String[] args) {
        // 1. Thread()
        Thread t1 = new Thread(); // Thread with default name
        t1.setName("DefaultThread");  // Setting name manually
        t1.start();

        // 2. Thread(String name)
        Thread t2 = new Thread("NamedThread"); // Constructor with name
        t2.start();

        // 3. Thread(Runnable r)
        Runnable r1 = new MyRunnable();
        Thread t3 = new Thread(r1); // Runnable thread
        t3.setName("RunnableThread");
        t3.start();

        // 4. Thread(Runnable r, String name)
        Thread t4 = new Thread(new MyRunnable(), "RunnableNamedThread");
        t4.start();

        // Thread method examples
        try {
            t1.join(); // Wait for t1 to finish
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }

        System.out.println("Priority of t4 before: " + t4.getPriority());
        t4.setPriority(Thread.MAX_PRIORITY); // Set highest priority
        System.out.println("Priority of t4 after: " + t4.getPriority());

        System.out.println("Main thread ends.");
    }
}
