package Lec_32_33;

public class BST {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void print() {
		print(root);
	}

	private void print(Node nn) { // pre order!!
		if (nn == null) {
			return;
		}
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + "=>" + nn.data + "<=";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);
		print(nn.left);
		print(nn.right);
	}

	public void add(int ali) {
		root = add(root, ali);
	}

	private Node add(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (nn.data < ali) {
			nn.right = add(nn.right, ali);
		} else {
			nn.left = add(nn.left, ali);
		}
		return nn;
	}

	public void remove(int ali) {
		root = remove(root, ali);
	}

	private Node remove(Node nn, int ali) {
		if (nn.data < ali) {
			nn.right = remove(nn.right, ali);
		} else if (nn.data > ali) {
			nn.left = remove(nn.left, ali);
		} else {
			if(nn.left == null && nn.right==null) {
				return null;
			}
			if(nn.left != null && nn.right==null) {
				return nn.left;
			}
			if(nn.left == null && nn.right!=null) {
				return nn.right;
			}
			nn.data = Max(nn.left);
			nn.left = remove(nn, nn.data);
		}
		return nn;
	}
}
