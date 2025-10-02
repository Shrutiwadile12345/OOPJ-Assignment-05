import java.util.*;

public class EventAttendance {
    public static void main(String[] args) {
		
        // Use HashSet to store unique attendees
        HashSet<String> attendees = new HashSet<>();

        // Sample Input
        attendees.add("Amit");
        attendees.add("Rohan");
        attendees.add("Amit");  // duplicate
        attendees.add("Priya");

        // Display unique count
        System.out.println("Total unique attendees: " + attendees.size());
    }
}
