package dowlath.io.example.thread;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        try {
            System.out.println("Starting Producer-Consumer Pattern...");
            producerConsumerPattern();
            System.out.println("Finished Execution.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Main thread was interrupted.");
        }
    }

    // A: Use BlockingQueue to share data safely between threads.
    static void producerConsumerPattern() throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Runnable producer = () -> {
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                int val = rand.nextInt(100);
                try {
                    queue.put(val); // waits if queue is full
                    System.out.println("Produced: " + val);
                    sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable consumer = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Integer val = queue.take(); // waits if queue is empty
                    System.out.println("Consumed: " + val);
                    sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }

    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
