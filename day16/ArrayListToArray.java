package day16;
import java.util.ArrayList;
import java.util.List;
public class ArrayListToArray {
        public static void main(String[] args) {
            // Create an ArrayList of Strings
            List<String> arrayList = new ArrayList<>();
            arrayList.add("Apple");
            arrayList.add("Banana");
            arrayList.add("Orange");
            arrayList.add("Grapes");

            // Convert ArrayList to array
            String[] array = arrayList.toArray(new String[arrayList.size()]);

            // Print the array
            System.out.println("Converted array:");
            for (String element : array) {
                System.out.println(element);
            }
        }
    }


