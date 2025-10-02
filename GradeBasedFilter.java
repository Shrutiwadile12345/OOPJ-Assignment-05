import java.util.*;

class Student {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + ":" + grade;
    }
}

public class GradeBasedFilter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Sample input
        students.add(new Student("Amit", "A"));
        students.add(new Student("Priya", "C"));
        students.add(new Student("Rohan", "B"));

        // Filtering students with grade >= B
        List<Student> qualified = new ArrayList<>();
        for (Student s : students) {
            if (s.getGrade().compareTo("B") <= 0) { 
                qualified.add(s);
            }
        }

        // Display qualified students
        System.out.print("Qualified Students: ");
        for (int i = 0; i < qualified.size(); i++) {
            System.out.print(qualified.get(i));
            if (i < qualified.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
