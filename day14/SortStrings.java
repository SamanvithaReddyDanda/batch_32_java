package day14;
import java.util.Arrays;
import java.util.Comparator;

public class SortStrings {
        public static void main(String[] args) {
            String[] strings = {"apple", "banana", "pear", "orange", "kiwi", "melon"};

            Arrays.stream(strings)
                    .sorted(Comparator.comparingInt(String::length) // Sort by length in ascending order
                            .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed())) // Then sort by last character in descending order
                    .forEach(System.out::println);
        }
    }