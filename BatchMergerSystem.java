import java.util.*;

class BatchMergerSystem {

    public static void main(String args[]) {
        
		// Morning batch
        List<String> morningBatch = Arrays.asList("Amit", "Priya");

        // Evening batch
        List<String> eveningBatch = Arrays.asList("Rohan", "Priya");

        // Use LinkedHashSet to remove duplicates & maintain insertion order
        
		Set<String> combined = new LinkedHashSet<>();
        combined.addAll(morningBatch);
        combined.addAll(eveningBatch);

        // Display result
        System.out.println("Combined batches: " + String.join(", ", combined));
    }
}
