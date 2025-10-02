import java.util.*;

class TextEditorUndoSystem{

     public static void main(String args[]){
	 
	 Stack<String> actions = new Stack<>();
	 
	 actions.push("Type A");
	 actions.push("Type B");
	 actions.push("Delete");
	 
	 System.out.println("Actions: " + actions);
	 System.out.println("Operation:  ");
	 actions.pop();
	 
	 System.out.println("Current actions: "+ actions);
	 
	 }
}