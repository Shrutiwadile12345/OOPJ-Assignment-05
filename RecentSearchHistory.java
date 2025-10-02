import java.util.*;

class RecentSearchHistory {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Queue<String> searches = new LinkedList<>();

        System.out.print("Enter number of searches (max 5): ");
        int searchesNo = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < searchesNo; i++) {
            System.out.print("Enter search " + (i + 1) + ": ");
            String search = sc.nextLine();
            searches.add(search);
        }

        // Display all searches
        System.out.println("Searches: " + String.join(", ", searches));

        // Remove the oldest search (FIFO)
        searches.poll();

        // Display remaining
        System.out.println("Recent searches: " + String.join(", ", searches));
    }
}
