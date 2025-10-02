import java.util.*;

class StudentGradeManagement{

      public static void main(String args[]){
	  
	  Map<String, Integer> grade = new HashMap<>();
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter No of Students and marks: ");
	  int n = sc.nextInt();
	  sc.nextLine();
	  
	  for(int i = 0; i < n; i++){
	       System.out.println("Enter Student: " +(i + 1) + ":");
		   String name = sc.nextLine();
		   
		    System.out.println("Enter marks for " + name+ ":");
			int marks = sc.nextInt();
			sc.nextLine();
			
			grade.put(name, marks);  //store in map
	  }
	  
	  System.out.println("Grade Report: ");
	  //for each loop
	  for(Map.Entry<String, Integer> entry : grade.entrySet()){
	      System.out.println(" " + entry.getKey() + " :" + entry.getValue());
	  }
	}
}