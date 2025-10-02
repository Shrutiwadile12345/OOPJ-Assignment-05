import java.util.*;

class GradeReportGenerator {

    public static void main(String[] args) {
        
		// Student grades
        Map<String, Integer> grades = new LinkedHashMap<>();
        grades.put("Amit", 85);
        grades.put("Priya", 92);

        // Use Iterator
        Iterator<Map.Entry<String, Integer>> it = grades.entrySet().iterator();

        System.out.print("Grade Report: ");
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.print(entry.getKey() + ":" + entry.getValue());
            if (it.hasNext()) { // avoid trailing comma
                System.out.print(", ");
            }
        }
    }
}
