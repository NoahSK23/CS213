public class BTS_InClass {
	static Node root;

	class Node {

		Node parent;
		Node left;
		Node right;
		int key = 0;

		public Node() {

		}

		public Node(Node parent, Node left, Node right, int k) {

		}
	}

	public static void display() {
		if (isEmpty()) {
			System.out.println("Tree is empty");
			return;
		}
		Node temp = root;
		display(temp);
	}

	private static void display(Node temp) {
		if (temp == null) {
			return;
		}

		display(temp.left);
		System.out.println(temp.key + "->");
		display(temp.right);

	}

	public void insert(int k) {
		if (isEmpty()) {
			root = new Node(null, null, null, k);
			return;
		}
		Node temp = root;
		insert(temp, k);

	}

	private void insert(Node temp, int k) {
		if (temp.left == null && k < temp.key) {
			temp.left = new Node(temp, null, null, k);
			return;
		} else if (temp.right == null && k > temp.key) {
			temp.right = new Node(temp, null, null, k);
			return;
		}
	}

	private static boolean isEmpty() {
		return (root == null);
	}

	public static void find(int k) {
		if (isEmpty()) {
			System.out.println("Tree Empty");
			return;
		}
		Node temp = root;
		find(k, temp);
	}

	private static void find(int k, Node temp) {
		if (temp == null) {
			System.out.println("Key not found");
			return;
		} else if (temp.key == k) {
			System.out.println("Key was found");
			return;
		} else if (k < temp.key)
			find(k, temp.left);
		else
			find(k, temp.right);

	}

	public static void main(String[] args) {
		BTS_InClass tree = new BTS_InClass();

		tree.insert(50);
		tree.insert(60);

		display();
	}
}
