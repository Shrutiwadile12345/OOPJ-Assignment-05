import java.util.*;

class BrowerHistoryManagement{

      public static void main(String args[]){
	  
	  Stack<String> pages = new Stack<>();
	  
	  pages.push("Google");
	  pages.push("YouTube");
	  pages.push("GFG");
	  
	  System.out.println("Pages visited: " + pages);
	  
	  System.out.println("Action: (1 page)");
	  if(!pages.isEmpty()){
	     pages.pop();
	  }
	  
	   System.out.println("Current history: " + String.join(", ", pages));
	 
	  }
}