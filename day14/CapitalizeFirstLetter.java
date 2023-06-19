package day14;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeFirstLetter {

        public static void main(String[] args) {
            String[] strings = {"got", "ghost", "johnsnow"};
            System.out.println("Original strings:");
            for (String string : strings) {
                System.out.println(string);
            }

            // Capitalize the first letter of each string
            String[] capitalizedStrings = Arrays.stream(strings)
                    .map(string -> string.substring(0, 1).toUpperCase() + string.substring(1))
                    .collect(Collectors.toList()).toArray(new String[0]);

            // Sort the strings in alphabetical order
            Arrays.sort(capitalizedStrings);

            // Print the capitalized strings in alphabetical order
            System.out.println("Capitalized strings in alphabetical order:");
            for (String string : capitalizedStrings) {
                System.out.println(string);
            }
        }
    }
