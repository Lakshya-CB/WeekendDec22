package Lec_32;

public class BTree {
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
		if(nn.left!=null) {
			str = str +nn.left.data;
		}
		str=str+"=>"+nn.data+"<=";
		if(nn.right!=null) {
			str = str +nn.right.data;
		}
		System.out.println(str);
		print(nn.left);
		print(nn.right);
	}

	public int size() {
		return size(root);

	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int sp1 = size(nn.left);
		int sp2 = size(nn.right);
		return sp1 + sp2 + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	int dia_ans = 0;

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}

		int sp1 = Ht(nn.left);
		int sp2 = Ht(nn.right);
		dia_ans = Math.max(dia_ans, 2 + sp1 + sp2);
		return Math.max(sp1, sp2) + 1;
	}

	public int Dia() {
		return Dia(root);
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int slef = 2 + Ht(nn.right) + Ht(nn.left);
		int sp1 = Dia(nn.left);
		int sp2 = Dia(nn.right);
		return Math.max(slef, Math.max(sp1, sp2));
	}

	class HtDiaPair {
		int Ht = -1;
		int Dia = 0;
	}

	private HtDiaPair Dia2(Node nn) {
		if (nn == null) {
			return new HtDiaPair();
		}
		HtDiaPair sp1 = Dia2(nn.left);
		HtDiaPair sp2 = Dia2(nn.right);

		HtDiaPair ans = new HtDiaPair();
		ans.Ht = Math.max(sp1.Ht, sp2.Ht) + 1;
		int slef = sp1.Ht + sp2.Ht + 2;
		ans.Dia = Math.max(slef, Math.max(sp1.Dia, sp2.Dia));
		return ans;
	}

	public int Dia2() {
		return Dia2(root).Dia;
	}

	int idx_p = 0;

	public BTree(int[] pre) {
		idx_p = 0;
		root = createPre(pre);
	}

	private Node createPre(int[] pre) {
		if (idx_p >= pre.length || pre[idx_p] == -1) {
			idx_p++;
			return null;
		}
		Node nn = new Node(pre[idx_p]);
		idx_p++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}
}
