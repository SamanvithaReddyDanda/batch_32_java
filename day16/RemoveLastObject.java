package day16;
import java.util.ArrayList;
import java.util.List;
public class RemoveLastObject {
        public static void main(String[] args) {
            // Create an ArrayList of Strings
            List<String> arrayList = new ArrayList<>();
            arrayList.add("Apple");
            arrayList.add("Banana");
            arrayList.add("Orange");
            arrayList.add("Grapes");

            // Print the ArrayList before removing the last object
            System.out.println("Before removing the last object: " + arrayList);

            // Remove the last object
            if (!arrayList.isEmpty()) {
                arrayList.remove(arrayList.size() - 1);
                System.out.println("Last object removed successfully.");
            } else {
                System.out.println("ArrayList is empty. No objects to remove.");
            }

            // Print the ArrayList after removing the last object
            System.out.println("After removing the last object: " + arrayList);
        }
    }


