package day13;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumArray {
    public static void main(String[] args) throws Exception {
            // Create an array of size 100 containing values from 1 to 100
            int[] array = new int[100];
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }

            // Create an ExecutorService with 5 threads
            ExecutorService executorService = Executors.newFixedThreadPool(5);

            // Create a callable object for each thread
            Callable<Integer>[] callables = new Callable[5];
            for (int i = 0; i < callables.length; i++) {
                callables[i] = new SumArrayCallable(array, i * array.length / 5, (i + 1) * array.length / 5);
            }

            // Submit the callable objects to the executor service
            List<Future<Integer>> futures = executorService.invokeAll(List.of(callables));

            // Get the results from the futures
            int sum = 0;
            for (Future<Integer> future : futures) {
                sum += future.get();
            }

            // Print the sum
            System.out.println("The sum is: " + sum);

            // Shutdown the executor service
            executorService.shutdown();
        }

        static class SumArrayCallable implements Callable<Integer> {

            private int[] array;
            private int start;
            private int end;

            public SumArrayCallable(int[] array, int start, int end) {
                this.array = array;
                this.start = start;
                this.end = end;
            }

            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            }
        }
    }

