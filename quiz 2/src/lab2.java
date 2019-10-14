import java.util.Deque;
import java.util.LinkedList;

public class lab2 {

	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<Integer>();
		
		Add(d);
		System.out.println("This is your queue: " + d + "\nWe will remove Katherine and Tim");
		System.out.println("The initial size is: " + size(d));
		System.out.println("After the top and bottom elements are removed, there will be only 5");
		System.out.println(pollFirst(d));
		System.out.println(pollLast(d));
		System.out.println("The size of the queue is now: " + d + " with a size of: " + size(d));

	}
	
	public static Deque<Integer> Add(Deque<Integer> d) {
		d.add(4); // adds to queue
		d.addFirst(3); // adds to front
		d.addLast(5); // adds to end
		d.push(2); // add to head
		d.offer(6); // adds to queue
		d.offerFirst(1); // adds to front
		d.offerLast(7); // adds to back

		return d;
	}
	
	public static Deque<Integer> pollFirst(Deque<Integer> d) {
		System.out.println("\n" + "First element of the queue removed");
		d.pollFirst();
		return d;
	}

	public static Deque<Integer> pollLast(Deque<Integer> d) {
		System.out.println("\n" + "Last element of the queue removed");
		d.pollLast();
		return d;
	}

	public static int size(Deque<Integer> d) {
		int size = d.size();
		return size;
	}

	public static boolean isEmpty(Deque<Integer> d) {
		d.isEmpty();
		return d.isEmpty();
	}

	public static Integer head(Deque<Integer> d) {
		Integer head = d.peek();
		return head;
	}

	public static Integer tail(Deque<Integer> d) {
		Integer tail = d.peekLast();
		return tail;
	}

}
