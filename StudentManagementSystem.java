import java.util.*;

class StudentManagementSystem{

    public static void main(String args[]){
	
	//List<String> students = new ArrayList<>(); //ArrayList → better for fast searching/getting by index.
	List<String> students = new LinkedList<>();  //LinkedList → better for frequent insertion/deletion in the middle.
	
	students.add("Amit");
	students.add("Priya");
	students.add("Rohan");
	
	System.out.println(students);   //Display the Student names
	
	students.remove(1); //Index wise removing
	//students.remove("Priya");  //Generic wise removing
	
	//System.out.println("Students: " + students);
	
	System.out.println("Students: " + String.join(", ", students)); //without square brackets (more natural roster display
	}
}