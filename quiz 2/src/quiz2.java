import java.util.*;

public class quiz2 {
	public static void main(String args[]) {
		Stack<String> Stack = new Stack<String>();
		Stack.push("Noah");
		Stack.push("Ryan");
		Stack.push("Chris");
		Stack.push("Aqua");
		Stack.push("James");
		System.out.println("Stack: " + Stack);
		System.out.println("Top String in the Stack: " + Stack.peek());
		Stack.pop();
		Stack.pop();
		System.out.println("Removed top two element: " + Stack);
		System.out.println("Top element in the Stack: " + Stack.peek());
	}
}
