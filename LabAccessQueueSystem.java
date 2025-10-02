import java.util.*;

class LabAccessQueueSystem{

     public static void main(String args[]){
	
	 //Queue<String> students = new PriorityQueue<>(); //PriorityQueue arranges elements in natural order (alphabetical for Strings)
	 Queue<String> students = new LinkedList<>();
	 
	 students.add("Amit");
	 students.add("Priya");
	 students.add("Rohan");
	 
	 System.out.println("Enqueue: " + String.join(", ", students));
	 System.out.println("Dequeue: 1 student ");
		 
	 students.poll();  //safer, won't crash if queue is empty
	 //students.remove(); //throw error if you try to remove more than existing students

     System.out.println("Queue: " + String.join(", ", students));
	
	 }
}