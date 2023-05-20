package Lec_36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BTree {
	class Node {
		public Node(int i) {
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

	public BTree(int[] pre, int[] in) {
		root = createPreIn(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node createPreIn(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe || is > ie) {
			return null;
		}
		Node nn = new Node(pre[ps]);

		int f = -1;
		int size_l = 0;
		for (int i = is; i <= ie; i++) {
			if (in[i] == pre[ps]) {
				f = i;
				break;
			}
			size_l++;
		}

		nn.left = createPreIn(pre, ps + 1, ps + size_l, in, is, f - 1);
		nn.right = createPreIn(pre, ps + size_l + 1, pe, in, f + 1, ie);

		return nn;
	}

	public void lvlPrint() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node curr = Q.poll();
			System.out.println(curr.data);
			if (curr.left != null) {
				Q.add(curr.left);
			}
			if (curr.right != null) {
				Q.add(curr.right);
			}
		}
	}

	public void lvlChange() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		int curr_lvl_size = Q.size();
		while (!Q.isEmpty()) {
			for (int count = 1; count <= curr_lvl_size; count++) {
				Node curr = Q.poll();
				System.out.println(curr.data);
				if (curr.left != null) {
					Q.add(curr.left);
				}
				if (curr.right != null) {
					Q.add(curr.right);
				}
			}
			curr_lvl_size = Q.size();
			System.out.println("chanage");
		}
	}

	public void lvlChange2() {
		Queue<Node> curr_Q = new LinkedList<>();
		curr_Q.add(root);
		Queue<Node> next_Q = new LinkedList<>();
		while (!curr_Q.isEmpty()) {
			Node curr = curr_Q.poll();
			System.out.println(curr.data);
			if (curr.left != null) {
				next_Q.add(curr.left);
			}
			if (curr.right != null) {
				next_Q.add(curr.right);
			}
			if (curr_Q.isEmpty()) {
				curr_Q = next_Q;
				next_Q = new LinkedList<>();
				System.out.println("chanage");
			}
		}

	}
	class pairV {
		public pairV(Node root, int i) {
			// TODO Auto-generated constructor stub
			nn= root;
			axis = i;
		}
		int axis;
		Node nn;
	}
	public void vertical() {
		HashMap<Integer,ArrayList<Integer>> HM = new HashMap<>();
		Queue<pairV> Q = new LinkedList<>();
		Q.add(new pairV(root,0));
		while(!Q.isEmpty()) {
			pairV curr = Q.poll();
			
			ArrayList<Integer> AL = 
					HM.getOrDefault(curr.axis,new ArrayList<>());
			AL.add(curr.nn.data);
			HM.put(curr.axis, AL);
			
			if(curr.nn.left!=null) {
				Q.add(new pairV(curr.nn.left,curr.axis-1));
			}
			if(curr.nn.right!=null) {
				Q.add(new pairV(curr.nn.right,curr.axis+1));
			}
		}
		System.out.println(HM);
	}
}
