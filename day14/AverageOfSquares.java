package day14;
import java.util.Arrays;

public class AverageOfSquares {

        public static void main(String[] args) {
            Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            double average = Arrays.stream(numbers)
                    .filter(n -> n % 2 != 0) // Filter odd numbers
                    .mapToDouble(n -> Math.pow(n, 2)) // Square each number
                    .average() // Calculate average
                    .orElse(0); // Use 0 as default if no elements

            System.out.println("Average of squares of odd numbers: " + average);
        }}



