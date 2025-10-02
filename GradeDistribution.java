import java.util.*;

public class GradeDistribution {
    public static void main(String[] args) {
	
        String[] grades = {"A", "B", "A", "C", "B", "A"};

        // HashMap to count grade frequency
        HashMap<String, Integer> gradeCount = new HashMap<>();

        // Count occurrences
        for (String grade : grades) {
            gradeCount.put(grade, gradeCount.getOrDefault(grade, 0) + 1);
        }

        // Display grade distribution
        System.out.print("Grade Distribution: ");
        for (Map.Entry<String, Integer> entry : gradeCount.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }
}
