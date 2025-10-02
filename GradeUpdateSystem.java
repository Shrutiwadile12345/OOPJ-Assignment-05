import java.util.*;

class GradeUpdateSystem{
 
     public static void main(String[] args){
	 
	 Map<String, Integer> grade = new HashMap<>();
	 
	 grade.put("Rohan", 78);
	 
	 //for each loop
	 for (Map.Entry<String, Integer> entry : grade.entrySet()){
		 System.out.println("Initial: " + entry.getKey() + " -> " + entry.getValue());
	 }
	 
	 grade.replace("Rohan", 88);
	 
	 for (Map.Entry<String, Integer> entry : grade.entrySet()) {
            System.out.println("Updated: " + entry.getKey() + " -> " + entry.getValue());
        }
	 
	 
	 
	 }


}