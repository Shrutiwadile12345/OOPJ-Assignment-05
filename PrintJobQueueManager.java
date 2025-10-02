import java.util.*;

class PrintJobQueueManager {

    public static void main(String args[]) {
	
        Queue<String> printQueue = new LinkedList<>();

        printQueue.add("Doc1");
        printQueue.add("Doc2");
        printQueue.add("Doc3");

        System.out.println("Jobs in queue: " + printQueue);

        // Process 1 job
        System.out.println("Process: 1 job");
        if (!printQueue.isEmpty()) {
            String job = printQueue.poll(); // remove and return head of queue
            System.out.println("Printing " + job);
        }

        // Display remaining jobs
        System.out.println("Queue: " + printQueue);
    }
}
