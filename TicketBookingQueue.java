import java.util.*;

class TicketBookingQueue{

      public static void main(String args[]){
	  
	  Queue<String> queue = new LinkedList<>();
	  
	  queue.add("Amit");
	  queue.add("Priya");
	  queue.add("Rohan");
	  
	  System.out.println("Queue: " + queue);
	  
	  System.out.println("Serve: 1 customer");
	  
	  String served = queue.poll();
 	  
	  System.out.println("Serving: " + served);
      System.out.println("Queue: " + String.join(", ", queue));
	 
	  }
	 
}