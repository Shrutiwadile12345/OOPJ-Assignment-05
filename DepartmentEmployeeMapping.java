 import java.util.*;

public class DepartmentEmployeeMapping {

    public static void main(String[] args) {
	
        // Map to store department -> list of employees
		
        Map<String, List<String>> deptMap = new HashMap<>();

        // Adding employees to departments
        deptMap.put("IT", new ArrayList<>(Arrays.asList("Amit", "Rohan")));
        deptMap.put("HR", new ArrayList<>(Arrays.asList("Priya")));

        // Display department structure
        System.out.print("Department Structure: ");
		
        for (Map.Entry<String, List<String>> entry : deptMap.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            System.out.print(String.join(", ", entry.getValue()));
            System.out.print("; ");
        }
    }
}
