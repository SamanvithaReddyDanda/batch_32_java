package day13;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class DeadLock {
        private static Lock lock1 = new ReentrantLock();
        private static Lock lock2 = new ReentrantLock();

        public static void deadlock() {
            lock1.lock();
            try {
                lock2.lock();
                try {
                    // Do something that requires both locks
                } finally {
                    lock2.unlock();
                }
            } finally {
                lock1.unlock();
            }
        }

        public static void main(String[] args) throws InterruptedException {
            // Create two threads that will call the deadlock method
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    deadlock();
                }
            });
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    deadlock();
                }
            });

            // Start the threads
            thread1.start();
            thread2.start();

            // Wait for the threads to finish
            thread1.join();
            thread2.join();
        }
    }

