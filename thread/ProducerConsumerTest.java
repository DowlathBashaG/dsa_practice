package dowlath.io.example.thread;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static dowlath.io.example.thread.ProducerConsumerDemo.sleep;

public class ProducerConsumerTest {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            producerConsumerTest();
            System.out.println("End");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static void producerConsumerTest() throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Runnable producer = () -> {
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                int val = rand.nextInt(100);
                try {
                    queue.put(val);
                    System.out.println("Producer :" + val);
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable consumer = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    int val = queue.take();
                    System.out.println("Consumer :" + val);
                    Thread.sleep(400);
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
}