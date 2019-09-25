import java.util.*;

public class deque {
	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<Integer>();
		d.add(4);
		d.addFirst(3);
		d.addLast(5);
		d.push(2);
		d.offer(6);
		d.offerFirst(1);
		d.offerLast(7);
		System.out.println("The deque is: " + d);
		System.out.print("\nDequeue using standard Iterator: ");
		Iterator<Integer> i = d.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		/*
		 * System.out.println("\n\nUsing peek, the element at head of the deque is: " +
		 * d.peek()); System.out.println("The deque after peek: " + d); System.out.
		 * println("\nUsing pop, the element removed from the head of the deque is: " +
		 * d.pop()); System.out.println("The deque after pop: " + d);
		 * System.out.println("\nDoes the deque contain element 8: " + d.contains("8"));
		 */
		d.removeFirst();
		d.removeLast();
		System.out.println("\nDeque after removing the first and last elements is: " + d);
	}
}

/*
 * display() void
 * isEmpty() boolean
 * push(k:int) void
 * pop() : int
 * peek() int
 * enque(k:int) void
 * deque():int
 */
