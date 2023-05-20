package Lec_36;

public class Client_BT {
	public static void main(String[] args) {
		int[] pre = {10,20,40,50,30,60,100};
		int[] in = {40,20,50,10,30,100,60};
		BTree BT = new BTree(pre, in);
		BT.print();
		BT.vertical();
//		System.out.println(BT.isBal());
	}
}
