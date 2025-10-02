import java.util.*;

class Student {
    private String name;
    private String grade;

    // Constructor
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    // toString method for display
    @Override
    public String toString() {
        return name + ":" + grade;
    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        // List to store student objects
        List<Student> students = new ArrayList<>();

        // Adding sample students
        students.add(new Student("Amit", "A"));
        students.add(new Student("Priya", "B"));

        // Display student records
        System.out.print("Student Records: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i));
            if (i < students.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
