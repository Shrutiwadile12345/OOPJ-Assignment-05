import java.util.*;

class CourseRegistrationSystem{

      public static void main(String args[]){
	  Set<String> codes = new LinkedHashSet<>();
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter course codes count: ");
	  int code = sc.nextInt();
	     sc.nextLine();
	  
	  for(int i  = 0; i < code; i++){
	      System.out.println("Enter course codes: " + (i + 1) + ":");
		   String courseCode = sc.nextLine();
		   codes.add(courseCode);
	  }
	  
	  System.out.println("Course codes: " + String.join("," , codes));
	  
	  System.out.println("Registered Courses: " + String.join("," , codes));
	  Iterator<String> it = codes.iterator();
	  while(it.hasNext()){
	    System.out.println(it.next());
	}
  }
}