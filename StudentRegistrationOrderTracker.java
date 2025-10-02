import java.util.*;

class StudentRegistrationOrderTracker{

      public static void main(String args[]){
	  
	  Map<String, Integer> registration = new LinkedHashMap<>();
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter No of Students and rollno: ");
	  int n = sc.nextInt();
	  sc.nextLine();
	  
	  for(int i = 0; i < n; i++){
	       System.out.println("Enter Student: " +(i + 1) + ":");
		   String name = sc.nextLine();
		   
		    System.out.println("Enter rollno for " + name+ ":");
			int marks = sc.nextInt();
			sc.nextLine();
			
			registration.put(name, marks);  //store in map
	  }
	  
	  System.out.printf("Registration Order: ");
	
	  //for each loop
	  for(Map.Entry<String, Integer> entry : registration.entrySet()){
	      System.out.printf("" + entry.getKey() + ":" + entry.getValue() + ",");
	  }
	}
}