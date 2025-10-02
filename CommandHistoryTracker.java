import java.util.*;

class CommandHistoryTracker{

     public static void main(String args[]){
	 
	 Stack<String> commands = new Stack<>();
	 
	 // pushing commands into stack
        commands.push("ls");
        commands.push("pwd");
        commands.push("cd..");
        commands.push("mkdir");
        
        System.out.println("Commands: " + commands);
        System.out.println("History limit: 3 ");
	 
	  // maintain only last 3 commands
        while (commands.size() > 3) {
            commands.remove(0); // remove oldest (bottom of stack)
        }
        
        System.out.println("Recent Commands: " + commands);
	 }
   }
