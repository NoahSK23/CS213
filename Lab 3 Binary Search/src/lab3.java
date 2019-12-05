public class lab3 {
	Node root;

	public void addNode(int key, int num) {
		Node newNode = new Node(key, num);

		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;

			while (true) {
				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.left;

					if (focusNode == null) {
						parent.left = newNode;
						return;
					}

				} else {
					focusNode = focusNode.right;

					if (focusNode == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public void inOrderTraverse(Node focusNode) {
		if (focusNode != null) {
			inOrderTraverse(focusNode.left);
			System.out.println(focusNode);
			inOrderTraverse(focusNode.right);

		}
	}

	public static void main(String[] args) {
		lab3 Tree = new lab3();

		Tree.addNode(10, 1);
		Tree.addNode(20, 2);
		Tree.addNode(30, 3);
		Tree.addNode(40, 4);
		Tree.addNode(50, 5);

		Tree.inOrderTraverse(Tree.root);

	}
}

class Node {
	int key;
	int num;

	Node left;
	Node right;

	Node(int key, int num) {
		this.key = key;
		this.num = num;
	}

	public String toString() {
		return num + "";

	}

}
