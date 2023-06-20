package day16;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTraversal {
        public static void main(String[] args) {
            // Create an ArrayList of Strings
            List<String> arrayList = new ArrayList<>();
            arrayList.add("Apple");
            arrayList.add("Banana");
            arrayList.add("Orange");
            arrayList.add("Grapes");

            // Traverse using for loop
            System.out.println("Traversing using for loop:");
            for (int i = 0; i < arrayList.size(); i++) {
                String element = arrayList.get(i);
                System.out.println(element);
            }

            // Traverse using enhanced for loop
            System.out.println("\nTraversing using enhanced for loop:");
            for (String element : arrayList) {
                System.out.println(element);
            }

            // Traverse using iterator
            System.out.println("\nTraversing using iterator:");
            Iterator<String> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }

            // Traverse using forEach
            System.out.println("\nTraversing using forEach:");
            arrayList.forEach(element -> System.out.println(element));

            // Traverse using parallel stream
            System.out.println("\nTraversing using parallel stream:");
            arrayList.parallelStream().forEach(element -> System.out.println(element));
        }
    }


