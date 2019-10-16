import java.util.Deque;
import java.util.LinkedList;

public class lab2 {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<Integer>();
		
		Add(deque);
		if (isEmpty(deque)) {	// Checks if the queue is empty
			System.out.println("The queue is empty");
		}
		else {
		System.out.println("This is your queue: " + deque + "\nWe will remove 1 and 7");
		System.out.println("The initial size is: " + size(deque));
		System.out.println("After the top and bottom elements are removed, there will be only 5");
		System.out.println(pollFirst(deque));
		System.out.println(pollLast(deque));
		System.out.println("The size of the queue is now: " + deque + " with a size of: " + size(deque));
		}

	}
	
	public static Deque<Integer> Add(Deque<Integer> deque) {
		deque.add(4); // adds to deque
		deque.addFirst(3); // adds to front of the deque
		deque.addLast(5); // adds to end of the deque
		deque.push(2); // add to head of the deque
		deque.offer(6); // adds to deque
		deque.offerFirst(1); // adds number to the front of the deque
		deque.offerLast(7); //adds number to the back of the deque

		return deque;
	}
	
	public static Deque<Integer> pollFirst(Deque<Integer> deque) {
		System.out.println("\n" + "First element of the Deque removed");
		deque.pollFirst();
		return deque;
	}

	public static Deque<Integer> pollLast(Deque<Integer> deque) {
		System.out.println("\n" + "Last element of the Deque removed");
		deque.pollLast();
		return deque;
	}

	public static int size(Deque<Integer> deque) {
		int size = deque.size();
		return size;
	}

	public static boolean isEmpty(Deque<Integer> deque) {
		deque.isEmpty();
		return deque.isEmpty();
	}

	public static Integer head(Deque<Integer> deque) {
		Integer head = deque.peek();
		return head;
	}

	public static Integer tail(Deque<Integer> deque) {
		Integer tail = deque.peekLast();
		return tail;
	}

}
