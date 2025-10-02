import java.util.*;

class LibraryBookInventory{

     public static void main(String args[]){
	 
	 Map<String, Integer> book = new HashMap<>();

	 book.put("Java", 3);
	 book.put("Python", 5);
	 
	System.out.println("Initial inventory:");
        for (Map.Entry<String, Integer> entry : book.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
	 
	 String borrowBook = "Java";
	 if(book.containsKey(borrowBook) && book.get(borrowBook) > 0){
	     book.put(borrowBook, book.get(borrowBook) - 1);
	 } else {
	     System.out.println("Book not available!");
	 }
	 
	   System.out.println("\nCurrent inventory:");
        for (Map.Entry<String, Integer> entry : book.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
	 }

}