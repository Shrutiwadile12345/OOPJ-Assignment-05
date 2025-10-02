import java.util.*;

class GroceryList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> items = new ArrayList<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            String item = sc.nextLine();
            items.add(item);
        }

        System.out.println("\nAdd items: " + String.join(", ", items));
		
        System.out.print("Enter purchased item: ");
        String purchased = sc.nextLine();

        if (items.remove(purchased)) {
            System.out.println("Purchased: " + purchased);
        } else {
            System.out.println("Item not found in list!");
        }

        // Display remaining items
        System.out.print("Items to buy: ");
        if (items.isEmpty()) {
            System.out.println("No items left!");
        } else {
            System.out.println(String.join(", ", items));
        }
    }
}
