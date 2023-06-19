package day14;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Vowelsl {

        public static void main(String[] args) {
            String[] strings = {"arya", "Stark", "eddard", "benjen"};

            // Get the strings that contain vowels
            String[] vowelStrings = Arrays.stream(strings)
                    .filter(s -> s.toLowerCase().chars().anyMatch(c -> "aeiou".indexOf(c) >= 0))
                    .collect(Collectors.toList()).toArray(new String[0]);

            // Print the strings and number of vowels
            for (String vowelString : vowelStrings) {
                int vowelCount = (int) vowelString.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
                System.out.println(vowelString + " has " + vowelCount + " vowels");
            }
        }
    }


