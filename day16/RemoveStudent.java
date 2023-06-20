package day16;
import java.util.ArrayList;
import java.util.List;
public class RemoveStudent {
        public static void main(String[] args) {
            // Create an ArrayList of Students
            List<Student> studentList = new ArrayList<>();

            // Add students to the list
            studentList.add(new Student("John", "Doe", 3.5));
            studentList.add(new Student("Alice", "Smith", 4.2));
            studentList.add(new Student("Bob", "Johnson", 2.8));
            studentList.add(new Student("Emily", "Davis", 3.9));

            // Print the list of students before removal
            System.out.println("Before removal:");
            for (Student student : studentList) {
                System.out.println(student);
            }

            // Calculate the average GPA
            double totalGpa = 0;
            for (Student student : studentList) {
                totalGpa += student.getGpa();
            }
            double averageGpa = totalGpa / studentList.size();

            // Remove students with GPA less than the average GPA
            studentList.removeIf(student -> student.getGpa() < averageGpa);

            // Print the list of students after removal
            System.out.println("\nAfter removal:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    class Student {
        private String firstName;
        private String lastName;
        private double gpa;

        public Student(String firstName, String lastName, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
        }

        public double getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " (GPA: " + gpa + ")";
        }
    }


