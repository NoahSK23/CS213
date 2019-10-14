import java.util.Deque;
import java.util.LinkedList;

public class felix {

	public static void main(String[] args) {
		Deque<String> d = new LinkedList<String>();

		Add(d);
		System.out.println("This is your Que: " + d);
		System.out.println("\n" + "The head of the Que is " + Head(d));
		System.out.println("The Tail of the Que is " + Tail(d));
		System.out.println("\n" + "The size of the Que at this point is " + Size(d));
		System.out.println(PollFirst(d));
		System.out.println(PollLast(d));
		System.out.println("\n" + "The size of the Que at this point is " + Size(d));
		System.out.println("\n" + "The Que is empty: " + IsEmpty(d));

	}

	public static Deque<String> Add(Deque<String> d) {
		d.add("Felix"); // adds to que
		d.addFirst("Brittany"); // adds to front
		d.addLast("Richard"); // adds to end
		d.push("Breanna"); // add to head
		d.offer("Yana"); // adds to que
		d.offerFirst("Nicole"); // adds to front
		d.offerLast("Nick"); // adds to back

		return d;
	}

	public static Deque<String> PollLast(Deque<String> d) {
		System.out.println("\n" + "Que with last element in the Que removed");
		d.pollLast();
		return d;
	}

	public static Deque<String> PollFirst(Deque<String> d) {
		System.out.println("\n" + "Que with First element in the Que removed");
		d.pollFirst();
		return d;
	}

	public static int Size(Deque<String> d) {
		int size = d.size();
		return size;
	}

	public static boolean IsEmpty(Deque<String> d) {
		d.isEmpty();
		return d.isEmpty();
	}

	public static String Head(Deque<String> d) {
		String head = d.peek();
		return head;
	}

	public static String Tail(Deque<String> d) {
		String tail = d.peekLast();
		return tail;
	}

}