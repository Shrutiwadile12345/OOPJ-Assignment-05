import java.util.*;

class UniqueRollValidator{

      public static void main(String args[]){
	  
	  Set<Integer> RollNo = new LinkedHashSet<>();   //HashSet → removes duplicates but does not preserve insertion order.
                                                     //LinkedHashSet → removes duplicates and keeps the order in which you entered.
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter count of Roll Numbers: ");
	  int roll = sc.nextInt();
	  
	  for(int i=0;i<roll;i++){
	    System.out.println("Enter Roll numbers: " + (1 + i) + ":");
		int no = sc.nextInt();
		 RollNo.add(no);
	  }
	  System.out.println("Unique Roll Numbers: ");
	  Iterator<Integer> it = RollNo.iterator();
	  while(it.hasNext()){
	     System.out.println(it.next());
	
	  }
	  }
}