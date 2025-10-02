import java.util.*;

class DailyTaskTracker{

     public static void main(String args[]){
	 
	 List<String> tasks = new ArrayList<>();
	 
	 tasks.add("Study Java");
	 tasks.add("Complete Assignment");
	 tasks.add("Exercise");
	 
	 String completed_tasks = "Exercise";
	 tasks.remove(completed_tasks);
	 
	 System.out.println("Complete task: " + completed_tasks);
	
	 Iterator<String> it = tasks.iterator();
         while(it.hasNext()) {
            String task = it.next();
           if(task.equals("Exercise")) {
                it.remove();  // ✅ safe removal
                 }
             }
	 }

}
 
	 // ✅ Using for-each loop
	 System.out.print("Remaining tasks (for-each): ");
	 for(String task : tasks) {
	     System.out.print(task);
	     if(!task.equals(tasks.get(tasks.size()-1))) {
	         System.out.print(", ");
	     }
	 }
	 
	 System.out.println();
	 
	 // ✅ Using Iterator
	 System.out.print("Remaining tasks (iterator): ");
	 Iterator<String> it = tasks.iterator();
	 while(it.hasNext()) {
	     System.out.print(it.next());
	     if(it.hasNext()) {
	         System.out.print(", ");
	     }
	 }
     }
}
