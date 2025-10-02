import java.util.*;

class EvenRollNumber{

     public static void main(String args[]){
	 
	 List<Integer> rollno = new ArrayList<>();
	 
	 rollno.add(101);
	 rollno.add(102);
	 rollno.add(103);
	 rollno.add(104);
	 
	 Iterator<Integer> it = rollno.iterator();
	 while(it.hasNext()){
	    int roll = it.next();
		if(roll % 2 != 0){
		   it.remove();
		} 
	 }
	 System.out.println("Even Roll Numbers: " + rollno);
	 
	 }
}

  
