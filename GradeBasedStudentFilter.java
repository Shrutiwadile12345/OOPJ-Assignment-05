import java.util.*;

class GradeBasedStudentFilter{
 
    public static void main(String... args){
	
	Map<String, Integer> grades = new HashMap<>();
	
	grades.put("Amit", 85);
	grades.put("Priya", 52);
	grades.put("Rohan", 78);
	
	System.out.println("Student grades: ");
	for(Map.Entry<String, Integer> entry : grades.entrySet()){
		System.out.println(entry.getKey() + "->" + entry.getValue());
	}
	
	int threshold = 60;
	System.out.println("\nFilter threshold: "+ threshold);
	

	// Use Iterator to safely remove students below threshold
        Iterator<Map.Entry<String, Integer>> it = grades.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() < threshold) {
                it.remove(); // remove student who scored below threshold
            }
        }
	
	System.out.println("\nHonor Roll: ");
	for(Map.Entry<String, Integer> entry : grades.entrySet()){
		System.out.println(entry.getKey() + " -> " + entry.getValue());
	}
	
	}
}